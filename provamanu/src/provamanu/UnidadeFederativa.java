/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package provamanu;


public enum UnidadeFederativa {
     BAHIA("BAHIA","BA"),
     SAO_PAULO("São Paulo", "SP"),
     RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
     
     protected String nome;
     protected String sigla;

     //construtor
    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    //get
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
     
     
     
}
