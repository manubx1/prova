/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provamanu;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    //contrutor
    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    //get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //tostring
    @Override
    public String toString() {
        return  "\n Nome: " + nome +
                "\n Telefone: " + telefone + 
                "\n Email: " + email + 
                "\n"+
                "\n Endereco: " + endereco;
    }
    
    
}
