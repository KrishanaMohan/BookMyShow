package com.example.BookMyShow01.Service;


import com.example.BookMyShow01.Dtos.UserRequestDto;
import com.example.BookMyShow01.Models.UserEntity;
import com.example.BookMyShow01.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String createUser(UserRequestDto userRequestDto){

        //Converted the userRequestDto to UserEntity
        UserEntity userEntity = UserEntity.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();
            userRepository.save(userEntity);
        return "User added sucessfully";
    }
    public UserEntity findByName(String userName){
        return userRepository.findByName(userName);
    }

    public UserEntity findById (Integer id){
        return userRepository.findById(id).get();
    }
}