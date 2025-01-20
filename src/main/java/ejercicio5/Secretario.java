package ejercicio5;

import java.time.LocalDate;

public class Secretario extends Empleado{
    private String despacho;
    private String numFax;
    private static final double INCREMENTO=1.15;

    public Secretario(String nombre, String apellidos, String DNI, String direccion, String telefono, LocalDate fechaInicio, double salario, String despacho, String numFax) {
        super(nombre, apellidos, DNI, direccion, telefono, fechaInicio, salario);
        this.despacho = despacho;
        this.numFax = numFax;
    }

    @Override
    public boolean cambiarSupervisor(Empleado empleado) {
        if(empleado instanceof Secretario ||
            empleado instanceof JefeZona){
            setSupervisor(empleado);
            return true;
        }
        return false;
    }

    @Override
    public void incrementarSalario() {
        setSalario(getSalario()*INCREMENTO);
    }

    @Override
    public double calcIRPF() {
        return getSalario()*0.21;
    }

    @Override
    public double calcContCom() {
        return getSalario()*0.03;
    }

    @Override
    public String toString() {
            return "Secretario " + super.toString() +
            "\n\tdespacho=" + despacho +
            ", numFax='" + numFax;
    }
}
