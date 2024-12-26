/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calenderApplication.calender_app.entity;

/**
 *
 * @author DELL
 */
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "companies")
public class Company { 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
@Column(name="id")
private Long id;
@Column(name = "name", nullable = false)
private String name; 
@Column(name="location")
private String location;
@Column(name="linkedin")
private String linkedin;
@Column(name="emails")
private String emails;
@Column(name="phone_numbers")
private String phoneNumbers; 
@Column(name="comments")
private String comments; 
@Column(name="periodicity")
private String periodicity; // Getters and setters

}