package com.solvd.cafe.services;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Table;
import com.solvd.cafe.dataGenerator.GenerateData;
import com.solvd.cafe.exceptions.WrongInputDataException;
import com.solvd.cafe.menu.Menu;
import com.solvd.cafe.people.Administrator;
import com.solvd.cafe.people.Client;
import com.solvd.cafe.people.Waiter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Scanner;

public abstract class MainMenu {
    private final static Logger mainMenuLogger = LogManager.getLogger(MainMenu.class);
    private static final Scanner scanner = new Scanner(System.in);

    private static final List<Branch> branches = GenerateData.BranchGenerator();
    private static final Branch branch = branches.get(0);
    private static final Menu menu = GenerateData.MenuGenerator();
    private static final List<Table> tables = branches.get(0).getTable();
    private static final List<Client> clients = GenerateData.ClientsGenerator();

    //Administrator admin1 = branches.get(0).getAdministrator();

    public static void mainMenu() {
        System.out.println("Welcome to the Administration System of out Cafe! \n Please, select what are you want to do:");
        String answer;
            do {
                System.out.println("1 - Order management\n" +
                        "2 - Employee Management \n" +
                        "3 - Booking Management \n" +
                        "4 - Kitchen Order Management \n" +
                        "0 - Exit");
                answer = scanner.nextLine();
                try{
                    if (!answer.matches("[0-4]")) {
                        throw new WrongInputDataException();
                    }
                } catch (WrongInputDataException e) {
                    mainMenuLogger.error(e.getMessage());
                }
            } while (!answer.matches("[0-4]"));

            switch (answer){
                case "1":
                    orderChoise();
                    break;
                case "2":
                    System.out.println("Need ");
                    break;
                case "3":
                    bookingChoise();
                    break;
                case "4":
                    System.out.println("you choosee 3");
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
    }

    public static void orderChoise(){
        String answer;
        do{
            System.out.println("Order Management page: ");
            System.out.println("1 - Add order\n" +
                    "2 - Update Order \n" +
                    "3 - Find order \n" +
                    "4 - Delete order \n" +
                    "0 - Back");
            answer = scanner.nextLine();
            try{
                if (!answer.matches("[0-4]")){
                    throw new WrongInputDataException();
                }
            } catch (WrongInputDataException e){
                mainMenuLogger.error(e.getMessage());
            }
        }while (!answer.matches("[0-4]"));

        switch (answer){
            case "1":
                OrderManagement.addOrder(branches,menu);
                break;
            case "2":
                System.out.println("Need to implement!");
                break;
            case "3":
                System.out.println("Need to implement!");
                break;
            case "4":
                System.out.println("Need to implement!");
                break;
            case "0":
                mainMenu();
        }

    }

    public static void bookingChoise(){
        String answer;
        do{
            System.out.println("Booking Management page: ");
            System.out.println("1 - Add booking\n" +
                    "2 - Update booking \n" +
                    "3 - Find booking \n" +
                    "4 - Delete booking \n" +
                    "0 - Back");
            answer = scanner.nextLine();
            try{
                if (!answer.matches("[0-4]")){
                    throw new WrongInputDataException();
                }
            } catch (WrongInputDataException e){
                mainMenuLogger.error(e.getMessage());
            }
        }while (!answer.matches("[0-4]"));

        switch (answer){
            case "1":
                BookingManagement.createBook(clients.get(0),branches);
                break;
            case "2":
                System.out.println("Need to implement!");
                break;
            case "3":
                System.out.println("Need to implement!");
                break;
            case "4":
                System.out.println("Need to implement!");
                break;
            case "0":
                mainMenu();
        }

    }
}
