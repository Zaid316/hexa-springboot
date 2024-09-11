package com.hql.Main;
import java.util.Scanner;

import com.hql.Service.Service;

public class App {

    private static final Service ser = new Service();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add New Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Price of Product");
            System.out.println("4. Calculate Total Bill");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ser.addProduct();
                    break;
                case 2:
                    ser.removeProduct();
                    break;
                case 3:
                    ser.updatePrice();
                    break;
                case 4:
                    ser.calculateBill();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}