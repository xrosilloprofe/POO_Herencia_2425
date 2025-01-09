package ejercicio1;

import java.util.Arrays;

public class Profesor extends Persona{
    private Grado[] gradosImparte;

    public Profesor(String nombre, String apellidos, String DNI, int edad, Grado[] gradosImparte){
        super(nombre, apellidos, DNI, edad);
        this.gradosImparte = gradosImparte;
    }

    public Grado[] getGradosImparte() {
        return gradosImparte;
    }

    public void setGradosImparte(Grado... gradosImparteVector){
        //transforma el parámetro indeterminado gradosImparteVector en un arrya de Grado
        this.gradosImparte = gradosImparteVector;
    }

    @Override
    public void imprimirDNI() {
        System.out.println("Desde la clase Profesor imprimo DNI " + this.getDNI());
    }

    @Override
    public String toString() {
        return "Profesor de " + Arrays.toString(gradosImparte) + " "
                + super.toString();
    }




}
