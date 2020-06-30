package com.company.People;

import com.company.DataBase;
import com.company.Vehicles.Car;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Dealer extends Person {
    private String nickname;
    public List<Car> cars;
    public static int MOVES = 0;
    public Integer carWash = 50;
    public List<String> transactionHistory;

    public Dealer(String nickname) {
        setNickname(nickname);
        this.cars = new ArrayList<>();
        this.money = 20000;
        this.transactionHistory = new ArrayList<>();
    }

    public Integer checkAccount(){
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
    public Integer GetMoney(){
        return this.money;
    }

    public void AddMove(){
        MOVES++;
    }
    public int Moves(){
        return MOVES;
    }
    public void buyCar(DataBase dataBase, Integer id){
        if(dataBase.carsToBuy.contains(dataBase.carsToBuy.get(id))){
            int carPricePlusCosts = dataBase.carsToBuy.get(id).value +
                    ((int) Math.floor(this.carWash + dataBase.carsToBuy.get(id).value * 0.02));
            if(this.money > carPricePlusCosts){
                System.out.println("You bought " + dataBase.carsToBuy.get(id));
                this.money -= carPricePlusCosts;
                dataBase.carsToBuy.get(id).setCostSum(this.carWash);
                this.transactionHistory.add(Calendar.DATE + " " +
                        this.getNickname() + " bought.");
                this.cars.add(dataBase.carsToBuy.get(id));
                dataBase.carsToBuy.remove(dataBase.carsToBuy.get(id));
                dataBase.GenerateCar(1);
                this.AddMove();
            }else System.out.println("Sorry but you don't have enough money to buy " +
                    dataBase.carsToBuy.get(id).mark + " " + dataBase.carsToBuy.get(id).model);

        }else System.out.println("There's no ID " + id + " in a group of cars to buy.");
    }
}
