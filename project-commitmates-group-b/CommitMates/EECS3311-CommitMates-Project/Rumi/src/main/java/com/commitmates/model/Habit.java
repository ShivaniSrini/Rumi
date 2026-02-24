package com.commitmates.model;

import jakarta.persistence.*;

@Entity
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private int hours;
    private int minutes;

    public Habit() {}

    public Habit(String title, String description, int hours, int minutes) {
        this.title = title;
        this.description = description;
        this.hours = hours;
        this.minutes = minutes;
    }

    public Long getId() { 
    	return id; 
    }
    
    public void setId(Long id) { 
    	this.id = id; 
    }

    public String getTitle() { 
    	return title; 
    }
    
    public void setTitle(String title) { 
    	this.title = title; 
    }

    public String getDescription() { 
    	return description; 
    }
    
    public void setDescription(String description) { 
    	this.description = description; 
    }

    public int getHours() { 
    	return hours; 
    }
    
    public void setHours(int hours) { 
    	this.hours = hours; 
    }

    public int getMinutes() { 
    	return minutes; 
    }
    
    public void setMinutes(int minutes) { 
    	this.minutes = minutes; 
    }
}
