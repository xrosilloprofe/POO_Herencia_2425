package ejercicio1abstracto;

public class Alumno extends PersonaAbstracta {
    private int NIA;
    private ejercicio1.Grado grado;

    public Alumno(String nombre, String apellidos, String DNI, int edad, ejercicio1.Grado grado){
        super(nombre,apellidos,DNI,edad);
        this.grado=grado;
        this.NIA = generarNIA();
    }

    public Alumno(String nombre, String apellidos, String DNI, int edad, ejercicio1.Grado grado, int NIA){
        super(nombre, apellidos, DNI, edad);
        this.NIA = NIA;
        this.grado = grado;
    }

    private int generarNIA(){
        return (int)(Math.random()*100000000);
    }


    @Override
    public void imprimirDNI() {
        System.out.println("Desde la clase Alumno imprimo DNI " + this.getDNI() + " NIA " + NIA);
    }


    @Override
    public String toString() {
        return "Alumno de " + grado + " con NIA: " + NIA + " de " + super.toString();
    }

}
