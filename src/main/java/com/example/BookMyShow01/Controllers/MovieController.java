package com.example.BookMyShow01.Controllers;


import com.example.BookMyShow01.Dtos.MovieRequestDto;
import com.example.BookMyShow01.Models.MovieEntity;
import com.example.BookMyShow01.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    public String addMovie(@RequestBody MovieRequestDto movieRequestDto){

        return movieService.addMovie(movieRequestDto);
    }
  @GetMapping("/find-Movie-By-Name")
    public MovieEntity findByName(@RequestParam String name){

        return movieService.findByName(name);
  }
    //Get movie by Name
}