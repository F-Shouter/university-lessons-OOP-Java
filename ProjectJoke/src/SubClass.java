/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fujoshi Shouter
 */
public class SubClass {
    private String nome;
    private boolean resposta1;
    private String resposta2;
    
    //construtor
    public SubClass(){
       resposta2 = "";
    }
    
    //metodos de acesso
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setResposta1(boolean resposta1){
        this.resposta1 = resposta1;
    }
    public String getResposta2(){
        return resposta2;
    }
    
    public void SeuFinal(){
        if (resposta1 = true){
            resposta2 = "cavalo";
        }
    }
}
