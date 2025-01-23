package ejemploComparable;

public class Personita implements Comparable<Personita>{
    private String nombre;
    private String apellidos;
    private String DNI;

    public Personita(String nombre, String apellidos, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "Persona: " + nombre + " " + apellidos + " con DNI " + DNI;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || !(object instanceof Personita))
            return false;
        Personita persona = (Personita) object;
        return this.nombre.equals(persona.getNombre()) &&
                this.apellidos.equals(persona.getApellidos()) &&
                this.DNI.equals(persona.getDNI());

    }

    @Override
    public int compareTo(Personita personita) {
        if(this.apellidos.equals(personita.getApellidos())){
            if(this.nombre.equals(personita.getNombre())){
                return this.DNI.compareToIgnoreCase(personita.getDNI());
            }
            return this.nombre.compareToIgnoreCase(personita.getNombre());
        }
        return this.apellidos.compareToIgnoreCase(personita.getApellidos());
    }
}