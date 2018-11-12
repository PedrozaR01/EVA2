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
        Banco ObjBa = new Banco();
        System.out.println("Nombre del cliente: " + ObjBa.getNombreCliente());
        System.out.println("Salde del cliente: " + ObjBa.getSaldo());
        System.out.println(" ");
        Banco ObjBa2 = new Banco("Roberto Pedroza", 10000);//Objeto con valores
        System.out.println("Nombre del cliente: " + ObjBa2.getNombreCliente());
        System.out.println("Saldo de la cuenta: " + ObjBa2.getSaldo());
    }
}

class Banco {
    private String NombreCliente;
    private double Saldo;

    public Banco() {
        NombreCliente = "Roberto Antonio Pedroza Fernández";
        Saldo = 48000;
    }

    public Banco(String NombreCliente, double Saldo) {
        this.NombreCliente = NombreCliente;
        this.Saldo = Saldo;
    }
    //Override

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
}