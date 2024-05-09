package Dependencia;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        Coche coche = new Coche(motor);
        coche.arrancar();
    }
}

