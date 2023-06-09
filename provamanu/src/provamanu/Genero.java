/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package provamanu;

/**
 *
 * @author Aluno
 */
public enum Genero {
    FEMININO("Feminino", 'F'),
    MASCULINO("Masculino", 'M');
    
    protected String texto;
    protected char sigla;

    //contrutor
    private Genero(String texto, char sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }
    
    //get

    public String getTexto() {
        return texto;
    }

    public char getSigla() {
        return sigla;
    }
    
}
