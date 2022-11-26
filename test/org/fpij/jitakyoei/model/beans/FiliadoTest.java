package org.fpij.jitakyoei.model.beans;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FiliadoTest {
    
    @Test
    public void testeToString(){
        Filiado filiado = new Filiado();
        Date data = new Date();
        String Nome = "Bruno";
        String RegistroCbj = "1234";
        String dataNascimento = "01/02/2003";
        String Email = "bruninho.gamplays@hotmail.com";
        String Cpf = "135.854.967-56";


        filiado.setNome(Nome);
        filiado.setRegistroCbj(RegistroCbj);
        filiado.setDataNascimento(data);
        filiado.setEmail(Email);
        filiado.setCpf(Cpf);

        filiado.toString();

        assertEquals(filiado, "Nome: "+Nome+
        "\nRegistroCbj: "+RegistroCbj+
        "\nDataNasc: "+dataNascimento+
        "\nE-mail: "+Email+
        "\nCPF: "+Cpf);
    }
}
