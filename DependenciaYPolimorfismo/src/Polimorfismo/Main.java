package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo();
        Figura figura2 = new Cuadrado();

        figura1.dibujar(); // Salida: Dibujando un círculo
        figura2.dibujar(); // Salida: Dibujando un cuadrado
    }
}
