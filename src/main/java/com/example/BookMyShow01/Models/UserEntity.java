package com.example.BookMyShow01.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String mobile;


    @CreationTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdOn;

    @UpdateTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedOn;


    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @JsonBackReference
    List<TicketEntity> listOfTickets;
}