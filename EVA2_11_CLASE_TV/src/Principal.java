
import java.util.Scanner;

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

       private static Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int estadoTele; //Variables para el uso de los estados de la televisión
        String tecla;
        int Tecla;
        Television TV = new Television(); // Se crea el objeto de tipo Televisión
        if(TV.getEstado() == false){ // Si la televisión está apagada
            System.out.println("La televisión está apagada"); // Se muestra el mensaje de que la televisión está apagada
            do{
            System.out.println("Presione 1 para encenderla");
            estadoTele = scan.nextInt();
            if(estadoTele == 1){ // Si el usuario desea prenderla se llama al método para encenderla
                TV.OnOff();
                break;
            }
            }while(estadoTele != 1); // Mientras que la televisión esté encendida se muestra el menú
            do{
            System.out.println("Volúmen = " + TV.getVolumen()); // Se muestra el volumen de la televisión
            System.out.println("Canal = " + TV.getCanal()); // Se muestra el canal actual
            System.out.println("Presione '+' para subir el volumen\nPresione '-' para bajar el volumen\nPresione 'm' para mutear");
            System.out.println("Presione 's' para subir el canal\nPresione 'b' para bajar el canal");
            System.out.println("Presione un número del 1 al 999 para cambiar el canal");
            System.out.println("Presione '0' para apagar la televisión");
            LimpiarEscaner();
            tecla = scan.nextLine();
            Tecla = Integer.parseInt(String.valueOf(tecla)); // Obtiene el valor del canal ingresado por el usuario
            if(!"+".equals(tecla) && !"-".equals(tecla) && !"s".equals(tecla) && !"b".equals(tecla) && !"m".equals(tecla)){
                TV.irACanal(Tecla); // Llama al método para ir al canal ingresado por el usuario
            }
            else{
                switch(tecla){
                    case "-":
                        TV.bajarVolumen(); // Baja el volumen si el usuario así lo indicó
                        break;
                    case "+":
                        TV.subirVolumen(); // Sube el volumen si el usuario así lo indicó
                        break;
                    case "s":
                        TV.subirCanal(); // Sube el canal si el usuario así lo indicó
                        break;
                    case "b":
                        TV.bajarCanal(); // Baja el canal si el usuario así lo indicó
                        break;
                    case "m":
                        TV.Mute(); // mutea la televisión si el usuario así lo indicó
                        break;
                }
            }
        }while(TV.getEstado() == true);  // Lo repite mientras la televisión esté encendida 
    }
    }
    
    
    private static void LimpiarEscaner(){
        scan = new Scanner(System.in);
    }
    
}
