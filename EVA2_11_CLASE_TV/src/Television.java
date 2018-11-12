/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Pedroza
 */
public class Television {
    // Atributos de la clase
    private boolean Encendido;
    private boolean Mute;
    private int Volumen;
    private int volumenActual;
    private int Canal;
    private int canalActual;
    private int canalAnterior;
    
    public Television(){ // Constructor default, inicializando los atributos de la clase
        Encendido = false;
        Volumen = 0;
        Canal = 1;
        canalActual = Canal;
    }
    
    public void OnOff(){ // Método para encender/apagar la televisión
        if(this.Encendido == true){ // Si se usa el método y la televisión está encendida, entonces se apaga
            this.Encendido = false;
            System.out.println("La televisión está apagada");
        }
        else if(this.Encendido == false){
            this.Encendido = true;// Si la televisión está apagada, entonces se enciende
            System.out.println("La televisión está encendida");
        }
    }
    
    public void subirVolumen(){// Método para subir el volumen
        if(Encendido == true){ // Sólo se subirá el volumen si la televisión está encendida
            if(Volumen >=0 && Volumen < 100){ // Se subirá el volumen de 1 en 1 cada vez que se use el método hasta llegar a 100
                Volumen++;
                volumenActual = Volumen;
                System.out.println("Volumen = " + volumenActual); // se muestra el volumen actual
            }
        }
    }
    
    public void bajarVolumen(){ // Método para bajar el volumen
        if(Encendido == true){ // Sólo se podrá usar el método si la televisión está encendida
            if(Volumen >0 && Volumen <= 100){ // Sólo se bajará el volumen hasta llegar a 0
                Volumen--;
                volumenActual = Volumen;
                System.out.println("Volumen = " + volumenActual); // Se muestra el volumen actual
            }
        }
    }
    
    public void subirCanal(){ // Método para subir el canal
        canalAnterior = canalActual; // Se crea una copia del canal donde se encuentra antes de cambiar de canal
        if(Encendido == true){ // Sólo se podrá cambiar de canal si la televisión está encendida
            if(Canal >=1 && Canal < 999){ // Sólo se cambiará el canal entre el 1 y el 999
                Canal++; // El canal aumenta en uno cada vez que se use este método
                canalActual = Canal;
                System.out.println("Canal = " + canalActual); // Muestra el canal actual
            }
        }
    }
    
    public void bajarCanal(){ // Método para bajar el canal
        canalAnterior = canalActual; // Se crea una copia del canal donde se encuentra antes de cambiar de canal
        if(Encendido == true){ // Sólo se podrá cambiar de canal si la televisión está encendida
            if(Canal > 1 && Canal <= 999){ // Sólo se cambiará de canal entre el 1 y el 999
                Canal--; // El canal disminuye en uno cada vez que se use este método
                canalActual = Canal;
                System.out.println("Canal = " + canalActual); // Muestra el canal actual
            }
        }
    }
    
    public void irACanal(int canal){ // Método para ir a un canal específicado por el usuario
        canalAnterior = canalActual; // Se crea una copia del canal donde se encuentra antes de cambiar de canal
        if(Encendido == true){ // Sólo se podrá cambiar de canal si la televisión está encendida
            if(canal >= 1 && canal <= 999){ // Sólo se cambiará de canal si el canal ingresado está dentro de los límites de la lsita de canales
                if(canalActual != canal){ // Sólo se cambiará el canal si el canal ingresado es diferente al canal actual
                    canalActual = canal; // Cambio de canal al ingresado por el usuario
                    System.out.println("Canal = " + canalActual); // Muestra el canal actual
                }
            }
            else{
                System.out.println("El canal ingresado no es válido"); // Si el canal está fuera del limite de la lista de canales se muestra el mensaje de canal invalido
            }
        }
    }
    
    public void volverACanal(){ // Método para volver al canal anterior
        if(Encendido == true){ // Sólo se podrá volver al último canal visto si la televisión está encendida
            if(canalActual != canalAnterior){ // Sólo se podrá cambiar de canal si el canal anterior es diferente al canal actual
                canalActual = canalAnterior; // Cambio de canal, al canal anterior
                System.out.println("Canal = " + canalActual); // Muestra el canal actual
            }
        }
    }
    
    public void Mute(){ // Método para mutear la televisión
        if(this.Mute == true){ // Si el mute está encendido el volumen actual se guarda en la variable volumenactual
            this.volumenActual = this.Volumen;
            this.Volumen = 0; // Y el volumen se baja a 0
        }
        else if(this.Mute == false){ // Si el mute se apaga el volumen se regresa al volumen actual guardado
            this.Volumen = this.volumenActual; 
        }
    }
     // Método get y set de los atributos de la televisión
    public boolean getEstado(){
        return this.Encendido;
    }
    
    public int getVolumen(){
        return this.Volumen;
    }
    
    public int getCanal(){
        return this.canalActual;
    }
    
}

