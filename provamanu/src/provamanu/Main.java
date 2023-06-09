/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provamanu;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * Aluna: Manuella Mendes Boa Morte
 * tuema: 83957
 * 
 */
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", "1", "ed. Ruy", "40568495", "Salvador", UnidadeFederativa.BAHIA);
        
        Cliente pessoaFisCliente = new Cliente(00000, LocalDate.of(2000, Month.MARCH, 18), Genero.FEMININO, "Rosa", "71 8888888", "rosa@gmail.com", endereco);
       
        Advogado funAdv = new Advogado("77777777", "8888888", "9999999", "2222222", Setor.JURIDICO, 0, LocalDate.of(1999, Month.DECEMBER, 25), Genero.MASCULINO, "Jesus", "71 3333333", "Jesus@gamil.com", endereco);
        
        Motoboy funcMotoboy = new Motoboy("579700005", "00000045", "9658478", "222222", Setor.SAUDE, 5000, LocalDate.of(2005, Month.APRIL, 12), Genero.MASCULINO, "Victor", "21 6666666666", "vitor@gamil.com", endereco);
        
        Medico funcMedico = new Medico("00000", "4444444-88", "55555-8", "0001", Setor.SAUDE, 150, LocalDate.of(2010, Month.MARCH, 5), Genero.FEMININO, "Lara", "71 99999999", "lara@gamil", endereco);
        
        Juridica pessoaJuridica = new Juridica("000000", "111111", "Turismo tlda", "71 99999999", "turismo@gmail.com", endereco);
        
        
        System.out.println(pessoaFisCliente);
        System.out.println("---------------");
        System.out.println(funAdv);
        System.out.println("--------------");
        System.out.println(funcMotoboy);
        System.out.println("--------------");
        System.out.println(funcMedico);
        System.out.println("-------------");
        System.out.println(pessoaJuridica);
        
    } 
}
