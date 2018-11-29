
package simulacionatencioncliente;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Despachador implements Runnable{

    private ArrayList<Cliente> colaCliente;
    private ArrayList<Cliente> colaClienteDespachados;
    private JPanel contenedorDespacho;
    private DefaultTableModel modelo;
    private ArrayList<Cliente> clienteAnterior = new ArrayList<>();
    static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private int tiempoServidor;

    public Despachador(ArrayList<Cliente> colaCliente, ArrayList<Cliente> colaClienteDespachados, JPanel contenedorDespacho, DefaultTableModel modelo, int tiempoServidor) {
        this.colaCliente = colaCliente;
        this.colaClienteDespachados = colaClienteDespachados;
        this.contenedorDespacho = contenedorDespacho;
        this.modelo = modelo;
        this.tiempoServidor = tiempoServidor;
    }

    @Override
    public void run() {
        try {
            while(true){
                synchronized (colaCliente) {
                    if(!colaCliente.isEmpty()){
                    
                    Cliente cliente = colaCliente.get(0);
                    cliente.setTiempoEspera(0);//set default tiempo de espera
                    
                    if (clienteAnterior.size() > 0){
                        Calendar tiempoUsuarioAnterior = clienteAnterior.get(0).getTimepoTotal();
                        Calendar tiempoUsuarioActual = cliente.getTiempollegada();
                        if (tiempoUsuarioActual.after(tiempoUsuarioAnterior)) {
                            cliente.setTiempoEspera(0);
                        } else {
                           long minutes = ChronoUnit.MINUTES.between(tiempoUsuarioAnterior.toInstant(), tiempoUsuarioActual.toInstant());
                           cliente.setTiempoEspera(minutes);//set tiempo de espera
                        }
                        clienteAnterior.remove(0);
                        //cliente que se demoro en la cola es igual al tiempo total del primer cliente
                        // menos el tiempo de llegada del segundo cliente
                    }
                    clienteAnterior.add(cliente);
                    
                    
                    //agregar cliente al servidor
                    this.contenedorDespacho.add(cliente.getContenedorCliente());
                    this.contenedorDespacho.repaint();
                    
                    //tiempo que se demora el servidor
                    cliente.setTiempoAtención(Util.getPoissonRange(tiempoServidor));
                    
                    cliente.getContenedorColaEspera().remove(cliente.getContenedorCliente());
                    cliente.getContenedorColaEspera().setSize(new Dimension(300, 300));
                    
                    //tiempo que demora en el servidor
                    Object data[] = {
                                     cliente.getId(),
                                     cliente.getAletorioLLegada(),
                                     cliente.getTiempollegadaString(),
                                     cliente.getTiempoEspera(),
                                     cliente.getTiempoAtención(),
                                     cliente.getTimepoTotalString()
                                    };
                    this.modelo.addRow(data);
                    //agregar cliente a la cola del servidor 2
                    this.colaClienteDespachados.add(cliente);
                    colaCliente.remove(cliente);
                    colaCliente.wait(cliente.getTiempoAtención() * 1000);
                    this.contenedorDespacho.removeAll();
                    this.contenedorDespacho.repaint();
                }
                    else {
                        colaCliente.wait(2000);
                    }
                }
       
//                Thread.sleep(2000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(LlenarCola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
