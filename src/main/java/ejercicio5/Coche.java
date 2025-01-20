package ejercicio5;

public class Coche {
    //ATRIBUTOS
    private String marca;
    private String modelo;
    private String matricula;

    //CONSTRUCTOR
    public Coche(String marca, String modelo, String matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return "marca: " + marca + " modelo: " + modelo
                + " matricula: " + matricula;
    }
}
