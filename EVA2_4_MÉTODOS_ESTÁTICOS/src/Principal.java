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
        //Operaciones Obj = new Operaciones();
        System.out.println("Hola" + Operaciones.Val);
        System.out.println(Math.cos(50));
    }
    
}

class   Operaciones{
    static int Val = 100;//El static nos deja utilizar valores y métodos de una clase sin crear un objeto
    public static int Suma(int Val1, int Val2){
        return Val1 + Val2;//Sume Aritmética
    } 
    public static String Suma(String Val1, String Val2){
        return Val1 + Val2; //Concatenación
    }
    public static boolean Suma(boolean Val1, boolean Val2){
        return Val1 && Val2; //AND (Lógica)
    }
}