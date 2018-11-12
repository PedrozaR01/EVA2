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
        Mamifero mMam = new Mamifero();
        Mamifero mJiraf = new Mamifero("Pararse");
    }
    
}
class Mamifero extends Animal{//SUB CLASE HEREDANDO DE LA CLASE BASE
    public Mamifero (){ //LO PRIMERO QUE HACE ES LLAMAR AL CONSTRUCTOR 
                        //DE LA CLASE BASE
    super();                    
    } 
    public Mamifero (String accion){
        super(accion);
        System.out.println("Y salir corriendo");
    }
}

class Animal {//CLASE BASE
    public Animal(){
        System.out.println("Respira");
}
    public Animal (String accion){
        System.out.println("Respirar y " + accion);
    }
}