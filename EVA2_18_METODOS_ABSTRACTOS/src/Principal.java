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
        Caballo HolHorse = new Caballo();
        HolHorse.Comer();
        HolHorse.movimiento();
        
        Avestruz CorreCaminos = new Avestruz();
        CorreCaminos.Comer();
        CorreCaminos.movimiento();
    }
    
}
class Avestruz extends Animal{

    @Override
    public void movimiento() {
        System.out.println("Corre a madre!!");
    }

    @Override
    public void Comer() {
        System.out.println("Turistas en el serengueti");
    }
    
}

class Caballo extends Animal{//2.La clase tiene que sobreescribir al método abstracto de la clase abstracta

    @Override
    public void movimiento() {
        System.out.println("Galopar");
    }
    
    @Override
    public void Comer(){
        System.out.println("Comer");
    }
    
}

abstract class Animal{//Toda clase que derive de esta tiene que implementar el mismo método
   abstract public void movimiento();//1.Método abstracto sin un cuerpo o comportamiento
   abstract public void Comer();      
}                                     
                                        