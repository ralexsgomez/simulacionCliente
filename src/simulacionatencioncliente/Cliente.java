
package simulacionatencioncliente;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static simulacionatencioncliente.Util.tiemposLLegada;

public class Cliente {
    private int id = new Random().nextInt(10000);
    private Calendar tiempollegada;
    private long tiempoEspera;//segundos
    private int tiempoAtención;
    private int aletorioLLegada;
    private JLabel contenedorCliente;
    private JPanel contenedorColaEspera;
    private Calendar timepoTotal;
    static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    public Cliente(Calendar tiempollegada, int aletorioLLegada) {
        this.tiempollegada = tiempollegada;
        this.aletorioLLegada = aletorioLLegada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Calendar getTiempollegada() {
        return tiempollegada;
    }
    
    public String getTiempollegadaString() {
        return sdf.format(tiempollegada.getTime());
    }

    public void setTiempollegada(Calendar tiempollegada) {
        this.tiempollegada = tiempollegada;
    }

    public long getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(long tiempoEspera) {
        this.tiempoEspera = Math.abs(tiempoEspera);
    }

    public int getTiempoAtención() {
        return tiempoAtención;
    }

    public void setTiempoAtención(int tiempoAtención) {
        this.tiempoAtención = tiempoAtención;
        this.timepoTotal = (Calendar) this.tiempollegada.clone();
        //tiempo total es igual al tiempo de llegada + tiempo de atemcion + tiempo espera
        this.timepoTotal.add(Calendar.MINUTE, (tiempoAtención + (int)tiempoEspera));
    }

    public JLabel getContenedorCliente() {
        return contenedorCliente;
    }

    public void setContenedorCliente(JLabel contenedorCliente) {
        this.contenedorCliente = contenedorCliente;
    }

    public JPanel getContenedorColaEspera() {
        return contenedorColaEspera;
    }

    public void setContenedorColaEspera(JPanel contenedorColaEspera) {
        this.contenedorColaEspera = contenedorColaEspera;
    }

    public Calendar getTimepoTotal() {
        return timepoTotal;
    }
    
    public String getTimepoTotalString() {
        return sdf.format(timepoTotal.getTime());
    }

    public int getAletorioLLegada() {
        return aletorioLLegada;
    }

    public void setAletorioLLegada(int aletorioLLegada) {
        this.aletorioLLegada = aletorioLLegada;
    }
    
    public Calendar getTime(int minutes, int HOUR_OF_DAY){
        Calendar now = Calendar.getInstance();
        now.set(Calendar.MINUTE, minutes);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.HOUR_OF_DAY, 8);
        return now;
    }
      @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", tiempollegada=" + tiempollegada + ", tiempoEspera=" + tiempoEspera + " segundos"+ ", tiempoAtencion=" + tiempoAtención + '}';
    }
    
    public String toStringId() {
        return "Cliente" +id;
    }
}
