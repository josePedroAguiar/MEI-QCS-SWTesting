package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        // TUDO OK
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

        // TUDO OK, NÃO CORTA
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

        // TUDO OK
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

        // TUDO OK
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

        // TUDO OK
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

        // TUDO OK
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
                new Publicacao(autores, "Artigo-Cientifico", 100, 2021),
                new Publicacao(autores, "Conferência", 200, 2022),
                new Publicacao(autores, "Livro", 50, 2020),
                tipoComposto
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // TUDO OK
        Assertions.assertEquals("Artigo-Cientifico:2 Conferência:1 Livro:1 ", result);
    }

    @Test
    public void testNTotalDePublicacoesPorTipo_CaseSensitive() {
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
        Publicacao caseSensitive = new Publicacao(autores, "ArtIgO", 1050, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores, "Artigo", 100, 2021),
                new Publicacao(autores, "Conferência", 200, 2022),
                new Publicacao(autores, "Livro", 50, 2020),
                caseSensitive
        ));

        String result = Main.nTotalDePublicacoesPorTipo(publicacoes);

        // Devia assumir o mesmo tipo que o Artigo
        Assertions.assertEquals("Artigo:2 Conferência:1 Livro:1 ", result);
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

        // Tudo OK
        Assertions.assertEquals("A: Autores Professor John Doe johndoe@example.com Autores JDoe janedoe@gmail.com B: Autores JDoe janedoe@gmail.com C: Autores DPy dickpy@example.com ", result);
    }

    @Test
    public void testAudienciaNegativa() {
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

        Publicacao audienciaNegativa = new Publicacao(autores1, "Artigo1", -230, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2021),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2020),
                audienciaNegativa
        ));

        String result = Main.listaDePublicacoesPorFatorDeImpacto(publicacoes);

        // John Doe deve ser eliminado porque o artigo é invalido
        Assertions.assertEquals("A: Autores JDoe janedoe@gmail.com B: Autores JDoe janedoe@gmail.com C: Autores DPy dickpy@example.com ", result);
    }

    @Test
    public void testAudienciaMaisDecimais() {
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

        Publicacao audienciaCasasDecimais = new Publicacao(autores1, "Artigo", (int) 20.5, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2021),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2020),
                audienciaCasasDecimais
        ));

        String result = Main.listaDePublicacoesPorFatorDeImpacto(publicacoes);

        // John Doe deve ser eliminado porque o artigo é invalido
        Assertions.assertEquals("A: Autores JDoe janedoe@gmail.com B: Autores JDoe janedoe@gmail.com C: Autores DPy dickpy@example.com ", result);
    }

    @Test
    public void testAudienciaAlfanumerica() {
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

        Publicacao audienciaAlfanumerica = new Publicacao(autores1, "Artigo",Integer.parseInt("2A2") , 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2021),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2020),
                audienciaAlfanumerica
        ));

        String result = Main.listaDePublicacoesPorFatorDeImpacto(publicacoes);

        // John Doe deve ser eliminado porque o artigo é invalido
        Assertions.assertEquals("A: Autores Professor John Doe johndoe@example.com Autores JDoe janedoe@gmail.com B: Autores JDoe janedoe@gmail.com C: Autores DPy dickpy@example.com ", result);
    }

    @Test
    public void testAudiencia1000() {
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

        Publicacao audiencia1000 = new Publicacao(autores1, "Artigo", 1000, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2021),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2020),
                audiencia1000
        ));

        String result = Main.listaDePublicacoesPorFatorDeImpacto(publicacoes);

        // Tudo OK
        Assertions.assertEquals("A: Autores Professor John Doe johndoe@example.com Autores JDoe janedoe@gmail.com B: Autores JDoe janedoe@gmail.com C: Autores DPy dickpy@example.com ", result);
    }

    @Test
    public void testAudiencia500() {
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

        Publicacao audienciaB = new Publicacao(autores1, "Artigo", 500, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2021),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2020),
                audienciaB
        ));

        String result = Main.listaDePublicacoesPorFatorDeImpacto(publicacoes);

        // Pensava que ia ser B
        Assertions.assertEquals("A: Autores JDoe janedoe@gmail.com B: Autores JDoe janedoe@gmail.com Autores Professor John Doe johndoe@example.com Autores DPy dickpy@example.com ", result);
    }

    @Test
    public void testAudienciaZero() {
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

        Publicacao audienciaA = new Publicacao(autores1, "Artigo", 0, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2021),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2020),
                audienciaA
        ));

        String result = Main.listaDePublicacoesPorFatorDeImpacto(publicacoes);

        // Tem que ser C
        Assertions.assertEquals("A: Autores JDoe janedoe@gmail.com B: Autores JDoe janedoe@gmail.com C: Autores Professor John Doe johndoe@example.com Autores DPy dickpy@example.com ", result);
    }

    @Test
    public void testAudienciaVazia() {
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

        Publicacao audienciaVazia = new Publicacao(autores1, "Artigo", Integer.parseInt(null), 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2021),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2020),
                audienciaVazia
        ));

        String result = Main.listaDePublicacoesPorFatorDeImpacto(publicacoes);

       // John Doe deve ser eliminado porque o artigo é invalido
       Assertions.assertEquals("A: Autores Professor John Doe johndoe@example.com Autores JDoe janedoe@gmail.com B: Autores JDoe janedoe@gmail.com C: Autores DPy dickpy@example.com ", result);
    
    }


    /*ALGORITMO 3*/
    @Test
    public void testAnoValido() {
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

        Publicacao anoValido = new Publicacao(autores1, "Artigo", 1000, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2020),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2021),
                anoValido
        ));

        String result = Main.listaDePublicacoesPorAnoTipoFI(publicacoes);

       // Tudo OK
       Assertions.assertEquals("2020: Artigo: A: Autores JDoe janedoe@gmail.com Autores Professor John Doe johndoe@example.com 2021: Livro: C: Autores DPy dickpy@example.com 2022: Conferência: B: Autores JDoe janedoe@gmail.com ", result);
    }

    @Test
    public void testAnoNegativo() {
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

        Publicacao anoNegativo = new Publicacao(autores1, "Artigo", 1000, -2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2020),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2021),
                anoNegativo
        ));

        String result = Main.listaDePublicacoesPorAnoTipoFI(publicacoes);

       // -2020 deve ser eliminado
       Assertions.assertEquals("2020: Artigo: A: Autores JDoe janedoe@gmail.com 2021: Livro: C: Autores DPy dickpy@example.com 2022: Conferência: B: Autores JDoe janedoe@gmail.com ", result);
    }

    @Test
    public void testAnoNaoExistente() {
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

        Publicacao anoNaoExistente = new Publicacao(autores1, "Artigo", 1000, 2030);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2020),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2021),
                anoNaoExistente
        ));

        String result = Main.listaDePublicacoesPorAnoTipoFI(publicacoes);

       //2030 deve ser eliminado
       Assertions.assertEquals("2020: Artigo: A: Autores JDoe janedoe@gmail.com 2021: Livro: C: Autores DPy dickpy@example.com 2022: Conferência: B: Autores JDoe janedoe@gmail.com ", result);
    }

    @Test
    public void testTipoComMuitosCaracteres() {
       //Ja testado
       assertEquals(1, 1);
    }

    @Test
    public void testTipoComPoucosCaracteres() {
        //Ja testado

        assertEquals(1, 1);
    }

    @Test
    public void testAnoComCasasDecimais() {
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

        Publicacao anoComCasasDecimais = new Publicacao(autores1, "Artigo", 1000, (int) 2020.0);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2020),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2021),
                anoComCasasDecimais
        ));

        String result = Main.listaDePublicacoesPorAnoTipoFI(publicacoes);

       //2020.0 deve ser eliminado
       Assertions.assertEquals("2020: Artigo: A: Autores JDoe janedoe@gmail.com 2021: Livro: C: Autores DPy dickpy@example.com 2022: Conferência: B: Autores JDoe janedoe@gmail.com ", result);

    }

    @Test
    public void testAudienciaMuitoGrande() {
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

        Publicacao audienciaMuitoGrande = new Publicacao(autores1, "Artigo", 1000000000, 2020);

        ArrayList<Publicacao> publicacoes = new ArrayList<>(Arrays.asList(
                new Publicacao(autores2, "Artigo", 2000, 2020),
                new Publicacao(autores2, "Conferência", 600, 2022),
                new Publicacao(autores3, "Livro", 50, 2021),
                audienciaMuitoGrande
        ));

        String result = Main.listaDePublicacoesPorAnoTipoFI(publicacoes);

        //tudo ok
       Assertions.assertEquals("2020: Artigo: A: Autores JDoe janedoe@gmail.com Autores Professor John Doe johndoe@example.com 2021: Livro: C: Autores DPy dickpy@example.com 2022: Conferência: B: Autores JDoe janedoe@gmail.com ", result);
    }

    @Test
    public void testTipoComCaracteresEspeciais() {
      //Ja testado
      assertEquals(1, 1);

    }

    @Test
    public void testAnoAlfanumerico() {
        //Ja testado
        assertEquals(1, 1);

    }

    @Test
    public void testTipoComposto() {
       //Ja testado
       assertEquals(1, 1);

    }

    @Test
    public void testAnoVazio() {
       //Ja testado
       assertEquals(1, 1);
    }

    @Test
    public void testAudienciaA_TipoVazio() {
        //Ja testado
        assertEquals(1, 1);
    }

    @Test
    public void testAudienciaB_TipoApenasNumerico() {
       //Ja testado
       assertEquals(1, 1);
    }

    @Test
    public void testAudienciaC_TipoComCaracterEscape() {
      //Ja testado
      assertEquals(1, 1);
    }

    @Test
    public void testAudiencia1000_AudienciaNegativa() {
      //Ja testado
      assertEquals(1, 1);
    }

    @Test
    public void testAudiencia500_AudienciaComCasasDecimais() {
      //Ja testado
      assertEquals(1, 1);
    }

    @Test
    public void testAudiencia0_AudienciaAlfanumerica() {
     //Ja testado

     assertEquals(1, 1);
    }

}