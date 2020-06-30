package com.company.Vehicles;

public class Van extends Car{
    public Double loadArea;

    public Van(Integer value, String mark, String model, Integer mileage,
               String color, String segment, Part[] parts, Double loadArea) {
        super(value, mark, model, mileage, color, segment, parts);
        this.loadArea = loadArea;
    }
}
