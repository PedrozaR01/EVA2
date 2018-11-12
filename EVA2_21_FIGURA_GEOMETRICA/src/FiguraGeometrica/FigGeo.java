/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiguraGeometrica;

/**
 *
 * @author Roberto Pedroza
 */
public class FigGeo {
    
}

abstract class FiguraGeometrica {
    //Atributos
    private Punto EsqSupIz;
    private String color;
    private int AnchoLin;

    public Punto getEsqSupIz() {
        return EsqSupIz;
    }

    public void setEsqSupIz(Punto EsqSupIz) {
        this.EsqSupIz = EsqSupIz;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnchoLin() {
        return AnchoLin;
    }

    public void setAnchoLin(int AnchoLin) {
        this.AnchoLin = AnchoLin;
    }
    
    //Area de una figura 2d
    abstract public double ObtenerArea();
    //Simula el dibujo
    abstract public void Dibujar();
}