package com.hql.Service;

import com.hql.Dao.*;
import com.hql.Model.*;
import java.util.Scanner;

public class Service {
    private final ProductDAOImpl productDAO = new ProductDAOImpl();
    private final Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        Product product = new Product();
        product.setPid(id);
        product.setName(name);
        product.setPrice(price);

        productDAO.addProduct(product);
    }

    public void removeProduct() {
        System.out.print("Enter Product ID to remove: ");
        int id = sc.nextInt();
        productDAO.removeProduct(id);
    }

    public void updatePrice() {
        System.out.print("Enter Product ID to update: ");
        int id = sc.nextInt();
        System.out.print("Enter New Price: ");
        double newPrice = sc.nextDouble();

        productDAO.updatePrice(id, newPrice);
    }

    public void calculateBill() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        double total = productDAO.calculateBill(id, quantity);
        if (total > 0) {
            System.out.println("Total Bill: " + total);
        }
    }
}
    

