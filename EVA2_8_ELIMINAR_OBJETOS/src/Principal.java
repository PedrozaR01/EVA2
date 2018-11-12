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
        Test cObj = new Test();
        Test cCopia =cObj;
        cObj.iVal = 100;
        System.out.println(cObj.iVal);
        System.out.println(cObj);
        System.out.println(cCopia);
        cObj = new Test();
        System.out.println("Señor Slim, usted tiene: " + cObj.iVal);
        System.out.println(cObj);
        cObj = null;
        System.out.println(cObj);
        System.out.println("Pereme Sr. Slim, tiene: " + cCopia);
        
    }
    
}

class Test{
    int iVal;
}