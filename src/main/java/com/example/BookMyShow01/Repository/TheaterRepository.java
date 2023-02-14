package com.example.BookMyShow01.Repository;


import com.example.BookMyShow01.Models.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {

    public TheaterEntity findByNameAndCity(String name,String city);
   TheaterEntity findByName(String theaterName);

}