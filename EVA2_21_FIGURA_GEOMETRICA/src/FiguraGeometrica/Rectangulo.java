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
public class Rectangulo extends FiguraGeometrica{
    private int Base;
    private int Altura;

    public int getBase() {
        return Base;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }
    
    @Override
    public double ObtenerArea() {
        return Base * Altura;
        
    }

    @Override
    public void Dibujar() {
        Punto esqInfIzq, esqSupDer, esqInfDer;
        esqInfIzq = new Punto();
        esqSupDer = new Punto();
        esqInfDer = new Punto();
        
        esqInfIzq.setX(getEsqSupIz().getX());
        esqInfIzq.setY(getEsqSupIz().getY() - Altura);
        
        esqInfDer.setX(getEsqSupIz().getX() + Base);
        esqInfDer.setY(getEsqSupIz().getY());
        
        esqSupDer.setX(getEsqSupIz().getX() + Base);
        esqSupDer.setY(getEsqSupIz().getY());
        
        System.out.println("(" + getEsqSupIz().getX() + "," + 
                getEsqSupIz().getY() + ")");
        }
        System.out.println("(" + getEsqSupIz().getX() + "," + 
                getEsqSupIz().getY() + ")");
        }
        System.out.println("(" + getEsqSupIz().getX() + "," + 
                getEsqSupIz().getY() + ")");
        }
        System.out.println("(" + getEsqSupIz().getX() + "," + 
                getEsqSupIz().getY() + ")");
        }
    
}
