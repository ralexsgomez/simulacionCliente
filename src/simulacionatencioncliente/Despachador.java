
package simulacionatencioncliente;

import java.awt.Dimension;
import java.time.LocalDate;
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

    private Queue<Cliente> colaCliente;
    private JPanel contenedorDespacho;
    private DefaultTableModel modelo;

    public Despachador(Queue<Cliente> colaCliente, JPanel contenedorDespacho, DefaultTableModel modelo) {
        this.colaCliente = colaCliente;
        this.contenedorDespacho = contenedorDespacho;
        this.modelo = modelo;
    }

    @Override
    public void run() {
        try {
            System.out.println("Cliente  ");
            while(true){
                if(!colaCliente.isEmpty()){
                    Cliente cliente = colaCliente.poll();
                    //agregar cliente al servidor
                    this.contenedorDespacho.add(cliente.getContenedorCliente());
                    this.contenedorDespacho.repaint();
                    cliente.setTiempoEspera(getDateDiff(cliente.getTiempollegada(), new Date(), TimeUnit.SECONDS));
                    cliente.setTiempoAtención(getRandomNumberInRange(3, 10));
                    System.out.println("cliente " + cliente.toString());
                    cliente.getContenedorColaEspera().remove(cliente.getContenedorCliente());
                    cliente.getContenedorColaEspera().setSize(new Dimension(300, 300));
                    
                    //tiempo que demora en el servidor
                    Thread.sleep(cliente.getTiempoAtención() * 1000);
                    //eliminar usuario del servidor
                    this.contenedorDespacho.removeAll();
                    this.contenedorDespacho.repaint();
                    Object data[] = {cliente.getId(), cliente.getTiempollegada(), cliente.getTiempoEspera(), cliente.getTiempoAtención()};
                    this.modelo.addRow(data);
                }
                Thread.sleep(2000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(LlenarCola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static int getRandomNumberInRange(int min, int max) {

            if (min >= max) {
                    throw new IllegalArgumentException("max must be greater than min");
            }

            Random r = new Random();
            return r.nextInt((max - min) + 1) + min;
    }
    
    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }
    
}
