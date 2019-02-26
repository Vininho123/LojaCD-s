/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.cadastrarusu;
import Visao.Cadastrar.Cadastrarusu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Vinicius de Almeida
 */
public class CadastrarusuDAO extends ExecuteSQL {
    public CadastrarusuDAO(Connection con) {
        super(con);
    }

    public String Inserir_Cadastrarusu(cadastrarusu a){
        String sql = "insert into cadastrarusuario values (0,?,?,?,?,?,?,?)";
        try {
        PreparedStatement ps = getCon().prepareStatement(sql);
        ps.setString(1,a.getNome());
        ps.setString(2,a.getEmail());
        ps.setString(3,a.getCpf());
        ps.setString(4,a.getTelefone());
        ps.setString(5,a.getLogin());
        ps.setString(6,a.getSenha());
        ps.setString(7,a.getSenha2());
        
        if (ps.executeUpdate() > 0){
        return "Cadastrado com sucesso.";
        
        }else{
        return "Erro ao cadastrar";
        
        }
        
        
        } catch (SQLException e){
        return e.getMessage();
        }
    
}
}
