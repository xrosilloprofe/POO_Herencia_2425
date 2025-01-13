package ejercicio4;

public abstract class Vehiculo implements Arranque{
    private int velocidad;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void subir1(){velocidad++;}
    public void bajar1(){
        if (velocidad>0)
            velocidad--;
    }

    public abstract boolean subir(int unidades);
    public abstract boolean bajar(int unidades);

    @Override
    public String toString(){
        return " velocidad: " + velocidad;
    }

}
