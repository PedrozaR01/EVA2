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
        //Las clases abstractas solo sirven como base para la herencia 
        //No sirve para crear objetos
        Ostra oPalCocktail = new Ostra();
        oPalCocktail.movimiento();
    }
    
}
final class Ostra extends Animal{ ///Esta clase heredó el comportamiento de la clase 
}                           //Animal, sin embargo si se puede crer objetos de esta subclase 
abstract class Animal {
   public void movimiento(){
       System.out.println("Movimiento indefinido");
   }
}
/*
Se puede limitar la herencia con la palabra reservada FINAL
De esta forma la clase Final no puede ser usada para herencia
*/