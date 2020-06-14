package Hillel20202.KW32.controller;

import Hillel20202.KW32.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/api/v1/user")
@RestController
@Slf4j
public class UserControler {


    @GetMapping("/user")
    public String getUserByName(@RequestParam String name){
        return name;
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable Long id){
        return "test"+id;
    }

    @PostMapping("/user")
    public void setUser(@RequestBody UserDto user){
        log.info(user.toString());
    }


}