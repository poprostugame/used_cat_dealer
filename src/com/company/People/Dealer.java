package com.company.People;

import com.company.Vehicles.Car;

import java.util.List;

public class Dealer extends Person {

    public List<Car> cars;
    public List<Customer> customers;

    public Dealer(String name, String surname, String money,List<Car> cars) {
        super(name, surname, money);
        this.cars = cars;
    }

    public Boolean checkAccount(){
        return false;
    }


}
