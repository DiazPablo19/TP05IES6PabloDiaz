package ejercicio03;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
 
    System.out.println("ingresar un numero entre 0 y 10: ");
    int numero = sc.nextInt();
       
     int factorial = 1; 
     int contador = numero;
        if (numero < 0 || numero > 10) {
        System.out.println("el numero debe estar entre 0 y 10: ");

        } else {
          if (numero==0) {
          factorial = 1;
            } else {
              while (contador >= 1) {
              factorial = factorial * contador;
              contador--;
            
          }
        }
        System.out.println("el factorial de: " + numero + " es: " + factorial);
    }
sc.close();

}
}