package ejercicio1abstracto;

import ejercicio1.Grado;

public class Directivo extends Profesor {
    private String cargo;

    public Directivo(String nombre, String apellidos, String DNI, int edad, Grado[] gradosImparte, String cargo) {
        super(nombre, apellidos, DNI, edad, gradosImparte);
        this.cargo=cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void imprimirDNI() {
        System.out.println("Desde la clase Directivo imprimo DNI " + this.getDNI());
    }

    @Override
    public String toString() {
        return "Directivo con cargo: " + cargo + " y "
                + super.toString();
    }



}
