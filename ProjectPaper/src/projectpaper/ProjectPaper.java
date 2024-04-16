/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package projectpaper;
import java.util.Scanner;
/**
 *
 * @author Fujoshi Shouter
 */
public class ProjectPaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee emp = new Employee();
        Mensaly men = new Mensaly();
        
        System.out.println("Name?");
        String name = input.nextLine();
        emp.setName(name);
        
        System.out.println("Address?");
        String address = input.nextLine();
        emp.setAddress(address);
        
        
        System.out.println("Are you monthly[1] or hourly[2] employee?");
        int number = input.nextInt();
        input.nextLine();
        
        if(number == 1){
            
            System.out.println("Is your position Junior, Pleno ou Senior?");
            String office = input.nextLine();
            men.setOffice(office);
            
            men.calculateWage();
            men.calculateINSS();
            
            System.out.println("Name: " + men.getName());
            System.out.println("Address: " + emp.getAddress());
            System.out.println("Office: " + men.getOffice());
            System.out.println("Wage: " + men.getWage());
            System.out.println("Total: " + men.getWage() + " - " + men.calculateINSS());
            
        }
        
    }
    
}
