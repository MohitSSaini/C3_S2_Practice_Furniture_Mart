/*
 * Author Name: Mohit Saini
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    char GradeOfFurniture;
    String color;
    String furnitureUsage;
    double Price;
    
    public FurnitureItem ( ) {
        this.furnitureCode = 34532;
        this.furnitureType = "Table";
        GradeOfFurniture = 'A';
        this.color = "Red";
        this.furnitureUsage = "OutDoor";
        Price = 1499.10;
    }
    
    public double calculateDiscount ( ) {
        double discount = 5;
        double discountPaidAmount = 0;
        if ( furnitureUsage.equals ( "Outdoor" ) ) {
            discountPaidAmount = Price - ( Price * discount ) / 100;
            
        }
        return discountPaidAmount;
        
        
    }
}
