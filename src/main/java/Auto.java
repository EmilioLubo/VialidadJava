
public class Auto extends Vehiculo{

    private final boolean auxilio;

    public Auto(int velocidad, boolean auxilio){
        super(velocidad + 100);
        this.auxilio = auxilio;
        this.setSeguridad();
    }

    @Override
    protected void setSeguridad() {
        if(this.auxilio && this.velocidad <= 140){
            this.seguridad = true;
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "auxilio=" + auxilio +
                ", seguridad=" + seguridad +
                ", velocidad=" + velocidad +
                '}';
    }
}
