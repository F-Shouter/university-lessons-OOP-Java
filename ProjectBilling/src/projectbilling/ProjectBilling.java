/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbilling;

/**
 *
 * @author Fujoshi Shouter
 */
import java.util.Scanner;
public class ProjectBilling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        SubProduct prod = new SubProduct();
        
        System.out.print("Insert code: ");
        int code = output.nextInt();
        prod.setCode(code);
        
        output.nextLine();
        
        System.out.print("What's it? ");
        String description = output.nextLine();
        prod.setDescription(description);
        
        System.out.print("How much does it cust per unit?: ");
        double unitPrice = output.nextDouble();
        prod.setUnitPrice(unitPrice);
        
        System.out.print("How many " + prod.getDescription() +" do you want? ");
        int quantilysold = output.nextInt();
        prod.setQuantilySold(quantilysold);
        
        System.out.println("------------------------------------");
        System.out.println("The Total: R$ " + prod.calculateTotal() + " reais.");
        int num;
        System.out.println("\n" + "Would you like to see your order receipt? 1.[YES] or 2.[NO] ");
        num = output.nextInt();
        if (num == 1){
            System.out.println("------------------------------------");
            System.out.println("Code: " + prod.getCode());
            System.out.println("Description: " + prod.getDescription());
            System.out.println("[ " + prod.getUnitPrice() + " ] x " + prod.getQuantilySold() + " unid.");
            System.out.println("------------------------------------");
            System.out.println("Total: " + prod.calculateTotal());
        }
        else if (num == 2){
            System.out.println("End.");
        }
        else {System.out.println("?");}
        
        output.close();
    }
    
}
