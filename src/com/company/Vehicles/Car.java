package com.company.Vehicles;


import com.company.DataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    public Integer value;
    public String mark;
    public String model;
    protected Integer mileage;
    public String color;
    public String segment;
    public Part[] parts;
    private Integer costSum;
    public List<String> repairHistory;

    public Car(Integer value, String mark, String model, Integer mileage,
               String color, String segment, Part[] parts){
        this.value = value;
        this.mark = mark;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
        this.segment = segment;
        this.parts = parts;
        this.repairHistory = new ArrayList<>();
        this.costSum = 0;
    }

    @Override
    public String toString() {
        return mark + " " + model + "\nMileage:" + mileage + "km Color: " + color + " Class: " +
                segment + "\n" + value + "$\n" + " " + parts[0] + parts[1]
                + parts[2] + parts[3] + parts[4];
    }

    public Integer getCostSum(){
        return costSum;
    }
    public void setCostSum(int cost){
        costSum += cost;
    }
}
