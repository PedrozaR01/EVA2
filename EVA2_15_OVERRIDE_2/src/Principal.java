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
        Animal aAni = new Animal();
        aAni.movimiento();
        Caballo cHorse = new Caballo();
        cHorse.movimiento();
        Ostra oOst = new Ostra();
        oOst.movimiento();
    }
    
}
class Caballo extends Animal{
    @Override //Sustituye el comportamiento de la clase base con uno propio
              //de la subclase
    public void movimiento(){
        System.out.println("Galopar");
    }
}
class Animal {
    public void movimiento(){
        System.out.println("Movimiento indefinido");
    }
}
class Ostra extends Animal { //Usa el comportamiento de la clase base
                             //Ya que no usa un OVERRIDE   
    
}