/*
 * Author Name: Mohit Saini
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class FurnitureItemImpl {
    public static void main ( String[] args ) {
        FurnitureItem furnitureItem = new FurnitureItem ( );
    
        System.out.println ( "FurnitureCode = " + furnitureItem.furnitureCode );
        System.out.println ( "FurnitureType = " + furnitureItem.furnitureType );
        System.out.println ( "FurnitureGrade = " + furnitureItem.GradeOfFurniture );
        System.out.println ( "FurnitureColor = " + furnitureItem.color );
        System.out.println ( "FurniturePrice = " + furnitureItem.Price );
        System.out.println ( "FurniturePrice After Discount = " + furnitureItem.calculateDiscount ( 5 ) );
    }
    
}
