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
            
            stmt = conexao.prepareStatement("SELECT * FROM professor;");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Professor professor = new Professor();
                DisciplinaDAO disciplina = new DisciplinaDAO();
                
                
                professor.setId_professor(rs.getInt("id_professor"));
                professor.setNome(rs.getString("nome"));
                professor.setSobrenome(rs.getString("sobrenome"));
                professor.setCpf(rs.getString("cpf"));
                professor.setImagem(rs.getString("imagem"));
                
                professor.setDisciplina(new DisciplinaDAO().lerDisciplinasProfessores(rs.getInt("id_professor")));
                
                listaProfessor.add(professor);
     
                
            }
            
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaProfessor;
    }
    
    
}
