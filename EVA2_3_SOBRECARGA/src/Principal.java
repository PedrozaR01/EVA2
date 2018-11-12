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
        Operaciones Sum = new Operaciones();
        System.out.println("La suma de 5+7 es: " + Sum.Suma(5, 7));
        System.out.println("La suma de Juan y Pérez es: " + Sum.Suma("Juan", "Pérez"));
        System.out.println("true AND false es: " + Sum.Suma(true, false));
    }
    
}

class   Operaciones{
    public int Suma(int Val1, int Val2){
        return Val1 + Val2;
    } 
    public String Suma(String Val1, String Val2){
        return Val1 + Val2; //Concatenación
    }
    public boolean Suma(boolean Val1, boolean Val2){
        return Val1 && Val2; //AND (Lógica)
    }
}