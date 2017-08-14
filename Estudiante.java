
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
    // instance variables - replace the example below with your own
    String Carrera;
    String Matricula;
//        Persona persona = new Persona();

    public void Estudiar()
    {
        System.out.print("El alumno " + Nombre +" de la carrera "+ Carrera +" debe aprobar 145 creditos para graduarse");

        System.out.println(" ");
    }
    public void Hacer_Examen()
    {
        System.out.print("El alumno " + Nombre +" Matricula Nro. "+ Matricula +" tiene 3 examenes pendientes");    
        System.out.println(" ");
    }
}
