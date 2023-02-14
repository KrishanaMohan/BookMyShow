package com.example.BookMyShow01.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="theater")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TheaterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(unique = true)
    private String name;

    private String city;

    private String address;

    //List of shows
    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    @JsonBackReference
    List<ShowEntity> listOfShows;


    //List of theater seats
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    @JsonBackReference
    List<TheaterSeatEntity> theaterSeatEntityList;



}