/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectteacher;

/**
 *
 * @author Fujoshi Shouter
 */
public class SubTeacher {
    private String name;
    private double hours;
    private double salary;
    private static double valuePerHour = 50;
    
    //constructor
    public SubTeacher(String name, double hours){
        this.name = name;
        this.hours = hours;
}
    //acess methods
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setHours(double hours){
        this.hours = hours;
    }
    public void setValuePerHour(double valuePerHour){
        this.valuePerHour = valuePerHour;
    }
    public double getValuePerHour(){
        return valuePerHour;
    }
    public double getHours(){
        return hours;
    }
    public double getSalary(){
        return salary;
    }
    public void calculateSalary(){
        salary = hours*SubTeacher.valuePerHour;
    }
    public double calculateIRPF(){
        double aux;
        if(salary<1800){
            aux = 0.1*salary;
        }
        else{
            aux = 0.27*salary;
        }
        return (aux);
    }
}
