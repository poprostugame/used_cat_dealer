package com.company.Vehicles;

public class Part {
    public String name;
    public Boolean broken;

    public Part(String name, Boolean broken){
        this.name = name;
        this.broken = broken;
    }
    public String toString(){
        if(broken){
            return name + ": BROKEN ";
        }else return name + ": OK ";
    }
    public Integer partValue(Car car){
        int newPart = 0;
        /*
        VOLKSWAGEN 70
        FORD 60
        RENAULT 50
        PEUGEOT 40
        OPEL 20
        MERCEDES 100
        AUDI 80
        BMW 90
        FIAT 10
        SKODA 30
         */
        switch (car.mark){
            case "VOLKSWAGEN":
                newPart += 70;
                break;
            case "FORD":
                newPart += 60;
                break;
            case "RENAULT":
                newPart += 50;
                break;
            case "PEUGEOT":
                newPart += 40;
                break;
            case "OPEL":
                newPart += 20;
                break;
            case "MERCEDES":
                newPart += 100;
                break;
            case "AUDI":
                newPart += 80;
                break;
            case "BMW":
                newPart += 90;
                break;
            case "FIAT":
                newPart += 10;
                break;
            case "SKODA":
                newPart += 30;
                break;
        }
        switch (this.name){
            case "breaks":
                newPart += 10;
                break;
            case "suspension":
                newPart += 20;
                break;
            case "engine":
                newPart += 500;
                break;
            case "body":
                newPart += 100;
                break;
            case "transmission":
                newPart += 200;
                break;
        }
        return newPart;
    }
}
