package entornos;


import java.util.List;

public class Profesor extends Persona{
    String str;
    int edad;

    public Profesor(String numeroDeTelefono, String numeroDeTelefono1) {
        super(numeroDeTelefono);
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Tel�fono: " + numeroDeTelefono);
    }
    public static void printTodaLaInformacion(int edad, String numeroDeTelefono, List<Prestamo> prestamos, String str){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Tel�fono: " + numeroDeTelefono);
        Prestamo.recorrerPrestamo(prestamos);
    }

}
