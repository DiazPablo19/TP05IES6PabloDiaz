package ejercicio02;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
  System.out.println("Ingrese un numero: ");
  int numero = sc.nextInt();

  if (numero%2==0){
    System.out.println("El numero es par. El triple es: " + (numero*3));
  } else {
     System.out.println("El numero es impar. El doble es: " + (numero*2));
  }

  sc.close();




}

}