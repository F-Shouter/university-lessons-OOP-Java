/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receitafederal;

/**
 *
 * @author Fujoshi Shouter
 */
public class Contribuiente {
    private String nome;
    protected double rendaBrutalAnual;
    protected double rendaLiquidaAnual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBrutalAnual() {
        return rendaBrutalAnual;
    }

    public void setRendaBrutalAnual(double rendaBrutalAnual) {
        this.rendaBrutalAnual = rendaBrutalAnual;
    }

    public double getRendaLiquidaAnual() {
        return rendaLiquidaAnual;
    }
    
    public double calcularRendaLiquida(double abatimento1, double abatimento2){
      return (rendaBrutalAnual - (abatimento1 + abatimento2));
    }
}
