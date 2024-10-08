/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Professor;

/**
 *
 * @author Senai
 */
public class ProfessorDAO {
    
    public List<Professor> lerProfessor(){
        List<Professor> listaProfessor = new ArrayList();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaProfessor;
    }
    
    
}
