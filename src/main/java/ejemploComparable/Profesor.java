package ejemploComparable;

public class Profesor extends Personita{
    String curso;

    public Profesor(String nombre, String apellidos, String DNI, String curso) {
        super(nombre, apellidos, DNI);
        this.curso = curso;
    }

}
