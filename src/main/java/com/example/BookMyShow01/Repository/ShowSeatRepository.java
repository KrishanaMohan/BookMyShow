package com.example.BookMyShow01.Repository;


import com.example.BookMyShow01.Models.ShowSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatRepository extends JpaRepository<ShowSeatEntity,Integer> {
}