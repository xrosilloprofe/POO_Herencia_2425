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

    //GETTER
    public String getMarca(){ return marca;}
    public String getModelo() { return modelo;}
    public String getMatricula() {return matricula;}


    @Override
    public String toString(){
        return "Marca: " + marca + " modelo: " + modelo
                + "matricula: " + matricula;
    }
}
