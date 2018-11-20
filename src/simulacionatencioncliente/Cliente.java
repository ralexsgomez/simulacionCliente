
package simulacionatencioncliente;

import java.util.Date;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cliente {
    private int id = new Random().nextInt(10000);
    private Date tiempollegada;
    private long tiempoEspera;//segundos
    private int tiempoAtención;
    private JLabel contenedorCliente;
    private JPanel contenedorColaEspera;

    public Cliente() {
        this.tiempollegada = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Date getTiempollegada() {
        return tiempollegada;
    }

    public void setTiempollegada(Date tiempollegada) {
        this.tiempollegada = tiempollegada;
    }

    public long getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(long tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public int getTiempoAtención() {
        return tiempoAtención;
    }

    public void setTiempoAtención(int tiempoAtención) {
        this.tiempoAtención = tiempoAtención;
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

    
      @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", tiempollegada=" + tiempollegada + ", tiempoEspera=" + tiempoEspera + " segundos"+ ", tiempoAtencion=" + tiempoAtención + '}';
    }
    
    public String toStringId() {
        return "Cliente" +id;
    }
}
