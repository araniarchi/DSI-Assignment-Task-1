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
public class Product {
    ///a product contains following information
    private int productName;
    private int buyPrice;
    private int sellPrice;
    private int availableNumber;
    private int profit;
    
    
    public Product(int productName, int buyPrice, int sellPrice, int availableNumber, int profit)
    {
            this.productName=productName;
            this.buyPrice=buyPrice;
            this.sellPrice=sellPrice;
            this.availableNumber=availableNumber;
            profit=0; ///initially profit will be zero
    }
    

    public int getProductName(){
        return productName;  ///returns name of the product
    }
    

    public int getBuyPrice(){
        return buyPrice;  ///returns the buying price of the product
    }
    

    public int getSellPrice(){
        return sellPrice;  ///returns the selling price of the product
    }
    
    public void setAvailableNumber(int c){
        availableNumber+=c;   ///given the quantity of products that are bought or sold, updates the available number of the product 
    }
    public int getAvailableNumber(){
        return availableNumber;  ///returns the current available number of the product 
    }
    
    public void setProfit(int n){
        profit+=n;  ///given the profit made from the product, total profit is updated
    }
    public int getProfit(){
        return profit;  ///returns the total profit for the product
    }
    
    

}
