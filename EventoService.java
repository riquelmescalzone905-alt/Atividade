package service;

import model.Evento;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public class EventoService {

    public static void ordenarPorHorario(List<Evento> eventos) {
        eventos.sort(Comparator.comparing(Evento::getHorario));
    }

    public static void mostrarStatus(Evento evento) {
        LocalDateTime agora = LocalDateTime.now();

        if (evento.getHorario().isBefore(agora)) {
            System.out.println("Status: Evento já ocorreu.");
        } else {
            System.out.println("Status: Evento ainda vai acontecer.");
        }
    }
}
