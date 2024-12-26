/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calenderApplication.calender_app.Controller;

/**
 *
 * @author DELL
 */
import com.calenderApplication.calender_app.Service.UserService;
import com.calenderApplication.calender_app.entity.User;
import com.calenderApplication.calender_app.entity.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("/me")
    public User getUserDetails(Principal principal) {
        return userService.getUserByUsername(principal.getName());
    }

    @PutMapping("/me")
    public User updateUser(@RequestBody User user, Principal principal) {
        User existingUser = userService.getUserByUsername(principal.getName());
        return userService.updateUser(existingUser.getId(), user);
    }

    @GetMapping("/me/communications")
    public List<Communication> getUserCommunications(Principal principal) {
        return userService.getUserCommunications(principal.getName());
    }

    @PostMapping("/me/communications")
    public Communication logCommunication(Principal principal, @RequestBody Communication communication) {
        return userService.logCommunication(principal.getName(), communication);
    }
}
