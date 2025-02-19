/*
* File: Henger.java
* Author: Ritzl Bence
* Copyright: 2025, Ritzl Bence
* Group: Szoft II/1/N
* Date: 2025-02-19
* Github: https://github.com/notdefinitelynot/
* Licenc: GNU GPL
*/

package com.example;

public class Henger {
    Integer id;
    Double radius;
    Double lenght;
    Double surface;
    
    
    public Henger() {
    }


    public Henger(Double radius, double lenght, double surface) {
        this.radius = radius;
        this.lenght = lenght;
        this.surface = surface;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Double getRadius() {
        return radius;
    }


    public void setRadius(Double radius) {
        this.radius = radius;
    }


    public double getLenght() {
        return lenght;
    }


    public void setLenght(double lenght) {
        this.lenght = lenght;
    }


    public double getSurface() {
        return surface;
    }


    public void setSurface(double surface) {
        this.surface = surface;
    }

    

    
}
