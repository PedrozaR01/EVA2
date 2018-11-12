
import MisVehiculos.Vehículo;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Pedroza
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehículo vCarro = new Vehículo();
        vCarro.Vehículo();
        vCarro.ImprimirDatos();
        //Verificamos si el auto está encendido
        if(!vCarro.isCarisOn()){//Si no está prendido
            vCarro.prender();//Lo arrancamos
        }
        vCarro.acelerar();
        System.out.println("Vas a Fabulosos " + vCarro.getVelocidad() + " Km/H");
        Aceleracion();
    }
  
public static void Aceleracion(){
    Vehículo vCarro1 = new Vehículo();
    vCarro1.Vehículo();
    Scanner Inpt = new Scanner(System.in);
    System.out.println("A qué velocidad vas?");
    int Vel = 0;
    Inpt.nextInt(Vel);
    
    System.out.println("A qué velocidad quieres llegar? Da una velocidad múltiplo de 10 ");
    int Vel1 = 0; 
    Inpt.nextInt(Vel1);
    
    if (Vel>Vel1){
        for (int i = Vel1; i < Vel; i++) {
        vCarro1.acelerar();    
        }
           
        
    }
}
}
