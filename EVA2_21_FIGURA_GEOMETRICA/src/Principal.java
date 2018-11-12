
import FiguraGeometrica.Punto;
import FiguraGeometrica.Rectangulo;
import java.util.Scanner;

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
        Rectangulo rRect = new Rectangulo();
        Scanner Inpt = new Scanner(System.in);
        System.out.println("Base: ");
        int iBase = Inpt.nextInt();
        System.out.println("Altura: ");
        int iAlt = Inpt.nextInt();
        Punto iPun = new Punto();
        iPun.setX(iAlt);
        iPun.setY(iAlt);
        rRect.setEsqSupIz(iPun);
        rRect.setBase(iBase);
        rRect.setAltura(iAlt);
        rRect.Dibujar();
        System.out.println("\n Area = " + rRect.ObtenerArea());
    }
    
}


 