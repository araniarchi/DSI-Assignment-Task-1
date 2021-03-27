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
   
    private ArrayList <Product> products = new ArrayList <Product> ();

    public void addProduct(int productName, int buyPrice, int sellPrice, int availableNumber){
        Product object = new Product(productName, buyPrice, sellPrice, availableNumber, 0);
        products.add(object);
    }
    
    public void deleteProduct(int productName){
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
        if(OOP.availableBalance>0){
            for(int i=0; i<products.size(); i++)
            {
                Product obj = products.get(i);
                if(obj.getProductName()==productName)
                {
                    OOP.availableBalance-=quantity*obj.getBuyPrice();
                    obj.setAvailableNumber(quantity);
                    products.set(i, obj);
                    break;
                }
            }
            System.out.println("product bought");
        }
    }
    
    public void sellProduct(int productName, int quantity){
        for(int i=0; i<products.size(); i++)
        {
            Product obj = products.get(i);
            if(obj.getProductName()==productName)
            {
                if(quantity>obj.getAvailableNumber())
                    System.out.println("cannot be sold");
                else{
                    OOP.availableBalance+=quantity*obj.getSellPrice();
                    int profit= (obj.getSellPrice()-obj.getBuyPrice())*quantity;
                    obj.setProfit(profit);
                    obj.setAvailableNumber(-quantity);
                    products.set(i, obj);
                }
                break;
                
            }
        }
    }
    
    public void showProductList(){
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
        System.out.println("Total balance: " +OOP.availableBalance);
    }
    
}
