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
        LocalDate startDate = LocalDate.of(2018, 5, 14);
        long daysTogether = ChronoUnit.DAYS.between(startDate, LocalDate.now());

        List<Song> songs = List.of(
                new Song("Underfell Theovania", "/audio/theovania.mp3"));

        model.addAttribute("daysTogether", daysTogether);
        model.addAttribute("songs", songs);

        return "index";
    }
}
