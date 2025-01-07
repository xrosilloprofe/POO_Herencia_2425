package ejercicio1;

public class Profesor extends Persona{
    private Grado[] grados;

    public Profesor(String nombre, String apellidos, String DNI, int edad, Grado[] grados){
        super(nombre, apellidos, DNI, edad);
        this.grados = grados;
    }



}
