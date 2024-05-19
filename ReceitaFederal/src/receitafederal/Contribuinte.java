/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receitafederal;

/**
 *
 * @author Fujoshi Shouter
 */
public class Contribuinte {
    private String nome;
    protected double rendaBrutalAnual;
    protected double rendaLiquidaAnual;
    
    //Contrutor
    public Contribuinte (String nome, double rendaBrutalAnual){
        this.nome = nome;
        this.rendaBrutalAnual = rendaBrutalAnual;
    }

    //Metodos de acesso
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
      rendaLiquidaAnual = (rendaBrutalAnual - (abatimento1 + abatimento2));
      return rendaLiquidaAnual;
    }
}
