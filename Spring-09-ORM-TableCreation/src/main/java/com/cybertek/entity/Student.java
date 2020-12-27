package com.cybertek.entity;


import javax.persistence.*;


@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentFirstName")
    private String firstName;

    @Column(name = "studentLastName")
    private String lastName;

    @Column(name = "studentEmailAddress")
    private String email;
}