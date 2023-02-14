package com.example.BookMyShow01.Repository;

import com.example.BookMyShow01.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
     public UserEntity findByName(String userName);
}