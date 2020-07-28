package com.example.demo.service;

import com.example.demo.dto.UsersDto;
import com.example.demo.entity.Users;
import com.example.demo.jpa.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsersService {
    @Autowired
    private UsersRepo usersRepo;

    public List<Users> find(String id) {
        return usersRepo.findByFirstName(id);
    }

    public Boolean create(UsersDto user) {
        System.out.println(user.getFirstName() + " " + user.getLastName());
        Users users = new Users();
        users.setFirstName(user.getFirstName());
        users.setLastName(user.getLastName());
        users.setPatramonic(user.getPatramonic());
        users = usersRepo.save(users);
        return users != null;
    }

    public Boolean update(Users user) {
        Users updatingUser = usersRepo.getOne(user.getUserId());
        updatingUser.setPatramonic(user.getPatramonic());
        updatingUser.setFirstName(user.getFirstName());
        updatingUser.setLastName(user.getLastName());
        Users us = usersRepo.save(user);
        return us != null;
    }

    public void delete(Users user) {
        usersRepo.delete(user);
    }
}
