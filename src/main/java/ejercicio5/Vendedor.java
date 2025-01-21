package ejercicio5;

import java.time.LocalDate;
import java.util.Arrays;

public class Vendedor extends Empleado implements Comparable<Vendedor> {
    private static final double INCREMENTO=1.10;
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
            String[] aux = new String[clientes.length-1];
            System.arraycopy(clientes,0,aux,0,posicion);
            System.arraycopy(clientes,posicion+1,aux,posicion,clientes.length-posicion-1);
            clientes = aux;
            Arrays.sort(clientes);
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
        setSalario(getSalario()*INCREMENTO);
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
    public boolean equals(Object object){
        if(!(object instanceof Vendedor))
            return false;
        Vendedor vendedor = (Vendedor) object;
        return  vendedor.getApellidos().equals(getApellidos()) &&
                vendedor.getDNI().equals(getDNI());
    }

    @Override
    public String toString() {
        return "Vendedor " + super.toString() +
                "\n\tcoche[" + coche + "]" +
                ", areaVentas: " + areaVentas +
                ", comision: " + comision +
                ", movil: " + movil +
                ", clientes: " + Arrays.toString(clientes);
    }

    @Override
    public int compareTo(Vendedor vendedor) {
        if(this.getApellidos().equals(vendedor.getApellidos())){
            return this.getNombre().compareTo(vendedor.getNombre());
        }
        return this.getApellidos().compareTo(vendedor.getApellidos());
    }
}
