package com.company.People;

import com.company.Vehicles.Car;

import java.util.List;

public class Dealer extends Person {
    public List<Car> carList;
    public Boolean checkAccount(){
        return false;
    }
}
