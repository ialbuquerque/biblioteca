package com.company;

/**
 * Created by mmachica on 2/2/16.
 */
public class Printer {
    Menu menu = new Menu();

    public void printWelcome() {
        System.out.println("Welcome!");
    }

    public void printMenu(){
        System.out.println("Menu Options:");
        for (String option : menu.menuOptions) {
            System.out.println(option);
        }
    }
}
