package gestion.servicio;

import gestion.modelo.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaService {
    private List<Reserva> reservas = new ArrayList<>();

    public Reserva crearReserva(int id, Cliente cliente, Habitacion habitacion, String fecha) {
        Reserva r = new Reserva(id, cliente, habitacion, fecha);
        reservas.add(r);
        return r;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
