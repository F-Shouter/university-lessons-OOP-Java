/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia_semdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Fujoshi Shouter
 */
public class Produto {
    private int id;
    private String descricao;
    private double preco;

    //Metodos de acesso
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    //Metodo cadastrar()
    public void cadastrar() throws SQLException, ClassNotFoundException {
        Connection con = getConexao();
        PreparedStatement comando = con.prepareStatement("insert into produto(descricao, preco) values (?, ?)");
        comando.setString(1, descricao);
        comando.setDouble(2, preco);
        comando.execute();
        con.close();
    }
    
    //Metodo de conexao()
    private Connection getConexao() throws SQLException {
        try{
            //O metodo forName carrega e inicia o driver passado por parametro
            Class.forName("com.mysql.jdbc.Driver"); //verifica em seu computador
            String URL = "jdbc:mysql//localhost:3306/aula_ioo"; //verifica em seu computador
            String USER = "root"; //verifica em seu computador
            String PASSWORD = null;
            
            //Estabelecendo conexao
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (ClassNotFoundException ex){
            System.out.println("ex");
            return null;
        }
    }
}
