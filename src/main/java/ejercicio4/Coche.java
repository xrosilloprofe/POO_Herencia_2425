package ejercicio4;

public class Coche extends VehiculoMotor{
    private String matricula;

    public Coche(String tipoMotor, int numMarchas, String matricula) {
        super(tipoMotor, numMarchas);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    //debemos implementarlo en todos los vehículos
    @Override
    public boolean bajar(int unidades) {
        if(getVelocidad()-unidades<0)
            return false;
        setVelocidad(getVelocidad()-unidades);
        return true;
    }

    @Override
    public String toString(){
        return "Coche con matrícula " + matricula + super.toString();
    }
}
