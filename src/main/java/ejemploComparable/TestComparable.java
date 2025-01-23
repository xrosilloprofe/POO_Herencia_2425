package ejemploComparable;

import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args) {
        String cadena1="a", cadena2="f", cadena3="y";
        System.out.println(cadena1.compareTo(cadena2));
        System.out.println(cadena3.compareTo(cadena2));
        String[] cadenas = new String[]{cadena3,cadena2,cadena1};
        System.out.println(Arrays.toString(cadenas));
        Arrays.sort(cadenas);
        System.out.println(Arrays.toString(cadenas));

        Personita andrii = new Personita("Andrii","Shcev","1X");
        Personita claudia = new Personita("Claudia","Uno","2X");
        Personita marina = new Personita("Marina","Uno","3X");
        Personita[] personitas = new Personita[]{marina,andrii,claudia};
        System.out.println(Arrays.toString(personitas));
        Arrays.sort(personitas);
        System.out.println(Arrays.toString(personitas));
        System.out.println(marina.compareTo(claudia));


//        Vendedor eric = new Vendedor("Eric","Garcia","1X","su casa","999",
//                LocalDate.of(2022,9,9),20000,new Coche("a","a","a"),"levante",10,"678");
//        Vendedor angel = new Vendedor("Àngel","Correa","2X","su casa","999",
//                LocalDate.of(2012,9,9),30000,new Coche("a","a","a"),"levante",10,"678");
//        Vendedor pau = new Vendedor("Pau","Torres","3X","su casa","999",
//                LocalDate.of(2017,9,9),25000,new Coche("a","a","a"),"levante",10,"678");
//
//        Vendedor[] vendedors = new Vendedor[]{eric,angel,pau};
//        Arrays.sort(vendedors);
//        System.out.println(Arrays.toString(vendedors));
        Profesor profesor1 = new Profesor("string","string","9330","1234");
        Profesor profesor2 = new Profesor("abc","dce","345","0198");
        profesor1.compareTo(profesor2);
        System.out.println(profesor1.compareTo(andrii));

    }

}
