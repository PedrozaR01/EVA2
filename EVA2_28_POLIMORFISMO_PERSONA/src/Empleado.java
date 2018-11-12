/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Empleado extends Personas {
    private String RFC;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    @Override
    void imprimirNombre() {
        System.out.println("Empleado: " + getNombre() + " " + getApellido() + " " + getRFC());    }
    
}
