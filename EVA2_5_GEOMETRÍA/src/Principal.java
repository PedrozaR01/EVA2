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
        System.out.println("El área de un cuadrado de 100 por 100 es: "
                + Geometria.CalAreCuadrado(100));
        Geometria cObt = new Geometria();    //No se puede utilizar el método CalAreCuadrador a través del objeto
                                             //Eso debido aque son estáticos   
    }
    
}

class Geometria {
    //Constante estática llamada PI
    static final double PI = 3.14159;
    /*Lo métodos estáticos existen desde que el programa
    inicia, y solamente se pueden usar a través de la clase a la que pertenecen
    NO SON INSTANCIABLES*/
    /* SON ÚTILES para crear librerías de constantes y
    funciones, para usarlas sin crear objetos*/
    public static double CalAreCuadrado (double dLado) {
        return (dLado*dLado);
    }
    //AGREGAR 10 FUNCIONES DE CÁLCULO DE ÁREA
}
