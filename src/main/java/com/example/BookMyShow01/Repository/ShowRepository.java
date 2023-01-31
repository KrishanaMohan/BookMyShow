package com.example.BookMyShow01.Repository;


import com.example.BookMyShow01.Models.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {
}