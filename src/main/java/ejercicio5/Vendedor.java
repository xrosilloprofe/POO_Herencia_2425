package ejercicio5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Vendedor extends Empleado{
    private static final int INCREMENTO=10;
    private Coche coche;
    private String areaVentas;
    private double comision;
    private String movil;
    private String[] clientes;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, String telefono, LocalDate fechaInicio, double salario, Coche coche, String areaVentas, double comision, String movil) {
        super(nombre, apellidos, DNI, direccion, telefono, fechaInicio, salario);
        this.coche = coche;
        this.areaVentas = areaVentas;
        this.comision = comision;
        this.movil = movil;
        clientes = new String[0];
    }

    public int buscarCliente(String cliente){
        return Arrays.binarySearch(clientes,cliente);
    }

    public void addCliente(String cliente){
        if(buscarCliente(cliente)<0){
            clientes = Arrays.copyOf(clientes,clientes.length+1);
            clientes[clientes.length-1] = cliente;
            Arrays.sort(clientes);
        }
    }

    public void removeCliente(String cliente){
        int posicion = buscarCliente(cliente);
        if(posicion>=0){
            clientes[posicion] = "";
            Arrays.sort(clientes);
            clientes = Arrays.copyOfRange(clientes,1,clientes.length);
        }
    }

    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }


    @Override
    public boolean cambiarSupervisor(Empleado empleado) {
        if(empleado instanceof Vendedor ||
                empleado instanceof JefeZona){
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
        return getSalario()*0.24;
    }

    @Override
    public double calcContCom() {
        return getSalario()*0.04;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "coche=" + coche +
                ", areaVentas='" + areaVentas + '\'' +
                ", comision=" + comision +
                ", movil='" + movil + '\'' +
                ", clientes=" + Arrays.toString(clientes) +
                '}' + super.toString();
    }
}
