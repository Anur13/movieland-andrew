package com.andrew.movieland.web.controller;


import com.andrew.movieland.entity.Genre;
import com.andrew.movieland.service.DefaultGenreService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("genre")
@AllArgsConstructor
@Slf4j
public class GenreConroller {
    private DefaultGenreService genreService;

    @RequestMapping
    public List<Genre> findAll() {
        log.info("Requesting all genres");
        return genreService.findAll();
    }
}
