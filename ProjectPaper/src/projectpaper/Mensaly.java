/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpaper;

/**
 *
 * @author Fujoshi Shouter
 */
public class Mensaly extends Employee{
    private String office;
    
    //Constructor
    public Mensaly(String name, String address, String office){
        super(name, address);
        this.office = office;
    }
    
    //Acess methods
    public void setOffice(String office) {
        this.office = office;
    }
    public String getOffice() {
        return office;
    }
    
    public void calculateWage(){
        if(office.equals("Junior")){
            wage = 2500;
        }
        else{
            if(office.equals("Pleno")){
                wage = 3500;
            }
            else{
                wage = 5500;
            }
        }
    }
}
