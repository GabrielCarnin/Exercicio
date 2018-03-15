/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.objeto;

/**
 *
 * @author gabriel.154217
 */
public class Aluno {
    public int matricula;
    public String dataMatricula;
    public String disciplina;

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", disciplina=" + disciplina + '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno(int matricula, String dataMatricula, String disciplina) {
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
        this.disciplina = disciplina;
    }
}
