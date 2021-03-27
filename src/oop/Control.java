/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author Archi
 */
public class Control {
    
    void startProgram(){
        ProductOption obj= new ProductOption();
        char option= '\0';
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Press 1 to add product");
            System.out.println("Press 2 to delete product");
            System.out.println("Press 3 to buy product");
            System.out.println("Press 4 to sell product");
            System.out.println("Press 5 to show products");
            System.out.println("Press 6 to check available balance");
            System.out.println("Press 7 to exit");
            System.out.println("===================");
            System.out.println("Enter your option: ");
            
            option= scanner.next().charAt(0);
            switch(option)
            {
                case '1': //add product 
                    
                    System.out.println("product name: ");
                    int productName = scanner.nextInt();
                    System.out.println("buy price: ");
                    int buyPrice = scanner.nextInt();
                    System.out.println("sell price: ");
                    int sellPrice = scanner.nextInt();
                    System.out.println("availableNumber: ");
                    int availableNumber = scanner.nextInt();
                    obj.addProduct(productName, buyPrice, sellPrice, availableNumber);
                    System.out.println("===================");
                    break;
                    
                case '2': //delete product
                    
                    System.out.println("Product to be deleted: ");
                    productName = scanner.nextInt();
                    obj.deleteProduct(productName);
                    break;
                    
                case '3': //buy product
                    
                    System.out.println("Buy product: ");
                    System.out.println("Product Name & Number of products to buy: ");
                    productName = scanner.nextInt();
                    availableNumber = scanner.nextInt();
                    obj.buyProduct(productName, availableNumber);
                    System.out.println("===================");
                    break;
                    
                case '4': //sell product
                    System.out.println("Sell product: ");
                    System.out.println("Product Name & Number of products to sale: ");
                    productName = scanner.nextInt();
                    availableNumber = scanner.nextInt();
                    obj.sellProduct(productName, availableNumber);
                    System.out.println("===================");
                    break;
                    
                case '5': //show products
                    System.out.println("The List of Products are: ");
                    obj.showProductList();
                    System.out.println("===================");
                    break;
                
                case '6': //check balance
                    System.out.println("The available balance is: ");
                    obj.showBalance();
                    System.out.println("===================");
                    break;
                
                case '7': //other
                    exit();
            }
        }
        while(true);
    }
}
