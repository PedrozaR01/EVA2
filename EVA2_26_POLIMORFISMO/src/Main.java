/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Pedroza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Polimorfismo: PADRE = HIJO
        //ESTO ESTA BIEN --> PADRE = new HIJO
        //ESTO NO ESTÁ BIEN --> HIJO = new PADRE
        Persona ningen = new Alumno();
        ningen.setNombre("Roberto");
        ningen.setApellido("Pedroza");
        //Casting
        Alumno aAlumno = (Alumno)ningen;
        System.out.println(aAlumno.getNombre());
        System.out.println(aAlumno.getApellido());
        System.out.println(aAlumno.getNumeroControl());
        
    }
    
}

class Persona{
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}

class Empleado extends Persona{
    private String RFC;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
}

class Alumno extends Persona{
    private int NumeroControl;
    
    public Alumno(){
        NumeroControl = 18550354;
    }

    public int getNumeroControl() {
        return NumeroControl;
    }

    public void setNumeroControl(int NumeroControl) {
        this.NumeroControl = NumeroControl;
    }
}