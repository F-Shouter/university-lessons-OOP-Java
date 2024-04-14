/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpaper;

/**
 *
 * @author Fujoshi Shouter
 */
public class Hourly extends Employee{
    private double hours;
    
    //Constructor
    public Hourly(String name, String address, double hours){
        super(name, address);
        this.hours = hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }
    public double getHours() {
        return hours;
    }
    public void calcularWage(){
        wage = hours * 50;
    }         
}
