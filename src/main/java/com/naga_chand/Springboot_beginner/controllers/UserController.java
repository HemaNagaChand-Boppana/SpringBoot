package com.naga_chand.Springboot_beginner.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naga_chand.Springboot_beginner.models.User;
import com.naga_chand.Springboot_beginner.services.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    public UserController(UserService uService){
        this.userService = uService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id){
        User res = userService.getUserById(id);
        if(res!=null)
            return ResponseEntity.ok(res);
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public User addNewUser(@RequestBody User user){
        return userService.addNewUser(user);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User res = userService.updateUser(user);
        if(res!=null)
            return ResponseEntity.ok(res);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUserById(@PathVariable int id){
        User res = userService.deleteUserById(id);
        if(res!=null)
            return ResponseEntity.ok(res);
        return ResponseEntity.notFound().build();
    }



    
}
