/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receitafederal;

/**
 *
 * @author Fujoshi Shouter
 */
public class Juridico extends Contribuinte{
    private double cnpj;
    private double gastosPessoal;
    private double gastosEquipamentos;
    
    //Contrutor
    public Juridico(String nome, double rendaBrutalAnual, double cnpj, double gastosPessoal, double gastosEquipamentos) {
        super(nome, rendaBrutalAnual);
        this.cnpj = cnpj;
        this.gastosPessoal = gastosPessoal;
        this.gastosEquipamentos = gastosEquipamentos;
    }

    //Metodos de acesso
    public double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double cnpj) {
        this.cnpj = cnpj;
    }

    public double getGastosPessoal() {
        return gastosPessoal;
    }

    public void setGastosPessoal(double gastosPessoal) {
        this.gastosPessoal = gastosPessoal;
    }

    public double getGastosEquipamentos() {
        return gastosEquipamentos;
    }

    public void setGastosEquipamentos(double gastosEquipamentos) {
        this.gastosEquipamentos = gastosEquipamentos;
    }
    
    public double calcularImpostoDeRenda() {
        double irj;
        if (rendaLiquidaAnual <= 100000) {
            irj = rendaLiquidaAnual * 0.05;
        } else if (rendaLiquidaAnual <= 200000) {
            irj = rendaLiquidaAnual * 0.1;
        } else {
            irj = rendaLiquidaAnual = 0.3;
        }
        return irj;
    }
}
