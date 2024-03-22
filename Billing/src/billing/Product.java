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
   //acess methods
    public void setCode(int code){
        this.code = code;
    }
    public int getCode(){
        return code;
    }    
    public void setDescription(String description){
        this.description =  description;
    }
    public String getDescription(){
        return  description;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setQuantilySold(int quantilySold){
        this.quantilySold = quantilySold;
    }
    public double getQuantilySold(){
        return quantilySold;
    }
    public double getTotalSales(){
        return totalSales;
    }
    
    public void calculateTotalSales(){
        totalSales = quantilySold * unitPrice;
    }
}
