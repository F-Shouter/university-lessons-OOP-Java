/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectcar;

/**
 *
 * @author Fujoshi Shouter
 */
public class ProjectCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SubclassCar car1 = new SubclassCar(2009,"Hyundai","veloster");
        SubclassCar car2 = new SubclassCar(2022,"Honda","animazon");
        SubclassCar car3 = new SubclassCar(2024,"RB20","temor");
        
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
    
}
