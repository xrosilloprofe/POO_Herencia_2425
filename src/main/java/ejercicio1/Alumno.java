package ejercicio1;

public class Alumno extends Persona{
    private int NIA;
    private Grado grado;

    public Alumno(String nombre, String apellidos, String DNI, int edad, Grado grado){
        super(nombre,apellidos,DNI,edad);
        this.grado=grado;
        this.NIA = generarNIA();
    }

    public Alumno(String nombre, String apellidos, String DNI, int edad, Grado grado, int NIA){
        super(nombre, apellidos, DNI, edad);
        this.NIA = NIA;
        this.grado = grado;
    }

    public int generarNIA(){
        return (int)(Math.random()*100000000);
    }

    @Override
    public void imprimirDNI() {
        System.out.println("Desde la clase Alumno imprimo DNI " + this.getDNI());
    }

    @Override
    public String toString() {
        return "Alumno de " + grado + " con NIA: " + NIA + " de " + super.toString();
    }

}
