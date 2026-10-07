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
                new Song("Underfell Theovania", "/audio/theovania.mp3"),
                new Song("Bad Time Trio", "/audio/bad-time-trio.mp3"),
                new Song("Throw Away Your Mask", "/audio/throw-away-your-mask.mp3"),
                new Song("Five Nights at Freddy's 3", "/audio/fnaf3.mp3"),
                new Song("Coded To Reality", "/audio/codedtoreality.mp3"),
                new Song("Life Will Change", "/audio/lifewillchange.mp3"),
                new Song("Reach Out To The Truth", "/audio/persona3.mp3"),
                new Song("Rivers In The Desert", "/audio/riversinthedesert.mp3"),
                new Song("Stuck Inside", "/audio/stuckinside.mp3")
        );

        model.addAttribute("daysTogether", daysTogether);
        model.addAttribute("songs", songs);

        return "index";
    }
}
