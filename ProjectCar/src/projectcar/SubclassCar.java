/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectcar;

/**
 *
 * @author Fujoshi Shouter
 */
public class SubclassCar {
    int year;
    String brand;
    String model;
    
    public SubclassCar(int year, String brand, String model){
        this.year = year;
        this.brand = brand;
        this.model = model;
    }
    public String toString(){
        return "Car{ " + " year= " + year + " brand= " + brand + " model= " + model + " }";
    }
}
