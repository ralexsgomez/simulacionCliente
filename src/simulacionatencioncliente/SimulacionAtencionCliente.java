
package simulacionatencioncliente;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class SimulacionAtencionCliente {
    
    private JPanel contenedorClientes;
    private JPanel contenedorServidorCola2;
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;
    private ArrayList<Cliente> clientesAtendidos = new ArrayList<>();
    private ArrayList<Cliente> clientesDespachados = new ArrayList<>();
    private int cantidadUsuarios;
    
    private ArrayList<Servidor> servidoresSala1;
    private ArrayList<Servidor> servidoresSala2;
    private ArrayList<Servidor> servidoresSala3;
    private ArrayList<Servidor> servidoresSala4;
    
    //para el pasillo 3
    private JPanel contenedorServidorCola3;
    private DefaultTableModel modelo3;
    
    
        //para el pasillo 4
    private JPanel contenedorServidorCola4;
    private JPanel contenedorDespacho8;
    private DefaultTableModel modelo4;
    

//    public SimulacionAtencionCliente(JPanel contenedorClientes, JPanel contenedorDespacho, DefaultTableModel modelo, int cantidadUsuarios) {
//        this.contenedorClientes = contenedorClientes;
//        this.contenedorDespacho = contenedorDespacho;
//        this.modelo = modelo;
//        this.cantidadUsuarios = cantidadUsuarios;
//    }
    
    public SimulacionAtencionCliente(JPanel contenedorClientes, ArrayList<Servidor> servidoresSala1, DefaultTableModel modelo, int cantidadUsuarios) {
        this.contenedorClientes = contenedorClientes;
        this.servidoresSala1 = servidoresSala1;
        this.modelo = modelo;
        this.cantidadUsuarios = cantidadUsuarios;
    }
    
   //cargar los componentes de la vista para el depachador 2
//    public void addContenedorColaServidor2(JPanel contenedorServidorCola2, JPanel contenedorDespacho2, JPanel contenedorDespacho3, DefaultTableModel modelo2){
//       this.contenedorServidorCola2 = contenedorServidorCola2;
//       this.contenedorDespacho2 = contenedorDespacho2;
//       this.contenedorDespacho3 = contenedorDespacho3;
//       this.modelo2 = modelo2;
//    }
    
     public void addContenedorColaServidor2(JPanel contenedorServidorCola2, ArrayList<Servidor> servidoresSala2, DefaultTableModel modelo2){
       this.contenedorServidorCola2 = contenedorServidorCola2;
       this.servidoresSala2 = servidoresSala2;
//       this.contenedorDespacho2 = contenedorDespacho2;
//       this.contenedorDespacho3 = contenedorDespacho3;
       this.modelo2 = modelo2;
    }
    
       //cargar los componentes de la vista para el pasillo 3
    public void addContenedorColaServidor3(JPanel contenedorServidorCola3, ArrayList<Servidor> servidoresSala3, DefaultTableModel modelo3){
       this.contenedorServidorCola3 = contenedorServidorCola3;
       this.servidoresSala3 = servidoresSala3;
       this.modelo3 = modelo3;
    }
           //cargar los componentes de la vista para el pasillo 4
    public void addContenedorColaServidor4(JPanel contenedorServidorCola4, ArrayList<Servidor> servidoresSala4, DefaultTableModel modelo4){
       this.contenedorServidorCola4 = contenedorServidorCola4;
       this.servidoresSala4 = servidoresSala4;
       this.modelo4 = modelo4;
    }

    public void iniciarCola() {
        ArrayList<Cliente> colaCliente = new ArrayList();
        LlenarCola llenar = new LlenarCola(colaCliente, contenedorClientes, cantidadUsuarios);
        Thread llegarClientes = new Thread(llenar);
        llegarClientes.start();

        //despachamos cada cliente()
        System.out.println("empezar a despachar");
        atenderCliente(colaCliente);
    }

    public void atenderCliente(ArrayList<Cliente> colaCliente){
         ArrayList<Cliente> colaClienteServidor2 = new ArrayList();//cola de despachados del servidor 2
         int tiempoServidor = 2; //tiempo promedio del servidor
         
         //recorrer la cantidad de servidores para atender
         for (Servidor servidor : servidoresSala1) {
            Despachador despachador = new Despachador(colaCliente, colaClienteServidor2, servidor.getConstendorDespacho(), modelo, tiempoServidor);
            Thread despacharClientes = new Thread(despachador);
            despacharClientes.start();   
         }
         
         moverColaEspera2(colaClienteServidor2);
    }
    
    public void moverColaEspera2(ArrayList<Cliente> colaClienteServidor2) {
        ArrayList<Cliente> colaClienteListosServidor2 = new ArrayList();
        LLenarColaServidor llenar = new LLenarColaServidor(colaClienteServidor2, colaClienteListosServidor2, contenedorServidorCola2);
        Thread llegarClientes = new Thread(llenar);
        llegarClientes.start();
        
        //clientes despachados del pasillo 2 
        ArrayList<Cliente> colaClienteDespachadosPasillo2 = new ArrayList();
            //depachar de la cola 2
        atenderClienteServidor2(colaClienteListosServidor2, colaClienteDespachadosPasillo2);
        //cola de los usuarios despachados del pasillo 2
        //inicializar espera para los servidores del pasillo 3
        moverColaEspera3(colaClienteDespachadosPasillo2);
        
    }
    
    public void moverColaEspera3(ArrayList<Cliente> colaClienteServidor2) {
        ArrayList<Cliente> colaClienteListosServidor2 = new ArrayList();
        LLenarColaServidor llenar = new LLenarColaServidor(colaClienteServidor2, colaClienteListosServidor2, contenedorServidorCola3);
        Thread llegarClientes = new Thread(llenar);
        llegarClientes.start();
        
        //inicializar espera para los servidores del pasillo 3
        ArrayList<Cliente> colaClienteDespachadosPasillo3 = new ArrayList();
        atenderClienteServidor3(colaClienteListosServidor2, colaClienteDespachadosPasillo3);
        
        moverColaEspera4(colaClienteDespachadosPasillo3);
        
    }
    
    
    public void moverColaEspera4(ArrayList<Cliente> colaClienteServidor2) {
        ArrayList<Cliente> colaClienteListosServidor2 = new ArrayList();
        LLenarColaServidor llenar = new LLenarColaServidor(colaClienteServidor2, colaClienteListosServidor2, contenedorServidorCola4);
        Thread llegarClientes = new Thread(llenar);
        llegarClientes.start();
        
        //inicializar espera para los servidores del pasillo 3
        ArrayList<Cliente> colaClienteDespachadosPasillo4 = new ArrayList();
        atenderClienteServidor4(colaClienteListosServidor2, colaClienteDespachadosPasillo4);
        
    }

    //despachador de la cola 2 al servidor 2
    
    public void atenderClienteServidor2(ArrayList<Cliente> colaClienteServidor2, ArrayList<Cliente> colaClienteDespachados){
         int tiempoServidor = 4; //tiempo promedio del servidor
         
         for (Servidor servidor : servidoresSala2) {
            Despachador despachador = new Despachador(colaClienteServidor2, colaClienteDespachados, servidor.getConstendorDespacho(), modelo2, tiempoServidor);
            Thread despacharClientes = new Thread(despachador);
            despacharClientes.start();   
         }
    }
    
    //tercer pasillo
    //despachador del pasillo 2 al pasillo 3
    public void atenderClienteServidor3(ArrayList<Cliente> colaClienteServidor3, ArrayList<Cliente> colaClienteDespachados){
         int tiempoServidor = 5; //tiempo promedio del servidor
          for (Servidor servidor : servidoresSala3) {
            Despachador despachador = new Despachador(colaClienteServidor3, colaClienteDespachados, servidor.getConstendorDespacho(), modelo3, tiempoServidor);
            Thread despacharClientes = new Thread(despachador);
            despacharClientes.start();   
         }
    }
    
    public void atenderClienteServidor4(ArrayList<Cliente> colaClienteServidor4, ArrayList<Cliente> colaClienteDespachados){
         int tiempoServidor = 7; //tiempo promedio del servidor
         for (Servidor servidor : servidoresSala4) {
            Despachador despachador = new Despachador(colaClienteServidor4, colaClienteDespachados, servidor.getConstendorDespacho(), modelo4, tiempoServidor);
            Thread despacharClientes = new Thread(despachador);
            despacharClientes.start();   
         }
    }
        
        
    
    
}
