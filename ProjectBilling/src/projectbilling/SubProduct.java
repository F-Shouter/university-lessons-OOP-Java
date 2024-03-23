/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbilling;

/**
 *
 * @author Fujoshi Shouter
 */
public class SubProduct {
    private int code;
    private String description;
    private double unitPrice;
    private int quantilySold;
    
    //constructor
    public SubProduct(){}
    
    //acess methods
    public void setCode(int code){
        this.code = code;
    }
    public int getCode(){
        return code;
    } 
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
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
    public int getQuantilySold(){
        return quantilySold;
    }
    
    public double calculateTotal(){
        return unitPrice * quantilySold;
    }
}
