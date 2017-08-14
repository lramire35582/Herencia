import java.util.Scanner;

public class Proy_herencia {

    
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        
        Scanner lectura = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Introduzca El nombre");
        System.out.println(" ");        
        estudiante.Nombre = lectura.nextLine();
        System.out.println(" ");
        System.out.print("Introduzca la edad");
        System.out.println(" ");        
        estudiante.Edad = lectura.nextInt();
        lectura.nextLine();
        System.out.println(" ");
        System.out.print("Introduzca la carrera");
        System.out.println(" ");        
        estudiante.Carrera = lectura.nextLine();
        System.out.println(" ");
        System.out.print("Introduzca la matricula");
        System.out.println(" ");        
        estudiante.Matricula = lectura.nextLine();
        System.out.println(" ");        
        estudiante.Dormir();
        estudiante.Comer();
        estudiante.Estudiar();
        estudiante.Hacer_Examen();

    }
}