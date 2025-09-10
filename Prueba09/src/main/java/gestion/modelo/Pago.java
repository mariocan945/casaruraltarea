package gestion.modelo;

public class Pago {
    private int id;
    private int reservaId;
    private double cantidad;
    private TipoPago tipo;

    public Pago(int id, int reservaId, double cantidad, TipoPago tipo) {
        this.id = id;
        this.reservaId = reservaId;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public int getId() { return id; }
    public int getReservaId() { return reservaId; }
    public double getCantidad() { return cantidad; }
    public TipoPago getTipo() { return tipo; }
}
