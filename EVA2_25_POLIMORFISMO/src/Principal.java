
import Vehiculos.Automóvil;
import Vehiculos.Avion;
import Vehiculos.Motocicleta;
import Vehiculos.Vehículo;

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
//El polimorfismo es cuando un objeto de una clase se comporta como 
//otro objeto de otra clase. Clases relacionadas por herencia
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automóvil aAuto = new Automóvil();
        Motocicleta mChop = new Motocicleta();
        Avion Caza = new Avion();
        
        aAuto.seguridad();
        aAuto.setRuedas(4);
        imprimirRuedas(aAuto);
        
        mChop.chopper();
        mChop.setRuedas(2);
        imprimirRuedas(mChop);
        
        Caza.novimiento();
        Caza.setRuedas(24);
        imprimirRuedas(Caza);
    }
   
     public static void imprimirRuedas(Vehículo arg){
        String sTipoVe = "";
         if( arg instanceof Automóvil)
             sTipoVe = "Automóvil";
         else if (arg instanceof Motocicleta)
             sTipoVe = "Motocicleta";
         else
             sTipoVe = "Avion";
         System.out.println("Ruedas del " + sTipoVe + ":" + arg.getRuedas());
         
         //Si es un automovil, imprimir la seguridad
         if( arg instanceof Automóvil){
             //Convertir el Vehículo a Automóvil
             Automóvil auto = (Automóvil)arg;
             auto.seguridad();
         }
    }
}

   