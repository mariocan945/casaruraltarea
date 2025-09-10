package gestion.modelo;

public class Habitacion {
    private int numero;
    private String tipo; // simple, doble, suite

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() { return numero; }
    public String getTipo() { return tipo; }
}
