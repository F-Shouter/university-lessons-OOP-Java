/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fujoshi Shouter
 */
public class SubClassStudent {
    private double average;
    private double a1;
    private double a2;
    
    //Constructor
    public SubClassStudent(){
        average = 0; 
    }
    
    //Acess methods
    public void setA1(double a1){
        this.a1 = a1;
    }
    
    public void setA2(double a2){
        this.a2 = a2;
    }
    
    public double getA1(){
        return a1;
    }  
    
    public double getA2(){
        return a2;
    }
    
    public double getAverage(){
        return average;
    }
    
    public void calculateAverage(){
        average = (a1 + 2*a2)/3;
    }
}
