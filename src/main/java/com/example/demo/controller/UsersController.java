package com.example.demo.controller;

import com.example.demo.dto.UsersDto;
import com.example.demo.entity.Users;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("test")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("find")
    public List<Users> find(@RequestParam String id) {
        return usersService.find(id);
    }

    @PostMapping("create")
    public Boolean create(@RequestBody UsersDto users) {
        return usersService.create(users);
    }

    @PostMapping("update")
    public Boolean update(@RequestBody Users users) {
        return usersService.update(users);
    }

    @PostMapping("delete")
    public void delete(@RequestBody Users users) {
        usersService.delete(users);
    }
}
