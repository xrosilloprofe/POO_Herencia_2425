package ejercicio1;

public enum Grado {
    PRIMERO_SMR(1,"SMR"),
    SEGUNDO_SMR(2,"SMR"),
    PRIMERO_ASIR(1,"ASIR"),
    SEGUNDO_ASIR(2,"ASIR"),
    PRIMERO_DAM(1,"DAM"),
    SEGUNDO_DAM(2,"DAM"),
    PRIMERO_DAW(1,"DAW"),
    SEGUNDO_DAW(2,"DAW");

    private int curso;
    private String tipo;

    Grado(int curso, String tipo){
        this.curso=curso;
        this.tipo=tipo;
    }

    public int getCurso() {
        return curso;
    }

    public String getTipo() { return tipo;}

    @Override
    public String toString(){
        return curso + "º de " + tipo;
    }
}
