package com.company.People;

import com.company.Vehicles.Car;

import java.util.List;

public class Dealer extends Person {
    private String nickname;
    public List<Car> cars;
    public List<Customer> customers;

    public Dealer(String nickname) {
        setNickname(nickname);
        List<Car> cars;
        List<Customer> customers;
        super.money = 20000.0;
    }

    public Double checkAccount(){
        return GetMoney();
    }


    public String getNickname() {
        return nickname;
    }
    public String GetNickname(){
        return this.nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Double GetMoney(){
        return this.money;
    }


}
