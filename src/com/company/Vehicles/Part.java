package com.company.Vehicles;

public class Part {
    public String name;
    protected Boolean broken;
    protected Double price;

    public Part(String name, Boolean broken, Double price){
        this.name = name;
        this.broken = broken;
        this.price = price;
    }
}
