package Dependencia;

public class Coche {
    private Motor motor;

    public Coche(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        System.out.println("El coche arranca");
        motor.encender();
    }
}
