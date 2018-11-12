/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Alumno extends Personas {
        private String NoControl;

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

    @Override
    void imprimirNombre() {
        System.out.println("Alumno: " + getNombre() + " " + getApellido() + " " + getNoControl());    }

}
