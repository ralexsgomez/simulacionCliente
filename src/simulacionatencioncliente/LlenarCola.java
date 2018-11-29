
package simulacionatencioncliente;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Calendar;
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
    ImageIcon user = new ImageIcon(getClass().getResource("/img/user.jpeg"));

    public LlenarCola(ArrayList<Cliente> colaCliente, JPanel contenedorClientes, int cantidadUsuarios) {
        this.colaCliente = colaCliente;
        this.contenedorClientes = contenedorClientes;
        this.cantidadUsuarios = cantidadUsuarios;
    }
    

    @Override
    public void run() {
        try {
            for (int i = 0; i < this.cantidadUsuarios; i++) {
                Util util = new Util();
                ConfigDatePoisson configDate = util.getTime(i);
                Cliente cliente = new Cliente(configDate.tiempo , configDate.poisson);
                this.colaCliente.add(cliente);
                JLabel jLabel = new JLabel("Cliente " + cliente.getId());
                jLabel.setIcon(user);
                cliente.setContenedorCliente(jLabel);
                cliente.setContenedorColaEspera(contenedorClientes);
                contenedorClientes.add(jLabel);
                contenedorClientes.setSize(new Dimension(300, 300));
                Thread.sleep(3000); 
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(LlenarCola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
