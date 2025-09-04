package ejercicio01;
// clase Main (está con mayuscula)
public class Main { 
// metodo main (con minuscula) de tipo void
public static void main(String[] args) throws Exception {
// declaramos variables y sus tipo de dato
    String pais = "Argentina";
    int edad = 18;
    double altura = 150.50;
    double precio = 1999.99;
    long telefono = 3884482473L;
    double coseno = Math.cos(5.0);
    int n1 = 5, n2 = 10, n3 = 15, n4 = 20, n5 = 25;
    double promedio = (n1 + n2 + n3 + n4 + n5) / 5.0;
// estamos mostrando
    System.out.println("Pais: " + pais); 
    System.out.println("Edad: " + edad);
    System.out.println("Altura de edificio: " + altura);
    System.out.println("Precio del producto: " + precio);
    System.out.println("Telefono: " + telefono);
    System.out.println("Coseno de 0.5: " + coseno);
    System.out.println("El promedio es: " + promedio);

}

}
