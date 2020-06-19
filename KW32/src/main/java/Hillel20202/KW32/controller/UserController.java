package Hillel20202.KW32.controller;

import Hillel20202.KW32.dto.UserDto;
import Hillel20202.KW32.model.User;
import Hillel20202.KW32.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    public String getUserByName(@RequestParam String name) {
        return name;
    }

    @GetMapping("/user/all")
    public List<UserDto> getUsers() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        return mapperFactory.getMapperFacade().mapAsList(userService.getAllUsers(), UserDto.class);
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable Long id) {
        return "test" + id;
    }

    @PostMapping("/user")
    public void setUser(@RequestBody UserDto user) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        userService.saveUser(mapperFactory.getMapperFacade().map(user, User.class));
    }

    @PutMapping("/user")
    public void updatedUser(@RequestBody UserDto user) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        userService.updateUser(mapperFactory.getMapperFacade().map(user, User.class));
    }


    @DeleteMapping("/user/{id}")
    public boolean deleteUserById(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

}