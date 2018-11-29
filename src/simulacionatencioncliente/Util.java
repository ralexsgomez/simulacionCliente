/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionatencioncliente;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Util {
    private Date horaFin;
    static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    public static ArrayList<Calendar> tiemposLLegada = new ArrayList<>();
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<String> otralista= new ArrayList<>();
    
    public static void main(String[] args) {
        Util m = new Util();
//        int n = 0;
        for (int i = 0; i < 10; i++){
//            n = getPoissonRange(5); //con una media de 60
//            System.out.println("n >>> " + n);
//            System.out.println(sdf.format(m.getTime(i).getTime()));
                ConfigDatePoisson configDate = m.getTime(i);
                Calendar now = Calendar.getInstance();
                now.set(Calendar.MINUTE, getPoisson(i));
                now.set(Calendar.SECOND, 0);
                now.set(Calendar.HOUR_OF_DAY, 8);
        
                Cliente cliente = new Cliente(now, configDate.poisson);
//                Cliente client = Cliente.class
                System.out.println("usuario agregar "+ cliente.getAletorioLLegada());
                clientes.add(cliente);
        }
            System.out.println(">>>>>>>");
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println("usuario agregar "+ clientes.get(i).getTiempollegadaString());
//                System.out.println("usuario agregar "+ otralista.get(i));
        }

               
    }
    

    public ConfigDatePoisson getTime(int i) {
        int poisson = getPoisson(4); // el numero aletorio parala llegada de los usuarios
        if (tiemposLLegada.size() > 0){
            Calendar newDate = (Calendar) tiemposLLegada.get(i - 1).clone();
            newDate.add(Calendar.MINUTE, poisson);
//            System.out.println(sdf.format(newDate.getTime()));
            tiemposLLegada.add(newDate);
            ConfigDatePoisson configDatePoisson = new ConfigDatePoisson();
            configDatePoisson.tiempo = newDate;
            configDatePoisson.poisson = poisson;
            return configDatePoisson;
        }
        Calendar now = Calendar.getInstance();
        now.set(Calendar.MINUTE, poisson);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.HOUR_OF_DAY, 8);
        tiemposLLegada.add(now);
//        System.out.println(sdf.format(now.getTime()));
//        System.out.println("ightNow.get(Calendar.HOUR_OF_DAY) " + now.get(Calendar.HOUR_OF_DAY));
         ConfigDatePoisson configDatePoisson = new ConfigDatePoisson();
         configDatePoisson.tiempo = now;
         configDatePoisson.poisson = poisson;
        return configDatePoisson;
    }
    
    public static int getPoisson (double lambda){
        double L = Math.exp(-lambda);
        double p = 1.0;
        int k = 0;
        do{
            k++;
            p *= Math.random();
        } while (p > L);
        return k-1;
    }
    public static int getPoissonRange (double lambda){
        int number = 0;
            while (number == 0 || number > lambda) {
                number = getPoisson(lambda);
            }
        return number;
    }
    
    public static double getPoissonByClient (double lambda){
        return (-(Math.log(1 - new Random().nextDouble())) * (1 / lambda) * 60);
    }

}

