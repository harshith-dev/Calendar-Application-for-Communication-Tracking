/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calenderApplication.calender_app.Controller;

/**
 *
 * @author DELL
 */

import com.calenderApplication.calender_app.Service.CommunicationMethodService;
import com.calenderApplication.calender_app.entity.CommunicationMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/communication-methods")
public class CommunicationMethodController {

    @Autowired
    private CommunicationMethodService communicationMethodService;

    @GetMapping
    public List<CommunicationMethod> getAllCommunicationMethods() {
        return communicationMethodService.getAllCommunicationMethods();
    }

    @PostMapping
    public CommunicationMethod createCommunicationMethod(@RequestBody CommunicationMethod communicationMethod) {
        return communicationMethodService.createCommunicationMethod(communicationMethod);
    }
}
