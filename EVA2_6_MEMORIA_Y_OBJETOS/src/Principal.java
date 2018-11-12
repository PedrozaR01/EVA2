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
        Prueba cObj = new Prueba();
        cObj.iVal = 100;
        System.out.println("El valor es: " + cObj.iVal);
        //Copia
        int iAlgo = 70;
        int iCopia = iAlgo;
        System.out.println("iAlgo= " + iAlgo);
        System.out.println("iCopia= " + iCopia);
        iAlgo = 1000;
        System.out.println("iAlgo= " + iAlgo);
        System.out.println("iCopia= " + iCopia);
        
    //Copia del objeto
        //REFERENCIAS: Variable que guarda la direccion del objeto en memoria 
        //Apuntadores
        Prueba cCopiaObj = cObj;
        System.out.println("El valor es: " + cObj.iVal);
        System.out.println("El valor de la copia  es: " + cCopiaObj);
        cObj.iVal = -1;
        System.out.println("El valor es: " + cObj.iVal);
        System.out.println("El valor de la copia es: " + cCopiaObj);
    }
    
}

class Prueba {
    int iVal; //4 BYTES
}