/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calenderApplication.calender_app.Controller;

/**
 *
 * @author DELL
 */

import com.calenderApplication.calender_app.Service.UserCommunicationService;
import com.calenderApplication.calender_app.entity.UserCommunication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-communications")
public class UserCommunicationController {

    @Autowired
    private UserCommunicationService userCommunicationService;

    @GetMapping
    public List<UserCommunication> getAllUserCommunications() {
        return userCommunicationService.getAllUserCommunications();
    }

    @PostMapping
    public UserCommunication createUserCommunication(@RequestBody UserCommunication userCommunication) {
        return userCommunicationService.createUserCommunication(userCommunication);
    }
}
