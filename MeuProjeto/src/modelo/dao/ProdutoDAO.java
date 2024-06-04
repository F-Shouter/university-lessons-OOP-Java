/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Produto;
import util.FabricaConexao;

/**
 *
 * @author PTOLEDO
 */
public class ProdutoDAO {

    public static Produto cadastrar(Produto prod) throws SQLException, ClassNotFoundException {
        Connection con = FabricaConexao.getConexao();
        Produto p = new Produto();
        PreparedStatement comando = con.prepareStatement(""
                + "insert into produto "
                + "(nome, descricao, preco, transportadora, origem, codigo, material, proprietario, contato) "
                + "values (?,?,?,?,?,?,?,?,?)");
        comando.setString(1, prod.getNome());
        comando.setString(2, prod.getDescricao());
        comando.setDouble(3, prod.getPreco());
        comando.setString(4, prod.getTransportadora());
        comando.setString(5, prod.getOrigem());
        comando.setString(6, prod.getCodigo());
        comando.setString(7, prod.getMaterial());
        comando.setString(8, prod.getProprietario());
        comando.setString(9, prod.getContato());
        comando.execute();
        con.close();// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return p;
    }
   
    
    public static boolean deletar(Produto prod) throws ClassNotFoundException, SQLException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("delete from produto where id = ?");
        comando.setInt(1, prod.getId());
        comando.execute();
        con.close();
        return true;
    }
    
    public Produto atualizar(Produto prod) throws ClassNotFoundException, SQLException {
        Connection con = FabricaConexao.getConexao();
        Produto p = new Produto();
        PreparedStatement comando = con.prepareStatement( "update banco.produto set `nome` = ?, `descricao` = ?, `preco` = ?, `transportadora` = ?,"
                + " `origem` = ?, `codigo` = ?, `material` = ?, `proprietario` = ?, `contato` = ?"
                + " where id = ?");
        comando.setString(1, prod.getNome());
        comando.setString(2, prod.getDescricao());
        comando.setDouble(3, prod.getPreco());
        comando.setString(4, prod.getTransportadora());
        comando.setString(5, prod.getOrigem());
        comando.setString(6, prod.getCodigo());
        comando.setString(7, prod.getMaterial());
        comando.setString(8, prod.getProprietario());
        comando.setString(9, prod.getContato());
        comando.setInt(10, prod.getId());
        comando.execute();
        con.close();
        return p;
    }    
    
    public Produto consultarById(Produto prod) throws ClassNotFoundException, SQLException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from produto where id = ?");
        comando.setInt(1, prod.getId());
        ResultSet rs = comando.executeQuery();
        Produto p = new Produto();
        if (rs.next()) {
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setDescricao(rs.getString("descricao"));
            p.setPreco((int) rs.getDouble("preco")); 
            p.setTransportadora(rs.getString("transportadora"));
            p.setOrigem(rs.getString("origem"));
            p.setCodigo(rs.getString("codigo"));
            p.setMaterial(rs.getString("material"));
            p.setProprietario(rs.getString("proprietario"));
            p.setContato(rs.getString("contato"));
        }      
        con.close();
        return p;
    }
    
    public static List<Produto> consultarTodos() throws ClassNotFoundException, SQLException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("select * from produto");        
        ResultSet rs = comando.executeQuery();        
        List<Produto> lprod = new ArrayList<Produto>();
        int cont = 0;
        while(rs.next()){
            Produto prod = new Produto();
            prod.setId(rs.getInt("id"));
            prod.setNome(rs.getString("nome"));
            prod.setDescricao(rs.getString("descricao"));
            prod.setPreco((int) rs.getDouble("preco")); 
            prod.setTransportadora(rs.getString("transportadora"));
            prod.setOrigem(rs.getString("origem"));
            prod.setCodigo(rs.getString("codigo"));
            prod.setMaterial(rs.getString("material"));
            prod.setProprietario(rs.getString("proprietario"));
            prod.setContato(rs.getString("contato")); 
            lprod.add(prod);
            cont++;
        }
        System.out.println("Cont..: " + cont);
        con.close();
        return lprod;
    } 
    public boolean verificarExistenciaID(Produto p) throws ClassNotFoundException, SQLException {
        Connection con = FabricaConexao.getConexao();
        PreparedStatement comando = con.prepareStatement("SELECT COUNT(*) AS total FROM produto WHERE id = ?");
        comando.setInt(1, p.getId());
        ResultSet rs = comando.executeQuery();
        
        int total = 0;
        if (rs.next()) {
            total = rs.getInt("total");
        }
        
        con.close();
        
        return total > 0;
    }
}
