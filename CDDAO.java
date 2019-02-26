/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Visao.Cadastrar.CadastrarCDs;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Modelo.CD;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;







/**
 *
 * @author Vinicius de Almeida
 */
public class CDDAO extends ExecuteSQL {

    public CDDAO(Connection con) {
        super(con);
    }
      
    

    public String Inserir_CadastrarCDs(CD a){
        String sql = "insert into cadastrarcd values (0,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getTitulo());
            ps.setInt(2, a.getPreco());
            ps.setString(3, a.getcapa());
            
            if (ps.executeUpdate() > 0){
                return "Inserido com sucesso.";
            
            }else {
                return "Erro ao inserir";
            
            }
         
        } catch (SQLException e){
            return e.getMessage();
        
        }
    
    }
    public List<CD>ListarCD(){
        String sql = "select idcds, titulo, preco, tfcapa ";
        List<CD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    CD a = new CD ();
                    a.setTitulo(rs.getString(1));
                    a.setPreço(rs.getInt(2));
                    a.setcapa(rs.getString(3));
                    
                    lista.add (a);
                    
                    
                }
                return lista;
            }else{
                return null;
            }
            
        } catch(SQLException e){
            return null;
        }
    }
}

 
