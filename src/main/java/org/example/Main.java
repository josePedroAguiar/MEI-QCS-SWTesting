package org.example;

import java.util.*;
/*
Jose Pedro Silva Aguiar (2019224624)
*/

/*
NOTA:
    hashmap/hashtree- positions de elementos de comparacao
*/
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

class Publicacao implements Comparable<Publicacao> {
    protected ArrayList<Investigador> autores;
    protected String tipo;
    protected int ano;
    protected int audiencia;

    public void setAutores(ArrayList<Investigador> autores) {
        this.autores = autores;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAudiencia(int audiencia) {
        this.audiencia = audiencia;
    }

    public ArrayList<Investigador> getAutores() {
        return autores;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAno() {
        return ano;
    }

    public int getAudiencia() {
        return audiencia;
    }

    public Publicacao(ArrayList<Investigador> autores, String tipo, int audiencia, int ano) {
        this.audiencia = audiencia;
        this.ano = ano;
        this.tipo = tipo;
        this.autores = autores;
    }

    private String autoresCisuc() {
        StringBuilder nome = new StringBuilder();
        Iterator var2 = this.autores.iterator();

        while (var2.hasNext()) {
            Investigador a = (Investigador) var2.next();
            if (a.categoria.equals("Estudante")) {
                String[] arrOfStrig = a.nome.split(" ");
                nome.append(a.getNomePeU().charAt(0)).append("").append(arrOfStrig[arrOfStrig.length - 1]).append(" ").append(a.getEmail());
            } else {
                nome.append("Professor ").append("").append(a.getNomePeU()).append(" ").append(a.getEmail());
            }
        }

        return nome.toString();
    }

    public char fatorDeImpacto() {
        if (this.audiencia >= 1000) {
            return 'A';
        } else {
            return (char) (this.audiencia > 500 ? 'B' : 'C');
        }
    }

    @Override
    public int compareTo(Publicacao publicacao) {
        return Integer.compare(this.ano, publicacao.getAno());
    }

    @Override
    public String toString() {
        return "Autores " + autoresCisuc();
    }
}

class Investigador implements Comparable<Investigador>, Serializable {
    protected String nome;
    protected String email;

    public String categoria;
    protected ArrayList<Publicacao> publicacoes = new ArrayList();

    public Investigador(String nome, String email, String categoria) {
        this.nome = nome;
        this.email = email;
        this.categoria = categoria;
    }

    public String toString() {
        String var10000 = this.getNomePeU();
        return ", Email-" + this.email;
    }

    public int compareTo(Investigador o) {
        return this.categoria.compareTo(o.categoria);
    }

    public String listaDePublicacoesPorTipo() {
        StringBuilder string = new StringBuilder();
        ComparacaoPorTipo comparacaoPorTipo = new ComparacaoPorTipo();
        Collections.sort(this.publicacoes, comparacaoPorTipo);
        Publicacao aux = null;
        Iterator var4 = this.publicacoes.iterator();

        while (var4.hasNext()) {
            Publicacao i = (Publicacao) var4.next();
            if (aux == null || !i.getTipo().equals(aux.getTipo())) {
                string.append(i.getTipo()).append(": ");
            }

            aux = i;
            string.append(i.toString());
        }

        if (aux == null) {
            return "Sem Publicações";
        } else {
            return string.toString();
        }
    }

    public String listaDePublicacoesPorFatorDeImpacto() {
        StringBuilder string = new StringBuilder();
        ComparacaoPorFatorDeImpacto comparacaoPorFatorDeImpacto = new ComparacaoPorFatorDeImpacto();
        Collections.sort(this.publicacoes, comparacaoPorFatorDeImpacto);
        Publicacao aux = null;
        Iterator var4 = this.publicacoes.iterator();

        while (var4.hasNext()) {
            Publicacao i = (Publicacao) var4.next();
            if (aux == null || i.fatorDeImpacto() != aux.fatorDeImpacto()) {
                string.append(i.fatorDeImpacto()).append(": ");
            }

            aux = i;
            string.append(i.toString());
        }

        if (aux == null) {
            return "Sem Publicações";
        } else {
            return string.toString();
        }
    }

    public String listaDePublicacoesPorAno() {
        StringBuilder string = new StringBuilder();
        ComparacaoPorAno comparacaoPorAno = new ComparacaoPorAno();
        Collections.sort(this.publicacoes, comparacaoPorAno);
        Publicacao aux = null;
        Iterator var4 = this.publicacoes.iterator();

        while (var4.hasNext()) {
            Publicacao i = (Publicacao) var4.next();
            if (aux == null || i.getAno() != aux.getAno()) {
                string.append(i.getAno()).append(": ");
            }

            aux = i;
            string.append(i.toString());
        }

        if (aux == null) {
            return "Sem Publicações";
        } else {
            return string.toString();
        }
    }

    public String getNomePeU() {
        String[] arrOfStrig = this.nome.split(" ");
        String var10000 = arrOfStrig[0].substring(0, 1).toUpperCase();
        return var10000 + arrOfStrig[0].substring(1).toLowerCase() + " "
                + arrOfStrig[arrOfStrig.length - 1].substring(0, 1).toUpperCase()
                + arrOfStrig[arrOfStrig.length - 1].substring(1).toLowerCase();
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return this.publicacoes;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
}

public class Main {

    // Codigo 1
    static String nTotalDePublicacoesPorTipo(ArrayList<Publicacao> publicacoes) {
        ComparacaoPorTipo comparacaoPorTipo = new ComparacaoPorTipo();
        Collections.sort(publicacoes, comparacaoPorTipo); //2
        Publicacao ia = null;
        StringBuilder string = new StringBuilder();
        int count = 0;
        for (Publicacao i : publicacoes) {
            if (publicacoes.indexOf(i) == publicacoes.size() - 1) {
                if (ia != null && i.getTipo().equals(ia.getTipo()))
                    string.append(ia.getTipo()).append(":").append(count + 1).append(" ");
                else if (ia != null) {
                    string.append(ia.getTipo()).append(":").append(count).append(" ");
                    string.append(i.getTipo()).append(":").append(1).append(" ");
                } else {
                    string.append(i.getTipo()).append(":").append(1).append(" ");
                }
            } else if (ia != null && !i.getTipo().equals(ia.getTipo())) {
                string.append(ia.getTipo()).append(":").append(count).append(" ");
                count = 0;
            }
            ia = i;
            count++;

        }
        return string.toString();
    }

    // Codigo 2
    public static String listaDePublicacoesPorFatorDeImpacto(ArrayList<Publicacao> publicacoes) {
        StringBuilder string = new StringBuilder();
        ComparacaoPorFatorDeImpacto comparacaoPorFatorDeImpacto = new ComparacaoPorFatorDeImpacto();
        Collections.sort(publicacoes, comparacaoPorFatorDeImpacto);
        Publicacao aux = null;
        Iterator var4 = publicacoes.iterator();

        while (var4.hasNext()) {
            Publicacao i = (Publicacao) var4.next();
            if (aux == null || i.fatorDeImpacto() != aux.fatorDeImpacto()) {
                string.append(i.fatorDeImpacto()).append(": ");
            }

            aux = i;
            string.append(i.toString()).append(" ");
        }

        if (aux == null) {
            string.append("Sem Publicações");
        }
        return string.toString();
    }

    // codigo 3
    public static String listaDePublicacoesPorAnoTipoFI(ArrayList<Publicacao> publicacoes) {
        StringBuilder string = new StringBuilder();
        Collections.sort (publicacoes);
        Publicacao aux = null;
        for (Publicacao i : publicacoes) {
            
            if (aux == null || i.getAno() != aux.getAno()) {
                string.append(i.getAno()).append(": ").append(i.getTipo()).append(": ")
                        .append(i.fatorDeImpacto()).append(": ");
            } else if (!i.getTipo().equals(aux.getTipo()))
                string.append(i.getTipo()).append(": ").append(i.fatorDeImpacto()).append(": ");
            else if (i.fatorDeImpacto() != aux.fatorDeImpacto())
                string.append(i.fatorDeImpacto()).append(": ");
            aux = i;
            string.append(i.toString()).append(" ");
        }
        if (aux == null)
            string.append("Sem Publicações");
        return string.toString();
    }

    public static void main(String[] args) {

        // ArrayList<Publicacao> with different sets of Publicacao objects:
        // Example 1:
        ArrayList<Publicacao> publicacoes1 = new ArrayList<>();
        ArrayList<Investigador> autores1 = new ArrayList<>();
        autores1.add(new Investigador("John Doe", "john.doe@example.com", "Categoria1"));
        autores1.add(new Investigador("Jane Smith", "jane.smith@example.com", "Categoria2"));
        publicacoes1.add(new Publicacao(autores1, "Conference Paper", 500, 2022));
        publicacoes1.add(new Publicacao(autores1, "Journal Article", 1200, 2021));

        // Example 2:
        ArrayList<Publicacao> publicacoes2 = new ArrayList<>();
        ArrayList<Investigador> autores2 = new ArrayList<>();
        autores2.add(new Investigador("Alice Johnson", "alice.johnson@example.com", "Categoria1"));
        autores2.add(new Investigador("Bob Williams", "bob.williams@example.com", "Categoria2"));
        autores2.add(new Investigador("Charlie Brown", "charlie.brown@example.com", "Categoria3"));
        publicacoes2.add(new Publicacao(autores2, "Conference Paper", 800, 2020));
        publicacoes2.add(new Publicacao(autores2, "Journal Article", 1500, 2023));
        publicacoes2.add(new Publicacao(autores2, "Book Chapter", 400, 2022));

        // Example 3:
        ArrayList<Publicacao> publicacoes3 = new ArrayList<>();
        ArrayList<Investigador> autores3 = new ArrayList<>();
        autores3.add(new Investigador("Emily Davis", "emily.davis@example.com", "Categoria1"));
        publicacoes3.add(new Publicacao(autores3, "Conference Paper", 300, 2021));
        publicacoes3.add(new Publicacao(autores3, "Journal Article", 900, 2022));
        publicacoes3.add(new Publicacao(autores3, "Book Chapter", 600, 2020));
        publicacoes3.add(new Publicacao(autores3, "Conference Paper", 300, 2021));
        publicacoes3.add(new Publicacao(autores3, "Journal Article", 900, 2022));
        publicacoes3.add(new Publicacao(autores3, "Book Chapter", 600, 2020));

        // Example 4:
        ArrayList<Publicacao> publicacoes4 = new ArrayList<>();
        ArrayList<Investigador> autores4 = new ArrayList<>();
        autores4.add(new Investigador("Michael Brown", "michael.brown@example.com", "Estudante"));
        autores4.add(new Investigador("Sophia Wilson", "sophia.wilson@example.com", "Categoria2"));
        autores4.add(new Investigador("Daniel Smith", "daniel.smith@example.com", "Categoria3"));
        publicacoes4.add(new Publicacao(autores4, "Conference Paper", 400, 2022));
        publicacoes4.add(new Publicacao(autores4, "Journal Article", 1100, 2021));
        publicacoes4.add(new Publicacao(autores4, "Book Chapter", 500, 2023));
        /*
        // Codigo 1
        System.out.println(nTotalDePublicacoesPorTipo(publicacoes1));
        System.out.println(nTotalDePublicacoesPorTipo(publicacoes2));
        System.out.println(nTotalDePublicacoesPorTipo(publicacoes3));
        System.out.println(nTotalDePublicacoesPorTipo(publicacoes4));

        /* 
        // Codigo 2
        System.out.println(listaDePublicacoesPorFatorDeImpacto(publicacoes1));
        System.out.println(listaDePublicacoesPorFatorDeImpacto(publicacoes2));
        System.out.println(listaDePublicacoesPorFatorDeImpacto(publicacoes3));
        System.out.println(listaDePublicacoesPorFatorDeImpacto(publicacoes4));
        */
        // Codigo 3
        System.out.println(listaDePublicacoesPorAnoTipoFI(publicacoes1));
        System.out.println(listaDePublicacoesPorAnoTipoFI(publicacoes2));
        System.out.println(listaDePublicacoesPorAnoTipoFI(publicacoes4));

        /*
         * ArrayList<Publicacao> publicacoes = new ArrayList<>();
         * ArrayList<Investigador> autores = new ArrayList<>();
         * autores.add(new Investigador("John Doe", "john.doe@example.com",
         * "Categoria1"));
         * publicacoes.add(new Publicacao(autores, null, 500, 2022));
         * System.out.println(listaDePublicacoesPorAnoTipoFI(publicacoes));
         */

        Investigador investigadorValido = new Investigador("John Doe", "johndoe@example.com", "Professor");
        Investigador nomeValido = new Investigador("John Doe", "johndoe@example.com", "Professor");
        Investigador nomeVazio = new Investigador("", "johndoe@example.com", "Professor");
        Investigador nomePoucosCaracteres = new Investigador("A", "johndoe@example.com", "Professor");
        Investigador nomeMuitosCaracteres = new Investigador("JohnJohJohnJohnJohn", "johndoe@example.com", "Professor");
        Investigador nomeCaracteresEspeciais1 = new Investigador("John§", "johndoe@example.com", "Professor");
        Investigador nomeCaracteresEspeciais2 = new Investigador("Johnç", "johndoe@example.com", "Professor");
        Investigador nomeCaracteresEspeciais3 = new Investigador("Johnà", "johndoe@example.com", "Professor");
        Investigador nomeApenasNumerico = new Investigador("1231231231", "johndoe@example.com", "Professor");
        Investigador nomeComposto = new Investigador("John-Doe", "johndoe@example.com", "Professor");
        Investigador nomeCaracterEscape1 = new Investigador("John\\", "johndoe@example.com", "Professor");
        Investigador nomeCaracterEscape2 = new Investigador("John_", "johndoe@example.com", "Professor");
        Investigador emailValido = new Investigador("John Doe", "johndoe@example.com", "Professor");
        Investigador emailVazio = new Investigador("John Doe", "", "Professor");
        Investigador emailSemCampos = new Investigador("John Doe", "@example.com", "Professor");
        Investigador emailPoucosCaracteres = new Investigador("John Doe", "a@example.com", "Professor");
        Investigador emailMuitosCaracteres = new Investigador("John Doe", "johnnn@example.com", "Professor");
        Investigador emailCaracteresEspeciais = new Investigador("John Doe", "john!@example.com", "Professor");
        Investigador emailComEspacos = new Investigador("John Doe", "john doe@example.com", "Professor");
        Investigador emailMaiusculasMinusculas = new Investigador("John Doe", "JoHn@ExaMpLE.com", "Professor");
        Investigador categoriaValida1 = new Investigador("John Doe", "johndoe@example.com", "Estudante");
        Investigador categoriaValida2 = new Investigador("John Doe", "johndoe@example.com", "Professor");
        Investigador categoriaCaseSensitive1 = new Investigador("John Doe", "johndoe@example.com", "professor");
        Investigador categoriaCaseSensitive2 = new Investigador("John Doe", "johndoe@example.com", "estudante");
        Investigador categoriaInvalida = new Investigador("John Doe", "johndoe@example.com", "Teste");
        Investigador categoriaVazia = new Investigador("JohnDoe", "johndoe@example.com", "");
        Investigador investigadorValido2 = new Investigador("John Q. Public", "johnpublic@example.com", "Professor");
        Investigador investigadorValido3 = new Investigador("Jane Doe", "janedoe@gmail.com", "Estudante");
        Investigador investigadorValido4 = new Investigador("Tom Smith", "tomesmith@outlook.com", "Estudante");
        Investigador investigadorValido5 = new Investigador("Dick Py", "dickpy@example.com", "Estudante");
        Investigador investigadorValido6 = new Investigador("Harry Jones", "harry@example.com", "Professor");
        Investigador investigadorValido7 = new Investigador("So-and-So", "sososo@example.com", "Estudante");
        ArrayList<Publicacao> publicacoes = new ArrayList<>();
        ArrayList<Investigador> autores = new ArrayList<>();
        Investigador investigador = new Investigador("John Doe", "johndoe@example.com", "Professor");
        Publicacao semAutores = new Publicacao(autores, "Artigo", 1050, 2020);
        Publicacao comAutores = new Publicacao(autores, "Artigo", 1050, 2020);
        Publicacao tipoValido = new Publicacao(autores, "Artigo", 1050, 2020);
        Publicacao tipoVazio = new Publicacao(autores, (String) null, 1050, 2020);
        Publicacao tipoPoucosCaracteres = new Publicacao(autores, "A", 1050, 2020);
        Publicacao tipoMuitosCaracteres = new Publicacao(autores,
                "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
                1050, 2020);
        Publicacao tipoCaracteresEspeciais1 = new Publicacao(autores, "Açarito", 1050, 2020);
        Publicacao tipoCaracteresEspeciais2 = new Publicacao(autores, "Àrtigo", 1050, 2020);
        Publicacao tipoCaracteresEspeciais3 = new Publicacao(autores, "Artigo@", 1050, 2020);
        Publicacao tipoApenasNumerico = new Publicacao(autores, "111111", 1050, 2020);
        Publicacao tipoComposto = new Publicacao(autores, "Artigo-Cientifico", 1050, 2020);
        Publicacao tipoComEscape1 = new Publicacao(autores, "Artigo\\an", 1050, 2020);
        Publicacao tipoComEscape2 = new Publicacao(autores, "Artigo_Cientifico", 1050, 2020);
        Publicacao audienciaA = new Publicacao(autores, "Artigo", 1050, 2020);
        Publicacao audienciaB = new Publicacao(autores, "Artigo", 600, 2020);
        Publicacao audienciaC = new Publicacao(autores, "Artigo", 300, 2020);
        Publicacao audienciaNegativa = new Publicacao(autores, "Artigo", -230, 2020);
        // Publicacao audienciaCasasDecimais = new Publicacao(autores, "Artigo", 20.5,
        // 2020);
        Publicacao audienciaMuitoGrande = new Publicacao(autores, "Artigo", Integer.MAX_VALUE, 2020);
        // Publicacao audienciaAlfanumerica = new Publicacao(autores, "Artigo", "2A2",
        // 2020);
        Publicacao audiencia1000 = new Publicacao(autores, "Artigo", 1000, 2020);
        Publicacao audiencia500 = new Publicacao(autores, "Artigo", 500, 2020);
        Publicacao audiencia0 = new Publicacao(autores, "Artigo", 0, 2020);
        Publicacao audienciaVazia = new Publicacao(autores, "Artigo", 0, 2020);
        Publicacao anoNegativo = new Publicacao(autores, "Artigo", -1000, -2000);
        Publicacao anoFuturo = new Publicacao(autores, "Artigo", 1050, 2300);
        // Publicacao anoCasasDecimais = new Publicacao(autores, "Artigo", 1050,
        // 2000.2);
        Publicacao anoMuitoGrande = new Publicacao(autores, "Artigo", 1050, Integer.MAX_VALUE);
        // Publicacao anoAlfanumerico = new Publicacao(autores, "Artigo", 1050,
        // "20a0");
        // Publicacao anoVazio = new Publicacao(autores, "Artigo", 1050, "");

    }
}
