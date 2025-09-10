package gestion.modelo;

public class Reserva {
    private int id;
    private Cliente cliente;
    private Habitacion habitacion;
    private String fecha;

    public Reserva(int id, Cliente cliente, Habitacion habitacion, String fecha) {
        this.id = id;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fecha = fecha;
    }

    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public Habitacion getHabitacion() { return habitacion; }
    public String getFecha() { return fecha; }
}
