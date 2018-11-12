/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoologico;

/**
 *
 * @author Roberto
 */
public class Animales {
    private int Ojos; // Atributos de la clase
    private int Extremidades;
    private boolean Movimiento;
    private String reproduccion;
 // Métodos get y set de los atributos de la clase
    public int getOjos() {
        return Ojos;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public void setOjos(int Ojos) {
        this.Ojos = Ojos;
    }

    public int getExtremidades() {
        return Extremidades;
    }

    public void setExtremidades(int Extremidades) {
        this.Extremidades = Extremidades;
    }

    public boolean isMovimiento() {
        return Movimiento;
    }

    public void setMovimiento(boolean Movimiento) {
        this.Movimiento = Movimiento;
    }


    
}
