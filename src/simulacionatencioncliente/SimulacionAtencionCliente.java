
package simulacionatencioncliente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class SimulacionAtencionCliente {
    
    private JPanel contenedorClientes;
    private JPanel contenedorDespacho;
    private DefaultTableModel modelo;
    private ArrayList<Cliente> clientesAtendidos = new ArrayList<>();
    private int cantidadUsuarios;

    public SimulacionAtencionCliente(JPanel contenedorClientes, JPanel contenedorDespacho, DefaultTableModel modelo, int cantidadUsuarios) {
        this.contenedorClientes = contenedorClientes;
        this.contenedorDespacho = contenedorDespacho;
        this.modelo = modelo;
        this.cantidadUsuarios = cantidadUsuarios;
    }

   
    public void iniciarCola() {
        Queue<Cliente> colaCliente = new LinkedList<>();
        LlenarCola llenar = new LlenarCola(colaCliente, contenedorClientes, cantidadUsuarios);
        Thread llegarClientes = new Thread(llenar);
        llegarClientes.start();
        //despachamos cada cliente()
        System.out.println("empezar a despachar");
        atenderCliente(colaCliente);
    }
    
    public void atenderCliente(Queue<Cliente> colaCliente){
         Despachador despachador = new Despachador(colaCliente, contenedorDespacho, modelo);
         Thread despacharClientes = new Thread(despachador);
         despacharClientes.start();
    }

}
