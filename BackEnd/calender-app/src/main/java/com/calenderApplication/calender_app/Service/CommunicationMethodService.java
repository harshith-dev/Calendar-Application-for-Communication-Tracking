/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calenderApplication.calender_app.Service;

/**
 *
 * @author DELL
 */

import com.calenderApplication.calender_app.Repository.CommunicationMethodRepository;
import com.calenderApplication.calender_app.entity.CommunicationMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunicationMethodService {

    @Autowired
    private CommunicationMethodRepository communicationMethodRepository;

    public List<CommunicationMethod> getAllCommunicationMethods() {
        return communicationMethodRepository.findAll();
    }

    public CommunicationMethod createCommunicationMethod(CommunicationMethod communicationMethod) {
        return communicationMethodRepository.save(communicationMethod);
    }
}
