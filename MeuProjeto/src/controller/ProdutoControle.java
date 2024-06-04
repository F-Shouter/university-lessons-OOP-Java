/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.Produto;

/**
 *
 * @author alunos
 */
public class ProdutoControle {
    /* elemento no índice 0 contém o nome do produto e no índice 1 o id da categoria */ 

    public static Produto inserirProduto(String[] atributos) throws ClassNotFoundException, SQLException{ 
        model.Produto prod = new model.Produto(); 
        prod.setNome(atributos[0]); 
        prod.setDescricao(atributos[1]); 
        prod.setPreco(Integer.parseInt(atributos[2]));  
        prod.setTransportadora(atributos[3]); 
        prod.setOrigem(atributos[4]);
        prod.setCodigo(atributos[5]);
        prod.setMaterial(atributos[6]); 
        prod.setProprietario(atributos[7]); 
        prod.setContato(atributos[8]); 
        return modelo.dao.ProdutoDAO.cadastrar(prod); 
    } 

    public static java.util.List<Object[]> obterTodos() throws ClassNotFoundException, SQLException{ 
        java.util.List<Object[]> retorno = new java.util.ArrayList<>(); 
        java.util.List<model.Produto> produtos = modelo.dao.ProdutoDAO.consultarTodos(); 
        for (model.Produto p : produtos){ 
            retorno.add(new Object[] {p.getId(), p.getNome(), p.getDescricao(),p.getPreco(), p.getTransportadora(), p.getOrigem(),p.getCodigo(), p.getMaterial(), p.getProprietario(), p.getContato() }); 
        } 
        return retorno; 
    } 
}
