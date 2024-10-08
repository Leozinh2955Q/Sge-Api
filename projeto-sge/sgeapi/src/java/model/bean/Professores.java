package model.bean;

import java.util.Date;
import java.util.List;

public class Professores {
    private String nome;
    private String sobrenome;
    private String usuario;
    private String senha;   
    private List<Disciplina> disciplina;
    private List<Areas> area;

    public Professores() {
    }

    public Professores(String nome, String sobrenome, String usuario, String senha, List<Disciplina> disciplina, List<Areas> area) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.usuario = usuario;
        this.senha = senha;
        this.disciplina = disciplina;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public List<Areas> getArea() {
        return area;
    }

    public void setArea(List<Areas> area) {
        this.area = area;
    }

    
}