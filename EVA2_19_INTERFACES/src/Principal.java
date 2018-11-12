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
        /*Una interfaz no es una clase ni se le pueden crear objetos
        //Si se necesita transferir un método se usa una clase abstracta, si se 
        //Quiere transferir un comportamineto se utiliza una interfaz
        */
    }
    
}
class Caballo implements ComportamientoAnimal{

    @Override
    public void movimiento() {
        System.out.println("Galopar");
    }

    @Override
    public void Comer() {
        System.out.println("Comer pasto");
    }
    
}

interface ComportamientoAnimal{ //El metodo en una interfaz no puede tener cuerpo y tienen que ser abstracto
    public void movimiento();
    public void Comer();
}

