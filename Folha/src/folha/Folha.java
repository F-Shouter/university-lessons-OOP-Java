/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package folha;

/**
 *
 * @author Fujoshi Shouter
 */
public class Folha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mensalista men = new Mensalista("Ricardo","Suzano-SP","Junior");
        men.calcularSalario();
       
        System.out.println("Nome.........: " + men.getNome() + " de " + men.getEndereco());
        System.out.println("Salario......: " + men.getSalario());
        System.out.println("Imposto INSS.: " + men.calcularInss());
        System.out.println("------------------------------------");
        System.out.println("Salario FINAL: " + (men.getSalario() - men.calcularInss()));
        
        System.out.println();
        Horista hor = new Horista("Anne","Mogi-SP",100);
        hor.calcularSalario();
        
        System.out.println("Nome.........: " + hor.getNome() + " de " + hor.getEndereco());
        System.out.println("Salario......: " + hor.getSalario());
        System.out.println("Imposto IRPF.: " + hor.calcularIrpf());
        System.out.println("------------------------------------");
        System.out.println("Salario FINAL: " + (hor.getSalario() - hor.calcularIrpf()));
    }
    
}
