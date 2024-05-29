package com.example.task_01.models;

import org.springframework.web.bind.annotation.RestController;

public class Greeting {
    private String name;
    private String timeOfDay;

    public Greeting (String name, String timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public String getTimeofDay(){
        return this.timeOfDay;
    }

    public void setTimeofDay(){
        this.timeOfDay = timeOfDay;
    }

}
