/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billing;

/**
 *
 * @author Fujoshi Shouter
 */
import java.util.Scanner;
public class Billing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        Product prod = new Product();
        
        System.out.print("Code: ");
        int code = bill.nextInt();
        prod.setCode(code);
        
        bill.nextLine();
        
        System.out.print("Description: ");
        String description = bill.nextLine();
        prod.setDescription(description);
        
        System.out.print("Unit price: ");
        double unitPrice = bill.nextDouble();
        prod.setUnitPrice(unitPrice);
        
        System.out.print("Quantily sold: ");
        int quantilySold = bill.nextInt();
        prod.setQuantilySold(quantilySold);
        
        prod.calculateTotalSales();
        System.out.println("----------------------------");
        System.out.println("Total Sales: " + prod.getTotalSales());
        
        bill.close();
    }
    
}
