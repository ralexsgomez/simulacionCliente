/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionatencioncliente;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ralexs
 */
public class LLenarColaServidor implements Runnable{
    
    private ArrayList<Cliente> colaCliente;
    private ArrayList<Cliente> colaClienteListosServidor2;
    private JPanel contenedorClientes;
    ImageIcon user = new ImageIcon(getClass().getResource("/img/user.jpeg"));

    public LLenarColaServidor(ArrayList<Cliente> colaCliente, ArrayList<Cliente> colaClienteListosServidor2, JPanel contenedorClientes) {
        this.colaCliente = colaCliente;
        this.contenedorClientes = contenedorClientes;
        this.colaClienteListosServidor2 = colaClienteListosServidor2;
    }
    

    @Override
    public void run() {
        try {
            
            while(true){
                if(!colaCliente.isEmpty()){
                    
                    Cliente cliente = colaCliente.get(0);
                    cliente.setTiempollegada(cliente.getTimepoTotal());
                    
                    JLabel jLabel = new JLabel("Cliente " + cliente.getId());
                    jLabel.setIcon(user);
                    cliente.setContenedorCliente(jLabel);
                    cliente.setContenedorColaEspera(contenedorClientes);
                    contenedorClientes.add(jLabel);
                    contenedorClientes.setSize(new Dimension(300, 300));
                    contenedorClientes.repaint();
                    System.out.println("cliente agregado " + cliente.getId());
                    this.colaClienteListosServidor2.add(cliente);
                    colaCliente.remove(cliente);
                }
                Thread.sleep(1000);
            }
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(LlenarCola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
