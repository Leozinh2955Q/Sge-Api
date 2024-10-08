package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Areas;
import model.bean.Disciplina;
import model.bean.Professores;

public class ProfessoresDAO {

    public List<Professores> lerProfessores() {
        List<Professores> professores = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("select * from professores as prof inner join professor_disciplina as prof_dis ON prof.id_professor = prof_dis.id_professor inner join disciplina as dis ON prof_dis.id_disciplina = dis.id_disciplina inner join areas as a ON dis.area_id = a.id_area");    
            
            rs = stmt.executeQuery();

            while(rs.next()) {
                Professores professor = new Professores();
                professor.setNome(rs.getString("nome"));
                professor.setSobrenome(rs.getString("sobrenome"));
                professor.setUsuario(rs.getString("usuario"));
                professor.setSenha(rs.getString("senha"));

                List<Disciplina> disciplinaLista = new ArrayList();

                Disciplina disciplina = new Disciplina();
                disciplina.setNome_disciplina(rs.getString("nome_disciplina"));
                disciplina.setArea(rs.getString("nome_area"));
                disciplinaLista.add(disciplina);
                
                List<Areas> areaLista = new ArrayList();
                
                Areas area = new Areas();
                area.setNome(rs.getString("nome_area"));
                area.setDescricao(rs.getString("descricao"));
                areaLista.add(area);

                professor.setDisciplina(disciplinaLista);
                professor.setArea(areaLista);

                professores.add(professor);

            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return professores;
    }
}
