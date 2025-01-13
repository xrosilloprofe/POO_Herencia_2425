package ejercicio4;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Coche ibiza = new Coche("combustión",5,"9999AAA");
        Coche kia = new Coche("eléctrico",0,"7777AZX");
        Bicicleta bici1 = new Bicicleta("montaña");

        bici1.subir1();
        bici1.subir(10);
        System.out.println(bici1);

        ibiza.bajar(10);
        ibiza.subir(50);
        System.out.println(ibiza);

        kia.subir(100);
        kia.bajar(30);
        System.out.println(kia);

        //ejemplo de polimorfismo concesionario
        Vehiculo mercedes = new Coche("eléctrico",0,"5555ACME");
        Vehiculo[] concesionario = {mercedes,kia,bici1,ibiza};
        System.out.println(Arrays.toString(concesionario));

        //ejemplo de polimorfismo (media velocidad)
        int suma=0;
        for(Vehiculo vehiculo:concesionario)
            suma+= vehiculo.getVelocidad();
        System.out.println("Media: " + ((double)suma/ concesionario.length));
    }
}
