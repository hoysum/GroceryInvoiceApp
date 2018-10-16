package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          //put this in a loop

        Scanner inItem = new Scanner(System.in);
        String response= "";
        ArrayList<GroceryInvoiceApp> groceries = new ArrayList<>();
        do {
            System.out.println("Input Grocery Item");

            String item = inItem.nextLine();
            System.out.println("Input Grocery Price");
            double price = inItem.nextDouble();

            System.out.println("Input Grocery Quantity");
            int quantity = inItem.nextInt();


            groceries.add(new GroceryInvoiceApp(item, price, quantity));
            System.out.println("Input another Grocery Item? Yes or No");
            response = inItem.next();
            inItem.nextLine();
            } while(!response.equalsIgnoreCase("no"));


        double total =0;
        int purchase=0;
        System.out.println("Item" + "\t Price" + "\t Quantity" + "\t Cost");
        for(GroceryInvoiceApp g:groceries){
            System.out.print(g.getName() + " \t");
            System.out.print("$" + g.getPrice() + "\t\t");
            System.out.print(g.getQuantity() + "\t\t");
            System.out.print("$" + g.getCost() + "\t\t\n");

            total += g.getCost();
            purchase += g.getQuantity();
        }

            System.out.println("Total Purchase Amount = " + "$"+total);
        System.out.println("Total Items Purchased: " + "\t"+ purchase);
    }
}
