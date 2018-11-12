
import Classes.Clientes;
import Classes.Empleados;
import Classes.EstadoCivil;
import Classes.Persona;

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
        Persona pObj = new Persona();
        pObj.setNombre("Roberto");
        pObj.setApellido("Pedroza");
        pObj.setEstadoCivil(EstadoCivil.Divorciado);
        System.out.println(pObj.getNombre() + " " + pObj.getApellido() +
                " " +pObj.getEstadoCivil());
        
        Empleados eObj = new Empleados();
        eObj.setNombre("Luis");
        eObj.setApellido("Montes");
        eObj.setEstadoCivil(EstadoCivil.Casado);
        eObj.setSalario(.1);
        System.out.println(eObj.getNombre() + " " +eObj.getApellido() +
                " " +eObj.getEstadoCivil());
        
        Clientes cObj = new Clientes();
        cObj.setNombre("Jeniffer");
        cObj.setApellido("Mercado");
        cObj.setEstadoCivil(EstadoCivil.Soltero);
        cObj.setRFC("LMAO12345");
        System.out.println(cObj.getNombre() + " " +cObj.getApellido() +
                " " +cObj.getEstadoCivil());
        
    }
    
}
