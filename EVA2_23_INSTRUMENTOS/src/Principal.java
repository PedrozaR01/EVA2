
import mis_clases.Guitarra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Guitarra gMiGuitarra = new Guitarra();
        gMiGuitarra.setNombre("Gibson");
        gMiGuitarra.setNumeroCuerdas(6);
        gMiGuitarra.efectos("Wah");
        gMiGuitarra.amplificador(10000);
        gMiGuitarra.tocarInstrumento();
        
        
    }
    
}
