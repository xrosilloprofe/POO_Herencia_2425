package ejercicio4;

public abstract class VehiculoMotor extends Vehiculo{
    private String tipoMotor;
    private int numMarchas;

    public VehiculoMotor(String tipoMotor, int numMarchas) {
        this.tipoMotor = tipoMotor;
        this.numMarchas = numMarchas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    @Override
    public boolean subir(int unidades) {
        setVelocidad(getVelocidad()+unidades);
        return true;
    }

    @Override
    public void arrancar(){
        if(getVelocidad()==0)
            setVelocidad(5);
    }

    @Override
    public String toString(){
        return " tipo de motor " + tipoMotor + " con número de marchas "
                + numMarchas + super.toString();
    }
}
