package com.company;

import com.company.People.Customer;
import com.company.Vehicles.Car;
import com.company.Vehicles.Part;
import com.company.Vehicles.Van;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class DataBase {
    public String[][] carBase = new String[84][4];
    public String[] colors = {"blue", "black", "red", "pink", "green"};
    public String[][] customerBase = new String[75][2];
    public List<Car> carsToBuy = new ArrayList<Car>();
    public List<Customer> customers = new ArrayList<Customer>();

    public void DataBaseInsert() throws FileNotFoundException {
        String delimiter = ";";
        Scanner sc = new Scanner(new File("carBase.csv"));
        for (int i=0;i<84;i++)
        {
            String[] tempArray;
            int j = 0;
            String line = sc.next();
            tempArray = line.split(delimiter);
            carBase[i][j] = tempArray[0];
            carBase[i][j+1] = tempArray[1];
            carBase[i][j+2] = tempArray[2];
            carBase[i][j+3] = tempArray[3];
            j+=4;
        }
        sc = new Scanner(new File("customerBase.csv"));
        for (int i=0;i<75;i++)
        {
            String[] tempArray2;
            int j = 0;
            String line = sc.next();
            tempArray2 = line.split(delimiter);
            customerBase[i][j] = tempArray2[0];
            customerBase[i][j+1] = tempArray2[1];
            j+=2;
        }
    }

    public void GenerateCar(Integer amount){
        for(int i=0;i < amount;i++){
            Integer value = 0;
            int carFromBase = ThreadLocalRandom.current().nextInt(0,83);
            String mark = carBase[carFromBase][0];
            String model = carBase[carFromBase][1];
            Integer mileage = ThreadLocalRandom.current().nextInt(50000,300000);
            String color = colors[ThreadLocalRandom.current().nextInt(0,4)];
            String type = carBase[carFromBase][2];
            String segment = carBase[carFromBase][3];
            if(segment.equals("premium")){
                value = ThreadLocalRandom.current().nextInt(15000, 20000);
            }
            else if (segment.equals("standard")){
                value = ThreadLocalRandom.current().nextInt(5000, 14999);
            }
            else if (segment.equals("budget")){
                value = ThreadLocalRandom.current().nextInt(500, 4999);
            }
            Part[] parts = new Part[5];
            Part breaks = new Part("breaks",ThreadLocalRandom.current().nextBoolean());
            Part suspension = new Part("suspension",ThreadLocalRandom.current().nextBoolean());
            Part engine = new Part("engine",ThreadLocalRandom.current().nextBoolean());
            Part body = new Part("body",ThreadLocalRandom.current().nextBoolean());
            Part transmission = new Part("transmission",ThreadLocalRandom.current().nextBoolean());
            parts[0] = breaks;
            parts[1] = suspension;
            parts[2] = engine;
            parts[3] = body;
            parts[4] = transmission;
            if(type.equals("car")){
                Car car = new Car(value,mark,model,mileage,color,segment,parts);
                this.carsToBuy.add(car);
            }
            else{
                Double loadArea = ThreadLocalRandom.current().nextDouble(500.0, 3000.0);
                Van van = new Van(value,mark,model,mileage,color,segment,parts,loadArea);
                this.carsToBuy.add(van);
            }
        }
    }
    public void GenerateCustomer(Integer amount){
        for(int i=0;i < amount;i++){
            Integer[] markIDs = {1,11,21,31,41,51,61,66,71,81};
            int carFromBase = ThreadLocalRandom.current().nextInt(0,9);
            int customerFromBase = ThreadLocalRandom.current().nextInt(0,74);
            String name = customerBase[customerFromBase][0];
            String surname = customerBase[customerFromBase][1];
            Integer money = ThreadLocalRandom.current().nextInt(1000, 50000);
            String favMark1 = carBase[markIDs[carFromBase]][0];
            String favMark2;
            if(carFromBase==9){
                Integer[] markIDs2 = {1,11,21,31,41,51,61,66,71};
                int carFromBase2 = ThreadLocalRandom.current().nextInt(0,8);
                favMark2 = carBase[carFromBase2][0];
            }
            else
            {
                carFromBase+=1;
                favMark2 = carBase[carFromBase][0];
            }
            String[] types = {"car","car","car","car","van"};
            int carTypeRand = ThreadLocalRandom.current().nextInt(0,4);
            String favCarType = types[carTypeRand];
            Integer condition = ThreadLocalRandom.current().nextInt(0,74);
            Customer customer = new Customer(name,surname,money,favMark1,favMark2,favCarType,condition);
            this.customers.add(customer);
        }
    }

}
