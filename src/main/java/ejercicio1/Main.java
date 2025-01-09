package ejercicio1;

public class Main {

    public static void main(String[] args) {
        Persona xavier = new Persona("x","r","11U",25);
        Persona xavi2 = new Persona("x","r","11U",52);

        System.out.println(xavier);
        System.out.println(xavi2);

        Profesor alex = new Profesor("alex","paul","22XX",30,null);
        alex.setGradosImparte(Grado.PRIMERO_ASIR, Grado.PRIMERO_DAW, Grado.SEGUNDO_DAM);

        Profesor fran = new Profesor("fran","arranz","33RR",
                42,new Grado[]{Grado.PRIMERO_DAM,Grado.SEGUNDO_DAM});

        Alumno juan = new Alumno("juan","tello","44ZZ",20,Grado.PRIMERO_DAM,1);
        Alumno toni = new Alumno("toni","novejarque","55AA",21,Grado.PRIMERO_DAM);

        System.out.println("Iguales? " + xavier.equals(xavi2));

        juan.cumplirAnyos();
        alex.cumplirAnyos();

        System.out.println(juan);
        System.out.println(toni);
        System.out.println(fran);
        System.out.println(alex);

        xavier.imprimirDNI();
        alex.imprimirDNI();
        juan.imprimirDNI();

        //polimorfismo
        Persona xabi = new Profesor("xabi","lopez de guereño","91O",55,new Grado[]{Grado.SEGUNDO_ASIR});
        System.out.println(xabi);
        xabi.imprimirDNI();

        xabi = juan;
        System.out.println(xabi);
        xabi.imprimirDNI();

        xabi = xavier;
        System.out.println(xabi);
        xabi.imprimirDNI();

        //polimorfismo
        Persona marina = new Alumno("marina", "ramirez", "73A", 20,Grado.PRIMERO_DAM);
        System.out.println(marina);
        marina = new Profesor("marina", "ramirez", "73A", 20,new Grado[]{Grado.PRIMERO_DAM});
        System.out.println(marina);


    }

}
