/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billing;

/**
 *
 * @author Fujoshi Shouter
 */
public class Product {
    private int code;
    private String description;
    private double unitPrice;
    private int quantilySold;
    private double totalSales;
    
    //constructor
    public Product (int code, String description, double unitPrice, int quantilySold){
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantilySold = quantilySold;
    }
   
}
