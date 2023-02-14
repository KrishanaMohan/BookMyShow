package com.example.BookMyShow01.Controllers;


import com.example.BookMyShow01.Dtos.UserRequestDto;
import com.example.BookMyShow01.Models.UserEntity;
import com.example.BookMyShow01.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody UserRequestDto userRequestDto){
        return userService.createUser(userRequestDto);

    }
    @GetMapping("/Find-By-Name")
    public UserEntity findByName(@RequestParam String userName){
        return userService.findByName(userName);
    }

    @GetMapping("/Find-By-Id")
    public UserEntity findById(@RequestParam Integer id){
        return userService.findById(id);
    }
}