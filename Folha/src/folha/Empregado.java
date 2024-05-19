/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folha;

/**
 *
 * @author Fujoshi Shouter
 */
public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;

    //Construtor
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    //Metodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    //Metodo calcular impostos
    public double calcularIrpf() {
        double aux;
        if (salario < 1800) {
            aux = 0.1 * salario;
        } else {
            aux = 0.27 * salario;
        }
        return aux;
    }
    
    public double calcularInss(){
        return(0.11 * salario);
    }
}
