package ejercicio3;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Producto {
    private LocalDate fechaCaducidad;
    private int numLote;
    protected double precio;   //lo ponemos protected para poder manipularlo en herencia

    public Producto(LocalDate fechaCaducidad, int numLote){
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public abstract void ponerPrecio(double precioInicial);

    @Override
    public String toString(){
        return "Producto del lote: " + numLote + " y fecha de caducidad: " + fechaCaducidad;
    }
}
