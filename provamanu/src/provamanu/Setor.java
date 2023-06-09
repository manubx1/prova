/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package provamanu;

/**
 *
 * @author Aluno
 */
public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    OPERACOES("Operacoes");
    
    protected String nome;

    //contrutor
    private Setor(String nome) {
        this.nome = nome;
    }

    //get
    public String getNome() {
        return nome;
    }
    
    
}
