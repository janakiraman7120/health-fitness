package com.health.fitness.entity;

import jakarta.persistence.*;

@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private int duration; // Duration in minutes
    private int userid;


    // Constructors, getters, setters
    public Workout() {}

    public Workout(String name, String type, int duration, int userid) {
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.userid = userid;
    }

    // Getters and setters here
}

