package com.kizuna.kizuna_letter.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kizuna.kizuna_letter.model.Song;

@Controller
public class GiftController {

    @GetMapping("/")
    public String index(Model model) {
        // 1. Lógica del contador de días
        LocalDate startDate = LocalDate.of(2018, 5, 14); // Puedes ajustar tu fecha especial aquí
        LocalDate today = LocalDate.now();
        long daysTogether = ChronoUnit.DAYS.between(startDate, today);

        // 2. Colección de canciones para el botón "Favorite Songs"
        List<Song> songs = List.of(
            new Song("Our Song", "Artist Name", "/audio/song1.mp3"),
            new Song("Special Track", "Artist Name", "/audio/song2.mp3")
        );

        // 3. Pasar los datos a la vista de Thymeleaf
        model.addAttribute("daysTogether", daysTogether);
        model.addAttribute("songs", songs);

        return "index"; // Carga index.html
    }
}