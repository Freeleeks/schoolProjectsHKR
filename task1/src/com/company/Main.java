package com.company;

import java.util.Scanner;

public class Main {
    private Customer[] planeArray = new Customer[100];
    private Scanner userInput = new Scanner(System.in);
    private int newSeatNumber;

    public static void main(String[] args) {
        Main myBookingApp = new Main();
        int menuSelection = 0;
        boolean run = true;
        do {
            myBookingApp.menuOptions();
            menuSelection = myBookingApp.userInput.nextInt();
            switch (menuSelection) {
                case 1:
                    myBookingApp.addNewCustomer();
                    break;
                case 2:
                    myBookingApp.ViewSeats();
                    break;
                case 3:
                    System.out.println("Thank you! Have a good flight! ");
                    run = false;
                    break;

            }
        } while (run);
    }

    public void menuOptions() {
        System.out.println("-- Menu -- ");
        System.out.println("(1.) Add booking ");
        System.out.println("(2.) View bookings ");
        System.out.println("(3.) Exit ");
    }

    public void addNewCustomer() {
        System.out.println("Please enter the name of the customer you would like to book ");
        String newName = userInput.nextLine();
        newName = userInput.nextLine();
        // Customer newCustomer = new Customer(newName); changed the position for to after the seat was selected
        // per the requirement in the instructions

        System.out.println("Please enter the seat number you would like to place the customer in ");
        newSeatNumber = userInput.nextInt();
        userInput.nextLine();
        Customer newCustomer = new Customer(newName);
        if (planeArray[newSeatNumber] == null) {
            planeArray[newSeatNumber] = newCustomer;
        } else {
            do {
                System.out.println("That seat is already taken sadly, please select another seat ");
                newSeatNumber = userInput.nextInt();
            } while (planeArray[newSeatNumber] != null);
            planeArray[newSeatNumber] = newCustomer;
        }

    }

    public void ViewSeats() {
        for (int i = 0; i < planeArray.length; i++)
            if (planeArray[i] == null) {
                System.out.println("[" + i + "]" + " Not booked");
            } else
                System.out.println("[" + i + "]" + planeArray[i].getName());
    }
}
