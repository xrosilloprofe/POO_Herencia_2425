package ejercicio5;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public abstract class Empleado extends Persona implements CotizacionSegSoc{
    private String telefono;
    private LocalDate fechaInicio;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, String telefono, LocalDate fechaInicio, double salario) {
        super(nombre, apellidos, DNI, direccion);
        this.telefono = telefono;
        this.fechaInicio = fechaInicio;
        this.salario = salario;
        this.supervisor = null; //esto es redundante
    }

    public void setSupervisor(Empleado empleado){
        this.supervisor = empleado;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public double getSalario() {
        return salario;
    }
    public Empleado getSupervisor() {
        return supervisor;
    }

    public abstract boolean cambiarSupervisor(Empleado empleado);
    public abstract void incrementarSalario();

    @Override
    public String imprimirEtiqueta(){
        return getNombre() + " " + getApellidos();
    }

    @Override
    public String toString(){
        return "Empleado " + super.toString() + " con telefono: " +
                telefono + " antigüedad en días" +
                DAYS.between(LocalDate.now(),fechaInicio) +
                " y salario: " + salario +
                "\n\tsupervisor: " + supervisor;
    }
}
