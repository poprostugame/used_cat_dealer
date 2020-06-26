package com.company.Vehicles;

public class Van extends Car{
    public Integer loadArea;

    public Van(Double value, String mark, String model, Integer mileage,
               String color, String segment, Part[] parts, Integer loadArea) {
        super(value, mark, model, mileage, color, segment, parts);
        this.loadArea = loadArea;
    }
}
