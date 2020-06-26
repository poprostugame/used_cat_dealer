package com.company.Vehicles;


public class Car {
    protected Double value;
    public String mark;
    public String model;
    protected Integer mileage;
    public String color;
    public String segment;
    protected Part[] parts;

    public Car(Double value, String mark, String model, Integer mileage,
               String color, String segment, Part[] parts){
        this.value = value;
        this.mark = mark;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
        this.segment = segment;
        this.parts = parts;
    }

}
