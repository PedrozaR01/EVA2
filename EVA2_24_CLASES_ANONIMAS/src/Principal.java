/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**/
/**
 *
 * @author Roberto
 */
public class Principal implements ImprimirMensaje{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal mPrin = new Principal();
        //IMPRIMIRmENSAJE es una interfaz. NO SE PUEDEN CREAR
        //OBJETOS DE NTERFACES.
        //CREAR UNA CLLASE ANÓNIMA QUE IMPLEMENTA LOS MÉTODOS DE
        //LA INTERFAZ
        ImprimirMensaje obImprimir = new ImprimirMensaje() {
            @Override
            public void imprimeMensaje(String sMensa) {
                System.out.println("Hola " + sMensa);
            }
        };
        obImprimir.imprimeMensaje("Roberto");
    }
    @Override
    public void imprimeMensaje(String sMensa) {
        System.out.println("Pedroza");
    }    
}
interface ImprimirMensaje{
    public void imprimeMensaje(String sMensa);
}
