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
        Fisico fis = new Fisico("Execução 3", 35000, 99999, 7500, 4800);
        
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
        System.out.println("");
        
        Juridico jur = new Juridico("Execução 5", 180000, 77777, 35000, 9500);
        
        System.out.println("Nome.................: " + jur.getNome() + " ,CNPJ: " + jur.getCnpj());
        System.out.println("Renda bruta anual....: " + jur.getRendaBrutalAnual());
        System.out.println("Gastos pessoais......: " + jur.getGastosPessoal());
        System.out.println("Gastos equipamentos..: " + jur.getGastosEquipamentos());
        System.out.println("------------------------------------------");
        System.out.println("Renda liquida anual..: " + jur.calcularRendaLiquida(jur.getGastosPessoal(), jur.getGastosEquipamentos()));
        System.out.println("...");
        System.out.println("Imposto calculado sob: " + jur.calcularImpostoDeRenda());
        System.out.println("------------------------------------------");
        System.out.println("Renda FINAL..........: " + (jur.calcularRendaLiquida(jur.getGastosPessoal(), jur.getGastosEquipamentos()) - jur.calcularImpostoDeRenda()));
    }
    
}
