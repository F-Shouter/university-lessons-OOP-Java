/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folha;

/**
 *
 * @author Fujoshi Shouter
 */
public class Mensalista extends Empregado{
    private String cargo;
    
    //Construtor
    public Mensalista(String nome, String endereco, String cargo) {
        super(nome, endereco);
        this.cargo = cargo;
    }

    //Metodos de acesso
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void calcularSalario(){
        if(cargo.equals("Junior")){
            salario = 2500;
        }else if(cargo.equals("Pleno")){
            salario = 3500;
        }else{
            salario = 5500;
        }
    }
    
}
