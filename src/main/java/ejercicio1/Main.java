package ejercicio1;

public class Main {

    public static void main(String[] args) {
        Persona xavi = new Persona("x","r","11U",25);
        Persona xavi2 = new Persona("x","r","11U",52);

        System.out.println(xavi);
        System.out.println(xavi2);

        System.out.println("Iguales? " + xavi.equals(xavi2));

    }

}
