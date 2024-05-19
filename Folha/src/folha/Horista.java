/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folha;

/**
 *
 * @author Fujoshi Shouter
 */
public class Horista extends Empregado {
    private double horas;
    
    //Construtor
    public Horista(String nome, String endereco, double horas) {
        super(nome, endereco);
        this.horas = horas;
    }

    //Metodos de acesso
    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public void calcularSalario(){
        salario = horas * 50;
    }
}
