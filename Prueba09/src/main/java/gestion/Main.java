package gestion;

import gestion.modelo.*;
import gestion.persistencia.GestorJSON;
import gestion.servicio.ReservaService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ReservaService reservaService = new ReservaService();

        // 1. Crear cliente y habitación
        Cliente cliente = new Cliente(1, "Mario", "Mario@example.com");
        Habitacion habitacion = new Habitacion(101, "doble");

        // 2. Crear reserva con la fecha de hoy
        String fechaHoy = LocalDate.now().toString();
        Reserva reserva = reservaService.crearReserva(1, cliente, habitacion, fechaHoy);

        // 3. Simular pago (ejemplo: el cliente elige tarjeta)
        Pago pago = new Pago(1, reserva.getId(), 120, TipoPago.PagoTarjeta);

        // 4. Guardar en JSON
        GestorJSON.guardar(reserva, "gestion-cr.json");
        System.out.println("✅ Reserva guardada en JSON.");

        // 5. Cargar desde JSON
        Reserva reservaCargada = GestorJSON.cargar("gestion-cr.json", Reserva.class);

        // 6. Mostrar información completa en consola
        System.out.println("\n--- 📋 Detalles de la Reserva ---");
        System.out.println("Cliente: " + reservaCargada.getCliente().getNombre());
        System.out.println("Habitación: " + reservaCargada.getHabitacion().getNumero());
        System.out.println("Fecha: " + reservaCargada.getFecha());
        System.out.println("Tipo de pago: " + pago.getTipo());
        System.out.println("Importe: " + pago.getCantidad() + " €");
    }
}
