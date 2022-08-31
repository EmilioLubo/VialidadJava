
public abstract class Vehiculo {
    protected boolean seguridad;
    protected int velocidad;

    public Vehiculo(int velocidad){
        this.velocidad = velocidad;
    }

    protected abstract void setSeguridad();
}
