package ejercicio1abstracto;

public abstract class PersonaAbstracta {
    private String nombre;
    private String apellidos;
    private String DNI;
    private int edad;

    //forzar a que mis herederos usen este constructor
    public PersonaAbstracta(String nombre, String apellidos, String DNI, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void cumplirAnyos() { edad++;}

    public abstract void imprimirDNI();

    @Override
    public String toString(){
        return "Persona: " + nombre + " " + apellidos + " con DNI " + DNI
                + "y edad " + edad;
    }

    @Override
    public boolean equals(Object object){
        if(object==null || !(object instanceof PersonaAbstracta))
            return false;
        PersonaAbstracta persona = (PersonaAbstracta) object;
        return this.nombre.equals(persona.getNombre()) &&
                this.apellidos.equals(persona.getApellidos()) &&
                this.DNI.equals(persona.getDNI());

    }


}
