package com.example.BookMyShow01.Controllers;


import com.example.BookMyShow01.Dtos.TheaterRequestDto;
import com.example.BookMyShow01.Models.TheaterEntity;
import com.example.BookMyShow01.Service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    TheaterService theaterService;

    @PostMapping("/add")
    public String addTheater(@RequestBody TheaterRequestDto theaterRequestDto){

        return theaterService.createTheater(theaterRequestDto);

    }
    @GetMapping("/find-Theater-By-Name")
    public TheaterEntity findByName(@RequestParam  String theaterName){

        return theaterService.findByName(theaterName);

    }
    @GetMapping("/find-Theater-By-Id")
    public TheaterEntity findById(@RequestParam Integer theaterId){
        return theaterService.findById(theaterId);

    }

    @GetMapping("/find-By-Theater-Name-And-City")
    public TheaterEntity findByTheaterNameAndCity(@RequestParam String name, @RequestParam String city){
       return theaterService.findByTheaterNameAndCity(name,city);
    }
    //Get theaters by theaterId

    //Get all theaters
    @GetMapping("/All-Theater")
    public List<TheaterEntity> findAllTheater(){
        return theaterService.findAllTheater();
    }
}