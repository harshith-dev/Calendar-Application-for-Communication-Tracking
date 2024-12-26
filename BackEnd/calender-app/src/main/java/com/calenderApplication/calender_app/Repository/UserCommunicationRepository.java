/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.calenderApplication.calender_app.Repository;

import com.calenderApplication.calender_app.entity.UserCommunication;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DELL
 */
public interface UserCommunicationRepository extends JpaRepository<UserCommunication, Long> {}
