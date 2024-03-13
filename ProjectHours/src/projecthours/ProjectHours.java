/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecthours;

/**
 *
 * @author Fujoshi Shouter
 */
public class ProjectHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instantiate an object of the class SubHours
        //using empty constructor
        SubHours r1 = new SubHours();
        System.out.println("Using the empty constructor");
        System.out.println("Hours: " + r1.getHour() + ":" + r1.getMinute() + ":" + r1.getSecond());
    }
    
}
