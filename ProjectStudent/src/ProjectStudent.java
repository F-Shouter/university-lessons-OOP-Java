/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Fujoshi Shouter
 */
public class ProjectStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SubClassStudent college = new SubClassStudent();
        college.setA1(new Float(args[0]).floatValue());
        college.setA2(new Float(args[1]).floatValue());
        college.calculateAverage();
        System.out.println("First semester grade: " + college.getA1());
        System.out.println("Second semester grade: " + college.getA2());
        System.out.println("Final semester grade: " + college.getAverage());
    }
    
    //Command prompt opened 
    /*C:\Users\anney\OneDrive\Imagens\Documentos\GitHub_Projects\university-lessons-OOP-Java\ProjectStudent\build\classes>
    //dir
    //java ProjectStudent 5 5
    //enter
    
}
