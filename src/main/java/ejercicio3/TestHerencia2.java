package ejercicio3;

import java.time.LocalDate;

public class TestHerencia2 {
    public static void main(String[] args) {
        ProductoCongelado congelado = new ProductoCongelado(LocalDate.now().plusDays(30),1,-15);
        System.out.println(congelado);
        congelado.ponerPrecio(25);
        System.out.println(congelado.precio);
    }
}
