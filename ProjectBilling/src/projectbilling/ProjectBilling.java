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
        
        output.close();
    }
    
}
