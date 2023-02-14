package com.example.BookMyShow01.Service;

import com.example.BookMyShow01.Dtos.MovieRequestDto;
import com.example.BookMyShow01.Models.MovieEntity;
import com.example.BookMyShow01.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieRequestDto movieRequestDto){

        //Convert Dto to Entity layer for saving it to the Database.
        MovieEntity movie = MovieEntity.builder().movieName(movieRequestDto.getName()).duration(movieRequestDto.getDuration()).releaseDate(movieRequestDto.getReleaseDate()).build();

        movieRepository.save(movie);

        return "Movie Added successfully";
    }
    public MovieEntity findByName(String name){
        MovieEntity movie= movieRepository.findByMovieName(name);
        return movie;
    }
}