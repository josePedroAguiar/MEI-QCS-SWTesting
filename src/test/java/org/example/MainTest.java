package org.example;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class MainTest {

    
    /* ALGORITMO 1*/
    @Test
    public void testNTotalDePublicacoesPorTipo_ValidTipo() {
        Investigador investigadorValido = new Investigador("John Doe", "johndoe@example.com", "Professor");
        Investigador investigadorValido2 = new Investigador("John Q. Public", "johnpublic@example.com", "Professor");
        Investigador investigadorValido3 = new Investigador("Jane Doe", "janedoe@gmail.com", "Estudante");
        Investigador investigadorValido4 = new Investigador("Tom Smith", "tomesmith@outlook.com", "Estudante");
        Investigador investigadorValido5 = new Investigador("Dick Py", "dickpy@example.com", "Estudante");
        Investigador investigadorValido6 = new Investigador("Harry Jones", "harry@example.com", "Professor");

        ArrayList<Investigador> autores = new ArrayList<>();
        autores.add(investigadorValido);
        autores.add(investigadorValido2);
        autores.add(investigadorValido3);
        autores.add(investigadorValido4);
        autores.add(investigadorValido5);
        autores.add(investigadorValido6);
        Publicacao tipoValido = new Publicacao(autores, "Artigo", 1050, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores, "Artigo", 100, 2021),
                new Publicacao(autores, "Conferência", 200, 2022),
                new Publicacao(autores, "Livro", 50, 2020),
                tipoValido
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);
        Assertions.assertEquals("Artigo:2 Conferência:1 Livro:1 ", result);
    }
    @Test
    public void testNTotalDePublicacoesPorTipo_TipoVazio() {
        Investigador investigadorValido = new Investigador("John Doe", "johndoe@example.com", "Professor");
        Investigador investigadorValido2 = new Investigador("John Q. Public", "johnpublic@example.com", "Professor");
        Investigador investigadorValido3 = new Investigador("Jane Doe", "janedoe@gmail.com", "Estudante");
        Investigador investigadorValido4 = new Investigador("Tom Smith", "tomesmith@outlook.com", "Estudante");
        Investigador investigadorValido5 = new Investigador("Dick Py", "dickpy@example.com", "Estudante");
        Investigador investigadorValido6 = new Investigador("Harry Jones", "harry@example.com", "Professor");

        ArrayList<Investigador> autores = new ArrayList<>();
        autores.add(investigadorValido);
        autores.add(investigadorValido2);
        autores.add(investigadorValido3);
        autores.add(investigadorValido4);
        autores.add(investigadorValido5);
        autores.add(investigadorValido6);
        Publicacao tipoVazio = new Publicacao(autores, (String)null, 1050, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores, "Artigo", 100, 2021),
                new Publicacao(autores, "Conferência", 200, 2022),
                new Publicacao(autores, "Livro", 50, 2020),
                tipoVazio
        ));


        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("Artigo:1 Conferência:1 Livro:1 ", result);
    }

    @Test
    public void testNTotalDePublicacoesPorTipo_TipoComMuitosCaracteres() {
        Investigador investigadorValido = new Investigador("John Doe", "johndoe@example.com", "Professor");
        Investigador investigadorValido2 = new Investigador("John Q. Public", "johnpublic@example.com", "Professor");
        Investigador investigadorValido3 = new Investigador("Jane Doe", "janedoe@gmail.com", "Estudante");
        Investigador investigadorValido4 = new Investigador("Tom Smith", "tomesmith@outlook.com", "Estudante");
        Investigador investigadorValido5 = new Investigador("Dick Py", "dickpy@example.com", "Estudante");
        Investigador investigadorValido6 = new Investigador("Harry Jones", "harry@example.com", "Professor");

        ArrayList<Investigador> autores = new ArrayList<>();
        autores.add(investigadorValido);
        autores.add(investigadorValido2);
        autores.add(investigadorValido3);
        autores.add(investigadorValido4);
        autores.add(investigadorValido5);
        autores.add(investigadorValido6);
        Publicacao tipoComMuitosCaracteres = new Publicacao(autores, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 1050, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores, "Artigo", 100, 2021),
                new Publicacao(autores, "Conferência", 200, 2022),
                new Publicacao(autores, "Livro", 50, 2020),
                tipoComMuitosCaracteres
        ));


        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA:1 Artigo:1 Conferência:1 Livro:1 ", result);
    }

    @Test
    public void testNTotalDePublicacoesPorTipo_TipoComPoucosCaracteres() {
        Investigador investigadorValido = new Investigador("John Doe", "johndoe@example.com", "Professor");
        Investigador investigadorValido2 = new Investigador("John Q. Public", "johnpublic@example.com", "Professor");
        Investigador investigadorValido3 = new Investigador("Jane Doe", "janedoe@gmail.com", "Estudante");
        Investigador investigadorValido4 = new Investigador("Tom Smith", "tomesmith@outlook.com", "Estudante");
        Investigador investigadorValido5 = new Investigador("Dick Py", "dickpy@example.com", "Estudante");
        Investigador investigadorValido6 = new Investigador("Harry Jones", "harry@example.com", "Professor");

        ArrayList<Investigador> autores = new ArrayList<>();
        autores.add(investigadorValido);
        autores.add(investigadorValido2);
        autores.add(investigadorValido3);
        autores.add(investigadorValido4);
        autores.add(investigadorValido5);
        autores.add(investigadorValido6);
        Publicacao tipoComPoucosCaracteres = new Publicacao(autores, "A", 1050, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores, "Artigo", 100, 2021),
                new Publicacao(autores, "Conferência", 200, 2022),
                new Publicacao(autores, "Livro", 50, 2020),
                tipoComPoucosCaracteres
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("A:1 Artigo:1 Conferência:1 Livro:1 ", result);

    }

    @Test
    public void testNTotalDePublicacoesPorTipo_TipoApenasComElementosNumericos() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Collections.singletonList(
                new Publicacao(new ArrayList<>(), "123", 100, 2021)
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("1231", result);
    }

    @Test
    public void testNTotalDePublicacoesPorTipo_TipoComCaracteresEspeciais() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Collections.singletonList(
                new Publicacao(new ArrayList<>(), "!@#$", 100, 2021)
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("!@#$1", result);
    }

    @Test
    public void testNTotalDePublicacoesPorTipo_TipoComCaracterDeEscape() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Collections.singletonList(
                new Publicacao(new ArrayList<>(), "Tipo\nCom\nCaracter\nDe\nEscape", 100, 2021)
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("Tipo\nCom\nCaracter\nDe\nEscape1", result);
    }

    @Test
    public void testNTotalDePublicacoesPorTipo_TipoComposto() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(new ArrayList<>(), "Artigo", 100, 2021),
                new Publicacao(new ArrayList<>(), "Artigo", 200, 2022),
                new Publicacao(new ArrayList<>(), "Conferência", 50, 2020),
                new Publicacao(new ArrayList<>(), "Conferência", 150, 2021)
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("Artigo2Conferência2", result);
    }
    /* ALGORITMO 2*/
    @Test
    public void testAudienciaA() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(new ArrayList<>(), "Artigo", 100, 2021),
                new Publicacao(new ArrayList<>(), "Artigo", 200, 2022),
                new Publicacao(new ArrayList<>(), "Conferência", 50, 2020),
                new Publicacao(new ArrayList<>(), "Conferência", 150, 2021)
        ));
        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);
        Assertions.assertEquals("Artigo2Conferência2", result);
    }

    @Test
    public void testAudienciaBNegativa() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(new ArrayList<>(), "Artigo", 100, 2021),
                new Publicacao(new ArrayList<>(), "Artigo", 200, 2022),
                new Publicacao(new ArrayList<>(), "Conferência", 50, 2020),
                new Publicacao(new ArrayList<>(), "Conferência", 150, 2021)
        ));
        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        Assertions.assertEquals("Artigo2Conferência2", result);
    }

    @Test
    public void testAudienciaBMaisDecimais() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(new ArrayList<>(), "Artigo", 100, 2021),
                new Publicacao(new ArrayList<>(), "Artigo", 200, 2022),
                new Publicacao(new ArrayList<>(), "Conferência", 50, 2020),
                new Publicacao(new ArrayList<>(), "Conferência", 150, 2021)
        ));
        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        Assertions.assertEquals("Artigo2Conferência2", result);
    }

    @Test
    public void testAudienciaCAlfanumerica() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(new ArrayList<>(), "Artigo", 100, 2021),
                new Publicacao(new ArrayList<>(), "Artigo", 200, 2022),
                new Publicacao(new ArrayList<>(), "Conferência", 50, 2020),
                new Publicacao(new ArrayList<>(), "Conferência", 150, 2021)
        ));
        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);
        Assertions.assertEquals("Artigo2Conferência2", result);
    }

    @Test
    public void testAudiencia1000() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(new ArrayList<>(), "Artigo", 100, 2021),
                new Publicacao(new ArrayList<>(), "Artigo", 200, 2022),
                new Publicacao(new ArrayList<>(), "Conferência", 50, 2020),
                new Publicacao(new ArrayList<>(), "Conferência", 150, 2021)
        ));
        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);
        Assertions.assertEquals("Artigo2Conferência2", result);
    }

    @Test
    public void testAudiencia500() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(new ArrayList<>(), "Artigo", 100, 2021),
                new Publicacao(new ArrayList<>(), "Artigo", 200, 2022),
                new Publicacao(new ArrayList<>(), "Conferência", 50, 2020),
                new Publicacao(new ArrayList<>(), "Conferência", 150, 2021)
        ));
        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);
        Assertions.assertEquals("Artigo2Conferência2", result);
    }

    @Test
    public void testAudienciaZero() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(new ArrayList<>(), "Artigo", 100, 2021),
                new Publicacao(new ArrayList<>(), "Artigo", 200, 2022),
                new Publicacao(new ArrayList<>(), "Conferência", 50, 2020),
                new Publicacao(new ArrayList<>(), "Conferência", 150, 2021)
        ));
        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);
        Assertions.assertEquals("Artigo2Conferência2", result);
    }

    @Test
    public void testAudienciaVazia() {
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(new ArrayList<>(), "Artigo", 100, 2021),
                new Publicacao(new ArrayList<>(), "Artigo", 200, 2022),
                new Publicacao(new ArrayList<>(), "Conferência", 50, 2020),
                new Publicacao(new ArrayList<>(), "Conferência", 150, 2021)
        ));
        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);
        Assertions.assertEquals("Artigo2Conferência2", result);
    }


    /*ALGORITMO 3*/
    @Test
    public void testAnoValido() {
       
    }

    @Test
    public void testAnoNegativo() {
       
    }

    @Test
    public void testAnoNaoExistente() {

    }

    @Test
    public void testTipoComMuitosCaracteres() {
       
    }

    @Test
    public void testTipoComPoucosCaracteres() {
        
    }

    @Test
    public void testAnoComCasasDecimais() {
        
    }

    @Test
    public void testAudienciaMuitoGrande() {
       
    }

    @Test
    public void testTipoComCaracteresEspeciais() {
      
    }

    @Test
    public void testAnoAlfanumerico() {
        
    }

    @Test
    public void testTipoComposto() {
       
    }

    @Test
    public void testAnoVazio() {
       
    }

    @Test
    public void testAudienciaA_TipoVazio() {
        
    }

    @Test
    public void testAudienciaB_TipoApenasNumerico() {
       
    }

    @Test
    public void testAudienciaC_TipoComCaracterEscape() {
      
    }

    @Test
    public void testAudiencia1000_AudienciaNegativa() {
      
    }

    @Test
    public void testAudiencia500_AudienciaComCasasDecimais() {
      
    }

    @Test
    public void testAudiencia0_AudienciaAlfanumerica() {
     
    }

}