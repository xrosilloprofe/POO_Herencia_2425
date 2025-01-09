package ejercicio1abstracto;

import ejercicio1.Grado;

public class Main {

    public static void main(String[] args) {
        Profesor alex = new Profesor("alex","paul","22XX",30,null);
        alex.setGradosImparte(ejercicio1.Grado.PRIMERO_ASIR, ejercicio1.Grado.PRIMERO_DAW, ejercicio1.Grado.SEGUNDO_DAM);

        Profesor fran = new Profesor("fran","arranz","33RR",
                42,new ejercicio1.Grado[]{ejercicio1.Grado.PRIMERO_DAM, ejercicio1.Grado.SEGUNDO_DAM});

        Alumno juan = new Alumno("juan","tello","44ZZ",20, Grado.PRIMERO_DAM,1);
        Alumno toni = new Alumno("toni","novejarque","55AA",21, Grado.PRIMERO_DAM);

        juan.cumplirAnyos();
        alex.cumplirAnyos();

        System.out.println(juan);
        System.out.println(toni);
        System.out.println(fran);
        System.out.println(alex);

        toni.imprimirDNI();
        fran.imprimirDNI();

    }

}
