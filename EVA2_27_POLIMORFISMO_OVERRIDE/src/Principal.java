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
        Doctor dSimi = new Doctor();
        dSimi.tratarpaciente();
        Cirujano cStrange = new Cirujano();
        cStrange.tratarpaciente();
        cStrange.cobrar();
        Doctor dChapatin = new Cirujano();
        dChapatin.tratarpaciente();
        Cirujano cHouse = (Cirujano)dChapatin;
        cHouse.cobrar();
    }
    
}

class Cirujano extends Doctor{
    public void cobrar(){
        System.out.println("Hella Bread");
    }
    @Override
    public void tratarpaciente() {
        System.out.println("Cirugía a corazón abierto");
    }
    
}

class Doctor{
    public void tratarpaciente(){
        System.out.println("Paracetamol");
    }
}