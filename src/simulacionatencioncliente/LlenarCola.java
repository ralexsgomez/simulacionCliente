
package simulacionatencioncliente;

import java.awt.Dimension;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ralexs
 */
public class LlenarCola implements Runnable{
    
    private ArrayList<Cliente> colaCliente;
    private ArrayList<Cliente> colaClienteCurrent = new ArrayList<>();
    private JPanel contenedorClientes;
    private int cantidadUsuarios;
    private int numeroUsuariosIngresados = 0;
    private Calendar lastDate = Calendar.getInstance();
    static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    ImageIcon user = new ImageIcon(getClass().getResource("/img/user.jpeg"));
    Calendar fechaCierre = Calendar.getInstance();

    public LlenarCola(ArrayList<Cliente> colaCliente, JPanel contenedorClientes, int cantidadUsuarios) {
        this.colaCliente = colaCliente;
        this.contenedorClientes = contenedorClientes;
        this.cantidadUsuarios = cantidadUsuarios;
        fechaCierre.set(Calendar.MINUTE, 45);
        fechaCierre.set(Calendar.SECOND, 0);
        fechaCierre.set(Calendar.HOUR_OF_DAY, 16);
        
        //la hora que habre
        lastDate.set(Calendar.MINUTE, 0);
        lastDate.set(Calendar.SECOND, 0);
        lastDate.set(Calendar.HOUR_OF_DAY, 8);
    }
    

    @Override
    public void run() {
        try {
            while(fechaCierre.getTime().after(lastDate.getTime())) {
                System.out.println("ingresarrr");
               for (int i = 0; i < this.cantidadUsuarios; i++) {
                    Util util = new Util();
                    ConfigDatePoisson configDate = util.getTime(numeroUsuariosIngresados);
                    lastDate = configDate.tiempo;
                    Cliente cliente = new Cliente(configDate.tiempo , configDate.poisson);
                    System.out.println("onfigDate.tiempo");
                    System.out.println(sdf.format(configDate.tiempo.getTime()));
                    this.colaCliente.add(cliente);
                    JLabel jLabel = new JLabel("Cliente " + cliente.getId());
                    jLabel.setIcon(user);
                    cliente.setContenedorCliente(jLabel);
                    cliente.setContenedorColaEspera(contenedorClientes);
                    contenedorClientes.add(jLabel);
                    contenedorClientes.setSize(new Dimension(300, 300));
                    numeroUsuariosIngresados ++;
                    Thread.sleep(3000); 
                }
                Thread.sleep(2000);
                //recargar usuarios
                this.cantidadUsuarios = Util.getPoissonRange(5);
            }
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(LlenarCola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
