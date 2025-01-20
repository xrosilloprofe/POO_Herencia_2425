package ejercicio5;

import java.time.LocalDate;
import java.util.Arrays;

public class JefeZona extends Empleado{
    private static final double INCREMENTO=1.05;
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

    private int buscarVendedor(Vendedor vendedor){
        return Arrays.binarySearch(vendedores,vendedor);
    }

    public void addVendedor(Vendedor vendedor){
        if(buscarVendedor(vendedor)<0){
            vendedores = Arrays.copyOf(vendedores,vendedores.length+1);
            vendedores[vendedores.length-1] = vendedor;
            Arrays.sort(vendedores);
        }
    }

    public void removeVendedor(Vendedor vendedor){
        int posicion = buscarVendedor(vendedor);
        if(posicion>=0){
            Vendedor[] aux = new Vendedor[vendedores.length-1];
            System.arraycopy(vendedores,0,aux,0,posicion);
            System.arraycopy(vendedores,posicion+1,aux,posicion,vendedores.length-posicion-1);
            vendedores = aux;
            Arrays.sort(vendedores);
        }
    }

    public void cambiarCoche(Coche coche){
        this.coche = coche;
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
        setSalario(getSalario()*INCREMENTO);
    }

    @Override
    public double calcIRPF() {
        return getSalario()*0.3;
    }

    @Override
    public double calcContCom() {
        return getSalario()*0.05;
    }

    @Override
    public String toString() {
        return "Jefe de Zona " + super.toString() +
                "\n\tcoche[" + coche + "]" +
                ", despacho: " + despacho +
                ", secretario: " + secretario.getNombre() + " " + secretario.getApellidos() +
                ", vendedores: " + datosVendedores();
    }

    private String datosVendedores(){
        String datos="[";
        for(Vendedor vendedor : vendedores){
            datos += vendedor.getNombre() + " " + vendedor.getApellidos() + ",";
        }
        return datos.substring(0,datos.length()-1) + "]";
    }

}
