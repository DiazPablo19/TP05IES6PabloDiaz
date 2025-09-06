package ejercicio04;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
     System.out.println("Ingrese un numero entre 1 y 9: ");
     int numero = sc.nextInt(); 
     if (numero<1 || numero>9){
        System.out.println("El número ingresado está fuera de rango. ");
     }else{
       System.out.println("La tabla del " + numero + " es: ");
       for (int i = 1; i<= 10; i++){ 
         int resultado = numero * i;
         System.out.println(numero + " x " + i + " = " + resultado);
      }
     sc.close();
   }
  }
}

