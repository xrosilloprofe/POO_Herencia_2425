package ejemploComparable;

public class Alumno implements Comparable<Alumno>{
    private int NIA;
    private String nombre;

    public Alumno(int NIA, String nombre) {
        this.NIA = NIA;
        this.nombre = nombre;
    }

    public int getNIA() {
        return NIA;
    }

    @Override
    public int compareTo(Alumno o) {
        return this.NIA - o.getNIA();
    }
}
