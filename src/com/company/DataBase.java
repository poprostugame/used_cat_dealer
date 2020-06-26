package com.company;

import com.company.People.Customer;
import com.company.Vehicles.Car;

import java.util.List;

public class DataBase {
    public String[] marks;
    public String[] models;
    public String[] colors = {"blue", "black", "red", "pink", "green"};
    public String[] segments = {"premium", "standard", "budget"};
    public String[] type = {"VAN", "CAR"};
    public String[] names;
    public String[] surnames;

    public List<Car> carsToBuy;
    public List<Customer> customersToAdd;
    public void DataBaseInsert(){
        //czyta csv i zapisuje do tablic
    }
    public void GenerateCar(){
        //Generator samochodów
    }
    public void GenerateCustomer(){

    }

}
