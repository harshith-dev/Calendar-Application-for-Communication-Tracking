/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calenderApplication.calender_app.Service;

/**
 *
 * @author DELL
 */


import com.calenderApplication.calender_app.dto.CommunicationDTO;
import com.calenderApplication.calender_app.entity.Communication;
import com.calenderApplication.calender_app.Repository.CommunicationRepository;
import com.calenderApplication.calender_app.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommunicationService {

    @Autowired
    private CommunicationRepository communicationRepository;

    public List<CommunicationDTO> getUserCommunications(Long userId) {
        List<Communication> communications = communicationRepository.findByUserId(userId);
        return communications.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    
    public Communication createCommunication(Communication communication){
        return communicationRepository.save(communication); 
    }
    public CommunicationDTO convertToDTO(Communication communication) { 
        UserDTO userDTO = new UserDTO( communication.getUser().getId(), 
                communication.getUser().getUsername(), 
                communication.getUser().getEmail(), 
                communication.getUser().getRole() );
        return new CommunicationDTO( communication.getId(),
                communication.getCommunicationDate(), 
                communication.getNotes(), 
                userDTO );
    }
}
