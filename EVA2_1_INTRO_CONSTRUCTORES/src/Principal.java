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
        Principal ObjtP = new Principal();
        Prueba ObjPru = new Prueba();
        System.out.println(ObjPru.X);
    }
    
}
class Prueba {
    int X;
    public Prueba() { 
    //Constructor. Sirve para inicializar la clase
    X = 100;
    }
    
}