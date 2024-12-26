/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calenderApplication.calender_app.Controller;

/**
 *
 * @author DELL
 */

import com.calenderApplication.calender_app.Service.CommunicationService;
import com.calenderApplication.calender_app.Service.UserService;
import com.calenderApplication.calender_app.dto.CommunicationDTO;
import com.calenderApplication.calender_app.entity.Communication;
import com.calenderApplication.calender_app.entity.User;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/communications")
public class CommunicationController {

    private final CommunicationService communicationService;
    private final UserService userService;

    @Autowired
    public CommunicationController(CommunicationService communicationService, UserService userService) {
        this.communicationService = communicationService;
        this.userService = userService;
    }

    @GetMapping
    public List<CommunicationDTO> getUserCommunications(Principal principal) {
        User user = userService.getUserByUsername(principal.getName());
        return communicationService.getUserCommunications(user.getId());
    }

    @PostMapping 
    public CommunicationDTO createCommunication(@RequestBody Communication communication, Principal principal) {
        User user = userService.getUserByUsername(principal.getName());
        communication.setUser(user);
        Communication savedCommunication = communicationService.createCommunication(communication); 
    return communicationService.convertToDTO(savedCommunication); }
}
