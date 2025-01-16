package ejercicio5;

import java.time.LocalDate;

public class JefeZona extends Empleado{
    private static final int INCREMENTO=5;
    private String despacho;
    private Coche coche;
    private Secretario secretario;
    private Vendedor[] vendedores;

    public JefeZona(String nombre, String apellidos, String DNI, String direccion, String telefono, LocalDate fechaInicio, double salario, String despacho, Coche coche, Secretario secretario, Vendedor[] vendedores) {
        super(nombre, apellidos, DNI, direccion, telefono, fechaInicio, salario);
        this.despacho = despacho;
        this.coche = coche;
        this.secretario = secretario;
        this.vendedores = vendedores;
    }

    public void cambiarSecretario(Secretario secretario){
        this.secretario=secretario;
    }

    @Override
    public boolean cambiarSupervisor(Empleado empleado) {
        if(empleado instanceof JefeZona){
            setSupervisor(empleado);
            return true;
        }
        return false;
    }

    @Override
    public void incrementarSalario() {
        setSalario(getSalario()*(1+INCREMENTO/100));
    }

    @Override
    public double calcIRPF() {
        return getSalario()*0.3;
    }

    @Override
    public double calcContCom() {
        return getSalario()*0.05;
    }

}
