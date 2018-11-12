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
        Alumno aAlu = new Alumno();
        aAlu.setNombre("Jorge");
        aAlu.setApellido("Sánchez");
        aAlu.setNoControl("18550000");
        
        Empleado eEmpleado = new Empleado();
        eEmpleado.setNombre("Lalo");
        eEmpleado.setApellido("Romeo");
        eEmpleado.setRFC("asd1023");
        
        imprimirDatos(eEmpleado);
        imprimirDatos(aAlu);
    }
    public static void imprimirDatos(Personas pPersona){
        pPersona.imprimirNombre();
    }
    
}

