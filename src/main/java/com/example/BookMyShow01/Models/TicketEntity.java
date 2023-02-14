package com.example.BookMyShow01.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="tickets")
@Data
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String alloted_seats;

    private int amount;

    private Date booked_at;

    //Here you will connect
    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private UserEntity user; //

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private ShowEntity show;

    @OneToMany(mappedBy = "ticket",cascade = CascadeType.ALL)
    @JsonBackReference
    private List<ShowSeatEntity> bookedSeats;

}