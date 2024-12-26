/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calenderApplication.calender_app.Service;

/**
 *
 * @author DELL
 */

import com.calenderApplication.calender_app.Repository.UserCommunicationRepository;
import com.calenderApplication.calender_app.entity.UserCommunication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCommunicationService {

    @Autowired
    private UserCommunicationRepository userCommunicationRepository;

    public List<UserCommunication> getAllUserCommunications() {
        return userCommunicationRepository.findAll();
    }

    public UserCommunication createUserCommunication(UserCommunication userCommunication) {
        return userCommunicationRepository.save(userCommunication);
    }
}

