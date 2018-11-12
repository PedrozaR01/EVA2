/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisVehiculos;

/**
 *
 * @author Roberto Pedroza
 */
public class Vehículo {
    //Agregar atributos de acceso privado
    private String Marca;
    private String Modelo;
    private int Year; 
    private int Cilindros; 
    private boolean CarisOn;
    private int velocidad;
    //Agregar copnstructor default, poner valores a gusto
    public void Vehículo() {
    Marca = "Toyota";
    Modelo = "Sprinter Trueno";
    Year = 1987;
    Cilindros = 8;
    CarisOn = false;
    velocidad = 0;
    
    }
    public void ImprimirDatos() {
        System.out.println("Marca:" + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Año: " + Year);
        System.out.println("Cilindros: " + Cilindros + " Cilindros");
}
    //Metodos get n set para cada atributo
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getCilindros() {
        return Cilindros;
    }

    public void setCilindros(int Cilindros) {
        this.Cilindros = Cilindros;
    }
    
    
    //Agregar constructor que aceptelos 4 atributos
    public void GetnSet(String sMarca, String sModelo, int iYear, int iCilindros){
    
    }
    //El constructor privado es casi casi a fuerza
    
    public void prender(){
        CarisOn = true;
    }
    public void apagar(){
        CarisOn = false;
    }
    public void acelerar(){
        if(CarisOn)
           velocidad = velocidad + 10;     
            }
    public void frenar(){
        if(CarisOn){
            if(velocidad >= 10)
                velocidad = velocidad - 10;
        }
    }

    public boolean isCarisOn() {
        return CarisOn;
    }

    public void setCarisOn(boolean CarisOn) {
        this.CarisOn = CarisOn;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
}
