package com.example.BookMyShow01.Repository;

import com.example.BookMyShow01.Models.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {
}