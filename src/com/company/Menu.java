package com.company;

import com.company.Vehicles.Car;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);

    public Menu() {
    }



    public void MainMenu(List<Car> carBase,List<Car> yourBase) {
        System.out.println("*************************************************\n" +
                "  CAR DEALER      MENU          your account:" + "\n" + //add money variable from person.dealer
                "*************************************************\n" +
                "1.Browse cars to buy \n" +
                "2.Browse your car database\n" +
                "3.napraw samochód\n" +
                "4.przejrzyj potencjalnych klientów\n" +
                "5.sprzedaj samochód za określoną cenę potencjalnemu klientowi\n" +
                "6.kup reklamę\n" +
                "7.sprawdź stan konta\n" +
                "8.sprawdź historię transakcji\n" +
                "9.sprawdź historię napraw każdego pojazdu\n" +
                "10.sprawdź sumę kosztów napraw i mycia dla każdego z posiadanych pojazdów\n" +
                "11. EXIT GAME\n");
        this.MainMenuChoice(carBase, yourBase);
    }

    public void MainMenuChoice(List<Car> carBase,List<Car> yourBase) {
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
//                Browse cars to buy
                BrowseCarsToBuy(carBase);
                break;
            case 2:
//                Browse your car database
                BrowseYourCarDataBase(yourBase);
                break;
            case 3:
//
                break;
            case 4:
//                vsv
                break;
            case 5:
//
                break;
            case 6:
//                vsv
                break;
            case 7:
//
                break;
            case 8:
//                vsv
                break;
            case 9:
//
                break;
            case 10:
//
                break;
            case 11:
//
                break;
            default:
//
        }

    }

    public void BrowseCarsToBuy(List<Car> carBase) {
        for (Car car : carBase) {
            int i = 1;
            System.out.println(i + ". " + car);
        }
        System.out.println("1.Buy a car\n" +
                "2. BACK TO MAIN MENU\n");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
//                    buying method
                break;
            case 2:
//                MainMenu(carBase,yourBase);
            default:
        }
    }
    public void BrowseYourCarDataBase(List<Car> yourBase){
        for (Car car : yourBase) {
            int i = 1;
            System.out.println(i + ". " + car);
        }
        System.out.println("1.Buy a car\n" +
                "2. BACK TO MAIN MENU\n");
    }
}
