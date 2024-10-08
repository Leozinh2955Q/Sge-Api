/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Senai
 */
public class Disciplina {
    private String nome_disciplina;
    private String area;

    public Disciplina() {
    }
    
    public Disciplina(String nome_disciplina, String area) {
        this.nome_disciplina = nome_disciplina;
        this.area = area;
    }

    public String getNome_disciplina() {
        return nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    } 
}
