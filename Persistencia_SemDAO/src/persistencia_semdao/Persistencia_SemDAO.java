/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia_semdao;

import java.sql.SQLException;

/**
 *
 * @author Fujoshi Shouter
 */
public class Persistencia_SemDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Produto p = new Produto();
        p.setDescricao("mouse");
        p.setPreco(36);
        
        try{
            p.cadastrar();
            System.out.println("Cadastrado com sucesso!");
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("ERRO: " + ex.getMessage());
        }
    }
    
}
