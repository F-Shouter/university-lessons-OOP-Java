/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package receitafederal;

/**
 *
 * @author Fujoshi Shouter
 */
public class ReceitaFederal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fisico fis = new Fisico("Anne", 24000, 265002, 0, 12000);
        
        System.out.println("Nome.................: " + fis.getNome() + " ,CPF: " + fis.getCpf());
        System.out.println("Renda bruta anual....: " + fis.getRendaBrutalAnual());
        System.out.println("Gastos com saude.....: " + fis.getGastosSaude());
        System.out.println("Gastos com educação..: " + fis.getGastosEducacao());
        System.out.println("------------------------------------------");
        System.out.println("Renda liquida anual..: " + fis.calcularRendaLiquida(fis.getGastosSaude(), fis.getGastosEducacao()));
        System.out.println("...");
        System.out.println("Imposto calculado sob: " + fis.calcularImpostoDeRenda());
        System.out.println("------------------------------------------");
        System.out.println("Renda FINAL..........: " + (fis.calcularRendaLiquida(fis.getGastosSaude(), fis.getGastosEducacao()) - fis.calcularImpostoDeRenda()));
    }
    
}
