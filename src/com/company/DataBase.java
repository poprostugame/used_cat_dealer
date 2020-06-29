package com.company;

import com.company.People.Customer;
import com.company.Vehicles.Car;

import java.util.List;

public class DataBase {
    public String[][] carBase;
    public String[] colors = {"blue", "black", "red", "pink", "green"};
    public String[][] customerBase;

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
