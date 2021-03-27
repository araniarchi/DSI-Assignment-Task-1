/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;

/**
 *
 * @author Archi
 */
public class ProductOption {
    ///product attributes are stored in private arraylist
    private ArrayList <Product> products = new ArrayList <Product> ();
    
    public void addProduct(int productName, int buyPrice, int sellPrice, int availableNumber){
        ///adds new product in the product list
        Product object = new Product(productName, buyPrice, sellPrice, availableNumber, 0);
        products.add(object);
    }
    
    public void deleteProduct(int productName){
        ///deletes the product given the name of the product
        
        if(products.size()==0)
            System.out.println("no products to available to delete");
        
        for(int i=0; i<products.size(); i++)
        {
            Product obj = products.get(i);
            if(obj.getProductName()==productName)
            {
                products.remove(i);
                break;
            }
        }
        System.out.println("product deleted");
    }
    
    public void buyProduct(int productName, int quantity){
        ///buys a specific number of the product
        
        if(OOP.availableBalance>0){
            for(int i=0; i<products.size(); i++)
            {
                Product obj = products.get(i); ///creates copy of the product
                if(obj.getProductName()==productName)
                {
                    OOP.availableBalance-=quantity*obj.getBuyPrice(); ///updating balance for buying products by subtracting the cost
                    obj.setAvailableNumber(quantity); ///passes the number of product bought
                    products.set(i, obj); ///updating the original product info
                    break;
                }
            }
            System.out.println("product bought");
        }
    }
    
    public void sellProduct(int productName, int quantity){
        ///sells a specific number of the product
        
        for(int i=0; i<products.size(); i++)
        {
            Product obj = products.get(i);
            if(obj.getProductName()==productName)
            {
                if(quantity>obj.getAvailableNumber()) ///number of selling products cannot exceed the available number of products
                    System.out.println("cannot be sold");
                else{
                    OOP.availableBalance+=quantity*obj.getSellPrice();  ///updating balance for buying products by adding the cost
                    int profit= (obj.getSellPrice()-obj.getBuyPrice())*quantity;  
                    obj.setProfit(profit);  ///passes the profit for the product 
                    obj.setAvailableNumber(-quantity); ///passes the decreased amount of products
                    products.set(i, obj);
                }
                break;
                
            }
        }
    }
    
    public void showProductList(){
        ///shows the list of available products 
        
        for(int i=0; i<products.size(); i++){
            Product obj = products.get(i);
            System.out.println("Product Name: "+obj.getProductName());
            System.out.println("Buy Price: "+obj.getBuyPrice());
            System.out.println("Sell Price: "+obj.getSellPrice());
            System.out.println("Profit: "+obj.getProfit());
            System.out.println("Available number in the inventory: "+obj.getAvailableNumber());
            System.out.println(" ");
        }
        
    }
    
    public void showBalance(){
        ///shows total available balance
        
        System.out.println("Total balance: " +OOP.availableBalance);
    }
    
}
