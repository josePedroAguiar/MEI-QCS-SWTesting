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
        Publicacao tipoMuitosCaracteres = new Publicacao(autores,
        "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
        1050, 2020);
        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores, "Artigo", 100, 2021),
                new Publicacao(autores, "Conferência", 200, 2022),
                new Publicacao(autores, "Livro", 50, 2020),
                tipoMuitosCaracteres
        ));


        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA:1 Artigo:1 Conferência:1 Livro:1 ", result);
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
        Publicacao tipoApenasNumerico = new Publicacao(autores, "111111", 1050, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores, "Artigo", 100, 2021),
                new Publicacao(autores, "Conferência", 200, 2022),
                new Publicacao(autores, "Livro", 50, 2020),
                tipoApenasNumerico
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("111111:1 Artigo:1 Conferência:1 Livro:1 ", result);

    }

    @Test
    public void testNTotalDePublicacoesPorTipo_TipoComCaracteresEspeciais() {
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
        Publicacao tipoCaracteresEspeciais1 = new Publicacao(autores, "Açarito", 1050, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores, "Artigo", 100, 2021),
                new Publicacao(autores, "Conferência", 200, 2022),
                new Publicacao(autores, "Livro", 50, 2020),
                tipoCaracteresEspeciais1
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("Artigo:1 Açarito:1 Conferência:1 Livro:1 ", result);
    }

    @Test
    public void testNTotalDePublicacoesPorTipo_TipoComCaracterDeEscape() {
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
        Publicacao tipoComEscape1 = new Publicacao(autores, "Artigo\\an", 1050, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores, "Artigo", 100, 2021),
                new Publicacao(autores, "Conferência", 200, 2022),
                new Publicacao(autores, "Livro", 50, 2020),
                tipoComEscape1
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("Artigo:1 Artigo\\an:1 Conferência:1 Livro:1 ", result);
    }

    @Test
    public void testNTotalDePublicacoesPorTipo_TipoComposto() {
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
        Publicacao tipoComposto = new Publicacao(autores, "Artigo-Cientifico", 1050, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores, "Artigo", 100, 2021),
                new Publicacao(autores, "Conferência", 200, 2022),
                new Publicacao(autores, "Livro", 50, 2020),
                tipoComposto
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("Artigo:1 Artigo-Cientifico:1 Conferência:1 Livro:1 ", result);
    }
    /* ALGORITMO 2*/
    @Test
    public void testAudienciaA() {
        Investigador investigadorValido = new Investigador("John Doe", "johndoe@example.com", "Professor");
        Investigador investigadorValido2 = new Investigador("John Q. Public", "johnpublic@example.com", "Professor");
        Investigador investigadorValido3 = new Investigador("Jane Doe", "janedoe@gmail.com", "Estudante");
        Investigador investigadorValido4 = new Investigador("Tom Smith", "tomesmith@outlook.com", "Estudante");
        Investigador investigadorValido5 = new Investigador("Dick Py", "dickpy@example.com", "Estudante");
        Investigador investigadorValido6 = new Investigador("Harry Jones", "harry@example.com", "Professor");

        ArrayList<Investigador> autores1 = new ArrayList<>();
        ArrayList<Investigador> autores2 = new ArrayList<>();
        ArrayList<Investigador> autores3 = new ArrayList<>();
        autores1.add(investigadorValido);
        //autores1.add(investigadorValido2);
        autores2.add(investigadorValido3);
        //autores2.add(investigadorValido4);
        autores3.add(investigadorValido5);
        //autores3.add(investigadorValido6);

        Publicacao audienciaA = new Publicacao(autores1, "Artigo", 1050, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2021),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2020),
                audienciaA
        ));

        String result = Main.listaDePublicacoesPorFatorDeImpacto(publicacoes);

        // Assert that the result is as expected
        Assertions.assertEquals("A: Autores Professor John Doe johndoe@example.com Autores JDoe janedoe@gmail.com B: Autores JDoe janedoe@gmail.com C: Autores DPy dickpy@example.com ", result);
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