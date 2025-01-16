package ejercicio5;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Vendedor pepe= new Vendedor("n","n","n","n","n",
                LocalDate.now(),0.0,new Coche("marca","modelo","matricula"),"n",0.0,"n");

        pepe.addCliente("a");
        pepe.addCliente("b");
        pepe.addCliente("c");
        pepe.removeCliente("b");


    }
}
