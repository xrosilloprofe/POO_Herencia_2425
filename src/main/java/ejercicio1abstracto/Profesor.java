package ejercicio1abstracto;

import ejercicio1.Grado;
import ejercicio1.Persona;

import java.util.Arrays;

public class Profesor extends PersonaAbstracta {
    protected ejercicio1.Grado[] gradosImparte;

    public Profesor(String nombre, String apellidos, String DNI, int edad, ejercicio1.Grado[] gradosImparte){
        super(nombre, apellidos, DNI, edad);
        this.gradosImparte = gradosImparte;
    }

    public ejercicio1.Grado[] getGradosImparte() {
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
