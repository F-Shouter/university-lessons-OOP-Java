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
        System.out.println("\n\n"); //skip two lines
        
        //instantiane an object of the class SubHours
        //using a constructor that requires hour, minute and second
        SubHours r2 = new SubHours(115,70,98);
        System.out.println("using a constructor that requires hour, minute and second");
        System.out.println("Hours: " + r2.getHour() + ":" + r2.getMinute() + ":" + r2.getSecond());
        System.out.println("\n\n"); //skip two lines 
        
        //r3 space to add code afterward 
        //r4 space to add code afterward 
        
        //instantiane an object of the class SubHours
        //using empty constructor
        SubHours r5 = new SubHours();
        System.out.println("using empty constructor,");
        System.out.println("but assingning values acess methods");
        //but assingning values through acess methods
        r5.setHour(13);
        r5.setMinute(40);
        r5.setSecond(10);
        System.out.println("Hours: " + r5.getHour() + ":" + r5.getMinute() + ":" + r5.getSecond());
        System.out.println("\n\n"); //skip two lines
        
    }
    
}
