package ejercicio3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{
    private int codigoOrganismo;

    public ProductoRefrigerado(LocalDate fechaCaducidad, int numLote, int codigoOrganismo) {
        super(fechaCaducidad, numLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(int codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public void ponerPrecio(double precio){
        this.precio = precio*1.1; //impuesto del 10% por refrigerar
    }

    @Override
    public String toString(){
        return "Producto refrigerado código organismo: " + codigoOrganismo +
                " " + super.toString();
    }

}
