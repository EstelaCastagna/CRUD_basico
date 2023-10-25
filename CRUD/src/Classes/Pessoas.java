/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author escastagna
 */
public class Pessoas {
    
    private String nome;
    private int idade;
    private String CPF;

    public Pessoas() {
    }
    
    

    public Pessoas(String nome, int idade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String mostrarDados(){
        return "Nome: "+getNome()+" | Idade: "+getIdade()+" | CPF: "+getCPF()+" |\n";
    }
           
    
}
