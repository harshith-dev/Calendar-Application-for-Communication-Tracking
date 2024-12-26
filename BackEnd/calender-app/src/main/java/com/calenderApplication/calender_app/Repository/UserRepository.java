/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calenderApplication.calender_app.Repository;

import com.calenderApplication.calender_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DELL
 */
public interface UserRepository extends JpaRepository<User,Long> {
        User findByUsername(String username);
        boolean existsByUsername(String username);
        
}
