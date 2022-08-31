public class Moto extends Vehiculo {

    private int espejos;
    public Moto(int velocidad, int espejos){
        super(velocidad);
        this.espejos = espejos;
        this.setSeguridad();
    }
    @Override
    protected void setSeguridad() {
        if(this.espejos >= 2 && this.velocidad <= 160){
            this.seguridad = true;
        }
    }

    @Override
    public String toString() {
        return "Moto{" +
                "espejos=" + espejos +
                ", seguridad=" + seguridad +
                ", velocidad=" + velocidad +
                '}';
    }
}
