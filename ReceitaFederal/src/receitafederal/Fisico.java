/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receitafederal;

/**
 *
 * @author Fujoshi Shouter
 */
public class Fisico extends Contribuinte {

    private double cpf;
    private double gastosSaude;
    private double gastosEducacao;

    //Construtor
    public Fisico(String nome, double rendaBrutalAnual, double cpf, double gastosSaude, double gastosEducacao) {
        super(nome, rendaBrutalAnual);
        this.cpf = cpf;
        this.gastosSaude = gastosSaude;
        this.gastosEducacao = gastosEducacao;
    }

    //Metodos de acesso
    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public double getGastosEducacao() {
        return gastosEducacao;
    }

    public void setGastosEducacao(double gastosEducacao) {
        this.gastosEducacao = gastosEducacao;
    }

    public double calcularImpostoDeRenda() {
        double irf;
        if (rendaLiquidaAnual <= 10000) {
            irf = 0;
        } else if (rendaLiquidaAnual <= 20000) {
            irf = (rendaLiquidaAnual * 0.1) - 1000;
        } else {
            irf = (rendaLiquidaAnual * 0.25) - 4000;
        }
        return irf;
    }

}
