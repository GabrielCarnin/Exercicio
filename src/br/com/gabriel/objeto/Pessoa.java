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
public abstract class Pessoa {
    public String nome;
    public String rg;
    public String cpf;
    public String dataNascimento;
    public int idade;    

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", idade=" + idade + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, String rg, String cpf, String dataNascimento, int idade) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }
}

