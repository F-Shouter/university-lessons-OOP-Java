  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpaper;
/**
 *
 * @author Fujoshi Shouter
 */
public class Employee {
    protected String name;
    protected String address;
    protected double wage;
    
    //Constructor
    public Employee(String name, String address){
        this.name = name;
        this.address = address;
    }
    public Employee(){}
    
    //acess methods
    protected void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }  
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public double getWage() {
        return wage;
    }
    
    public double calculateIRPF(){
        double aux;
        if (wage < 1800){
            aux = 0.1 * wage;
        }
        else {
            aux = 0.27 * wage;
        }
        return aux;
    }
    public double calculateINSS(){
        return (0.11 * wage);
    }
}
