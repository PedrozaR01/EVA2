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
int Val = 10;
public Principal(){
    Val = 100;
}
    /**
     * @param args the command line arguments
     */
static String sMess = "Hola";
    public static void main(String[] args) {
        // TODO code application logic here
        Principal cObj = new Principal();
        cObj.Imprimir();
        cObj.Imprimir2(10000);
        String sMess = "Nada de Hola";
        System.out.println(sMess);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        for (int i = 0; i < 10; i++) {
            
        }
    }

    public void Imprimir(){
    System.out.println("Valor = " + Val);
}    
public void Imprimir2(int Val){
    System.out.println("Valor = " + Val);
    System.out.println("Valor del atributo = " + this.Val);
}    
}
//THIS es una palabra reservada, se usa para acceder a los miembros de la clase
//Apuntador a la instancioa de la clase
//Cuando una variable queda oculta, se puede acceder a ella por la palabra this