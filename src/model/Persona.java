package model;
import java.time.LocalDate;
import java.time.Period;
// clase java denominada persona
public class Persona {

    // atributos privados 
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;

    //constructor por defecto (vacio)
    public Persona(){
        this.dni = "";
        this.nombre = "";
        this.fechaNacimiento = null;
        this.provincia = "";
    }

    //constructor parametizado
    public Persona (String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }

    //constructor que solo inicialice los atributos: dni, nombre y fecha de nacimiento
    //para el atributo provincia valor Jujuy
    public Persona(String dni, String nombre, LocalDate fechaNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }

    //metodos acesores (Getters y Setters)
    public String getDni() { return dni; }
    public void setDni (String dni)
    { this.dni = dni; }

     public String getNombre() { return nombre; }
    public void setNombre (String nombre)
    { this.nombre = nombre; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento (LocalDate fechaNacimiento)
    { this.fechaNacimiento = fechaNacimiento; }

     public String getProvincia() { return provincia; }
    public void setProvincia (String provincia)
    { this.provincia = provincia; }

    //metodo para calcular edad
    public int calcularEdad() {
        if (fechaNacimiento == null) return 0;
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    } 

    //metodo para saber si es mayor de edad (igual o mayor a 18 años)
    public boolean esMayorDeEdad() {
        return calcularEdad() >=18;
    }

    //mostrar datos
    //creamos un metodo public para usar desde cualquier otra clase
    public void mostrarDatos() {
        System.out.println(" DNI: " + dni);
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Fecha de nacimiento: " + (fechaNacimiento != null ? fechaNacimiento : "no registrada"));
        System.out.println(" Provincia: " + provincia);
        System.out.println(" Edad:" + calcularEdad());

        //mostrador de edad

        System.out.println(esMayorDeEdad()? " La persona es mayor de edad " : " La persona no es mayor de edad ");


    }

}
