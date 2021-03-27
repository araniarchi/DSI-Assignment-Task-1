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
    private int productName;
    //int productId;
    private int buyPrice;
    private int sellPrice;
    private int availableNumber;
    private int profit;
    //int availableBalance;
    
    
    public Product(int productName, int buyPrice, int sellPrice, int availableNumber, int profit)
    {
            this.productName=productName;
            this.buyPrice=buyPrice;
            this.sellPrice=sellPrice;
            this.availableNumber=availableNumber;
            //this.profit=profit;
            profit=0;
    }
    

    public int getProductName(){
        return productName;
    }
    

    public int getBuyPrice(){
        return buyPrice;
    }
    

    public int getSellPrice(){
        return sellPrice;
    }
    
    public void setAvailableNumber(int c){
        //this.availableNumber=availableNumber;
        availableNumber+=c;
    }
    public int getAvailableNumber(){
        return availableNumber;
    }
    
    public void setProfit(int n){
        profit+=n;
    }
    public int getProfit(){
        return profit;
    }
    
    

}
