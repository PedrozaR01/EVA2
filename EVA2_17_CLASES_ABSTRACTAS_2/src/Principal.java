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
        Caballo cHorse = new Caballo();
        cHorse.movimiento();
    }
    
}
class Caballo extends Animal{//Si se pueden crear objetos de esta clase que hereda de la clase abstracta
    @Override//Sobreescribe el método de la clase base
    public void movimiento(){
        super.movimiento();//Super puede llamar a metodos de la clase superior o base
        System.out.println("Galopar"); //a pesar de haberlos sobreescrito
    }
}
class AnimalTrabajo{
    
}

abstract class Animal {//Clase abstracta, no se pueden crear objetos de esta clase
  public void movimiento() {
      System.out.println("Algún tipo de movimiento");
    }  
}