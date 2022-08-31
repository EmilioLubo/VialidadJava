public class Main {
    public static void main(String[] args){
        System.out.println("Programa de Seguridad Vial");

        Vehiculo ford = new Auto(140, true);
        Vehiculo corsa = new Auto(40, true);
        Auto beat = new Auto(40, false);
        Vehiculo honda = new Moto(120, 1);
        Vehiculo motomel = new Moto(120, 2);
        Vehiculo yamaha = new Moto(160, 3);

        System.out.println(ford.toString());
        System.out.println(corsa.toString());
        System.out.println(beat.toString());
        System.out.println(honda.toString());
        System.out.println(motomel.toString());
        System.out.println(yamaha.toString());

        Conductor juan = new Conductor(ford, true);
        Conductor mateo = new Conductor(corsa, true);
        Conductor marcos = new Conductor(motomel, false);
        Conductor lucas = new Conductor(yamaha, true);

        System.out.println(juan.toString());
        System.out.println(mateo.toString());
        System.out.println(marcos.toString());
        System.out.println(lucas.toString());
    }
}
