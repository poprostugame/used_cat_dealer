package com.company.People;

import com.company.Vehicles.Part;

import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

public class Mechanic extends Person{
    public Double chanceToRepair;
    public Double repairCost;

    public static final Double JANUSZ_CHANCE_TO_REPAIR = 1.0;
    public static final Double MARIAN_CHANCE_TO_REPAIR = 0.9;
    public static final Double ADRIAN_CHANCE_TO_REPAIR = 0.8;
    public static final Double JANUSZ_REPAIR_COST = 0.1;
    public static final Double MARIAN_REPAIR_COST = 0.5;
    public static final Double ADRIAN_REPAIR_COST = 0.01;
    public Mechanic(String name) {
        this.name = name;
        switch (name) {
            case "Janusz":
                this.chanceToRepair = JANUSZ_CHANCE_TO_REPAIR;
                this.repairCost = JANUSZ_REPAIR_COST;
                break;
            case "Marian":
                this.chanceToRepair = MARIAN_CHANCE_TO_REPAIR;
                this.repairCost = MARIAN_REPAIR_COST;
                break;
            case "Adrian":
                this.chanceToRepair = ADRIAN_CHANCE_TO_REPAIR;
                this.repairCost = ADRIAN_REPAIR_COST;
                break;
        }
    }
    public void fixCar(Dealer dealer, Integer id){
        if(dealer.cars.contains(dealer.cars.get(id))){
            int wholeRepairCost = 0;

            for(Part part:dealer.cars.get(id).parts){
                if(part.broken){
                    wholeRepairCost += (int) Math.floor(this.repairCost * dealer.cars.get(id).value +
                            part.partValue(dealer.cars.get(id)));
                }
            }
            if(dealer.money > wholeRepairCost){
                dealer.money -= wholeRepairCost;
                for(Part part:dealer.cars.get(id).parts) {
                    if (part.broken) {
                        int random = ThreadLocalRandom.current().nextInt(1,10);
                        if(this.chanceToRepair * 10 >= random) {
                            part.broken = true;
                            switch (part.name) {
                                case "breaks":
                                    dealer.cars.get(id).value += (int) Math.floor(dealer.cars.get(id).value * 0.1);
                                    System.out.println("The brakes have been repaired");
                                    dealer.cars.get(id).repairHistory.add(Calendar.DATE + " " + part.name + " repair");
                                    break;
                                case "suspension":
                                    dealer.cars.get(id).value += (int) Math.floor(dealer.cars.get(id).value * 0.2);
                                    System.out.println("The suspension has been repaired");
                                    dealer.cars.get(id).repairHistory.add(Calendar.DATE + " " + part.name + " repair");
                                    break;
                                case "engine":
                                    dealer.cars.get(id).value += (int) Math.floor(dealer.cars.get(id).value * 1.);
                                    System.out.println("The engine has been repaired");
                                    dealer.cars.get(id).repairHistory.add(Calendar.DATE + " " + part.name + " repair");
                                    break;
                                case "body":
                                    dealer.cars.get(id).value += (int) Math.floor(dealer.cars.get(id).value * 0.5);
                                    System.out.println("The body has been repaired");
                                    dealer.cars.get(id).repairHistory.add(Calendar.DATE + " " + part.name + " repair");
                                    break;
                                case "transmission":
                                    dealer.cars.get(id).value += (int) Math.floor(dealer.cars.get(id).value * 0.5);
                                    System.out.println("The transmission has been repaired");
                                    dealer.cars.get(id).repairHistory.add(Calendar.DATE + " " + part.name + " repair");
                                    break;
                            }
                        }else if (this.repairCost * 10 < random || this.repairCost > 8){
                            System.out.println(this.name + " failed. He can't repair " + part.name);
                            System.out.println("Only Janusz can repair this part.");

                        }

                    }
                }
                dealer.cars.get(id).setCostSum(wholeRepairCost);
            }
            else System.out.println("You don't have enough money to repair " + dealer.cars.get(id).mark +
                    " " + dealer.cars.get(id).model);
        }else System.out.println("There's no ID " + id + " in your car base.");
    }
}
