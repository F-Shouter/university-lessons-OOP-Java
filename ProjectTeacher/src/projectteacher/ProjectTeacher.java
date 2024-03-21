/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectteacher;

/**
 *
 * @author Fujoshi Shouter
 */
public class ProjectTeacher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SubTeacher teacher = new SubTeacher("Fabiano",200);
        teacher.calculateSalary();
        System.out.println("Name: " + teacher.getName());
        System.out.println("Salary: " + teacher.getSalary());
        
    }
    
}
