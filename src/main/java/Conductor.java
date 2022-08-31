public class Conductor {

    private Vehiculo vehiculo;
    private boolean registro;
    private boolean seguridad;

    public Conductor(Vehiculo vehiculo, boolean registro){
        this.vehiculo = vehiculo;
        this.registro = registro;
        this.setSeguridad();
    }

    private void setSeguridad(){
        if(this.registro && this.vehiculo.seguridad){
            this.seguridad = true;
        }
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "vehiculo=" + vehiculo +
                ", registro=" + registro +
                ", seguridad=" + seguridad +
                '}';
    }
}
