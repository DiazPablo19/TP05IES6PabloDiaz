package ejercicio05.main;
//es necesario importar la clase LocalDate para poder crear fechas
import java.time.LocalDate;

import ejercicio05.model.Persona;

public class Main {
public static void main(String[] args){

    //vamos a crear un objeto de la clase Persona que use el constructor por defecto
    Persona personaA = new Persona();
    //mostrarDatos seria mostrar todos los datos por pantalla de la personaA
    personaA.mostrarDatos();

    //separador visual en terminal
    System.out.println("--------------------------------------------------------------------------------------------------------------");

    //creamos un objeto de la clase Persona que use el constructor parametrizado
    Persona personaB = new Persona("40812291", "Pablo", LocalDate.of(2003, 7, 19), "Santa Fé" );
    personaB.mostrarDatos();
    
    //separador visual en terminal
    System.out.println("--------------------------------------------------------------------------------------------------------------");


    //creamos un objeto de la clase Persona que use el constructor con dni, nombre y fecha de nacimiento
    Persona personaC = new Persona("40812292", "Carolina", LocalDate.of(2010, 11, 22));
    personaC.mostrarDatos();

   }
}
