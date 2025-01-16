package ejercicio5;

public class Persona {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;

    public Persona(String nombre, String apellidos, String DNI, String direccion){
        this.apellidos=apellidos;
        this.nombre=nombre;
        this.DNI=DNI;
        this.direccion=direccion;
    }

    public String getApellidos() {
        return apellidos;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDNI() {
        return DNI;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    @Override
    public String toString(){
        return "Nombre completo: " + nombre + " " + apellidos +
                " DNI: " + DNI + " dirección: " + direccion;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null || !(obj instanceof Persona))
            return false;
        Persona persona = (Persona) obj;
        return DNI.equals(persona.DNI) &&
                apellidos.equals(persona.apellidos);
    }

}