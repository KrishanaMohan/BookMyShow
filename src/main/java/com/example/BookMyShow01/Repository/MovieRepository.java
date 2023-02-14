package com.example.BookMyShow01.Repository;
import com.example.BookMyShow01.Models.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {

    public MovieEntity findByMovieName(String movieName);

}