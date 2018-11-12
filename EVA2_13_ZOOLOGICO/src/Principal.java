
import Zoologico.Animales;
import Zoologico.Reproduccion;

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
        Animales elefante = new Animales(); // Instanciación de un objeto de tipo animales
        elefante.setExtremidades(4); // Asignación de extremidades al elefante
        elefante.setMovimiento(true); // Asignación de movimiento al elefante
        elefante.setOjos(2); // Asignación del número de ojos del elefante
        elefante.setReproduccion(Reproduccion.VIVIPARO); // Asignación del tipo de reproducción del elefante
         // Impresión de los datos
        System.out.println("Número de extremidades de un elefante: " + elefante.getExtremidades());
        System.out.println("El elefante tiene " + elefante.getOjos() + " ojos");
        System.out.println("El elefante es " + elefante.getReproduccion());
        
    }
    
}
