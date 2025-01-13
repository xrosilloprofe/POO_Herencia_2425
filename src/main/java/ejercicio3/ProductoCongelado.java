package ejercicio3;

import java.time.LocalDate;

public class ProductoCongelado extends Producto{
    private int temperatura;

    public ProductoCongelado(LocalDate fechaCaducidad, int numLote, int temperatura) {
        super(fechaCaducidad, numLote);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }


    @Override
    public void ponerPrecio(double precioInicial) {
        this.precio = precioInicial*1.2;
    }

    public String toString(){
        return "Producto congelado temperatura: " + temperatura +
                " " + super.toString();
    }

}
