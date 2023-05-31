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

        while(var2.hasNext()) {
            Investigador a = (Investigador)var2.next();
            if (a.categoria.equals("Estudante")) {
                String[] arrOfStrig = a.nome.split(" ");
                nome.append(a.getNomePeU().charAt(0)).append(". ").append(arrOfStrig[arrOfStrig.length - 1]).append(",");
            } else {
                nome.append("Professor ").append(a.getNomePeU()).append(",");
            }
        }

        return nome.toString();
    }
    public char fatorDeImpacto() {
        if (this.audiencia >= 1000) {
            return 'A';
        } else {
            return (char)(this.audiencia > 500 ? 'B' : 'C');
        }
    }

    @Override
    public int compareTo(Publicacao publicacao) {
        return Integer.compare(this.ano, publicacao.getAno());
    }
    @Override
    public String toString() {
        return "Autores-" + autoresCisuc() ;
    }
}

class Investigador implements Comparable<Investigador>, Serializable {
    protected String nome;
    protected String email;

    public  String categoria;
    protected ArrayList<Publicacao> publicacoes = new ArrayList();

    public Investigador(String nome, String email,String categoria) {
        this.nome = nome;
        this.email = email;
        this.categoria = categoria;
    }



    public String toString() {
        String var10000 = this.getNomePeU();
        return var10000 + ", Email-" + this.email ;
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

        while(var4.hasNext()) {
            Publicacao i = (Publicacao)var4.next();
            if (aux == null || !i.getTipo().equals(aux.getTipo())) {
                string.append("\n").append(i.getTipo()).append(":\n\n");
            }

            aux = i;
            string.append(i.toString()).append("\n");
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

        while(var4.hasNext()) {
            Publicacao i = (Publicacao)var4.next();
            if (aux == null || i.fatorDeImpacto() != aux.fatorDeImpacto()) {
                string.append("\n").append(i.fatorDeImpacto()).append(":\n\n");
            }

            aux = i;
            string.append(i.toString()).append("\n");
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

        while(var4.hasNext()) {
            Publicacao i = (Publicacao)var4.next();
            if (aux == null || i.getAno() != aux.getAno()) {
                string.append("\n").append(i.getAno()).append(":\n\n");
            }

            aux = i;
            string.append(i.toString()).append("\n");
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
        return var10000 + arrOfStrig[0].substring(1).toLowerCase() + " " + arrOfStrig[arrOfStrig.length - 1].substring(0, 1).toUpperCase() + arrOfStrig[arrOfStrig.length - 1].substring(1).toLowerCase();
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




    //Codigo 1
    private static String nTotalDePublicacoesPorTipo(ArrayList<Publicacao> publicacoes) {//1
        ComparacaoPorTipo comparacaoPorTipo = new ComparacaoPorTipo();
        Collections.sort(publicacoes, comparacaoPorTipo); //2
        Publicacao ia = null;
        StringBuilder string = new StringBuilder();
        int count = 0;

        for(Iterator var6 = publicacoes.iterator(); var6.hasNext(); ++count) { //3
            Publicacao i = (Publicacao)var6.next();
            if (publicacoes.indexOf(i) == publicacoes.size() - 1) {//4
                if (ia != null && i.getTipo().equals(ia.getTipo())) {//6
                    string.append("\n").append(ia.getTipo()).append(":").append(count + 1).append("\n");//9
                } else if (ia != null) {//8
                    string.append("\n").append(ia.getTipo()).append(":").append(count).append("\n");
                    string.append("\n").append(i.getTipo()).append(":").append(1).append("\n");//10
                } else {//11
                    string.append("\n").append(i.getTipo()).append(":").append(1).append("\n");//12
                }
            } else if (ia != null && !i.getTipo().equals(ia.getTipo())) { //7
                string.append("\n").append(ia.getTipo().toUpperCase()).append(":").append(count).append("\n");
                count = 0;
            }

            ia = i;//14
        }

        return string.toString();//5
    }



    //Codigo 2
    public static String listaDePublicacoesPorFatorDeImpacto(ArrayList<Publicacao> publicacoes) {
        StringBuilder string = new StringBuilder();
        ComparacaoPorFatorDeImpacto comparacaoPorFatorDeImpacto = new ComparacaoPorFatorDeImpacto();
        Collections.sort(publicacoes, comparacaoPorFatorDeImpacto);
        Publicacao aux = null;
        Iterator var4 = publicacoes.iterator();

        while(var4.hasNext()) {
            Publicacao i = (Publicacao)var4.next();
            if (aux == null || i.fatorDeImpacto() != aux.fatorDeImpacto()) {
                string.append("\n").append(i.fatorDeImpacto()).append(":\n\n");
            }

            aux = i;
            string.append(i.toString()).append("\n");
        }

        if (aux == null) {
            return "Sem Publicações";
        } else {
            return string.toString();
        }
    }







    //Codigo 3
    public static String listaDePublicacoesPorAnoTipoFI(ArrayList<Publicacao> publicacoes) {
        StringBuilder string = new StringBuilder();
        Collections.sort (publicacoes);
        Publicacao aux = null;
        for (Publicacao i : publicacoes) {
            if (aux == null || i.getAno () != aux.getAno ()){
                System.out.println("ola");
                string.append("\n").append(i.getAno()).append(":\n").append("\n\t").append(i.getTipo()).append(":\n").append("\n\t\t").append(i.fatorDeImpacto()).append(":\n");
            }
            else if(!i.getTipo().equals(aux.getTipo())){

                string.append("\n\t").append(i.getTipo()).append(":\n").append("\n\t\t").append(i.fatorDeImpacto()).append(":\n");}
            else if(i.fatorDeImpacto() != aux.fatorDeImpacto())
                string.append("\n\t\t").append(i.fatorDeImpacto()).append(":\n");
            aux = i;
            string.append("\t\t\t\t").append(i.toString()).append("\n");
        }
        if(aux==null)
            string.append("Sem Publicações");
        return string.toString();
    }







    public static void main(String[] args) {

        //ArrayList<Publicacao> with different sets of Publicacao objects:
            //Example 1:
        ArrayList<Publicacao> publicacoes1 = new ArrayList<>();
        ArrayList<Investigador> autores1 = new ArrayList<>();
        autores1.add(new Investigador("John Doe", "john.doe@example.com", "Categoria1"));
        autores1.add(new Investigador("Jane Smith", "jane.smith@example.com", "Categoria2"));
        publicacoes1.add(new Publicacao(autores1, "Conference Paper", 500, 2022));
        publicacoes1.add(new Publicacao(autores1, "Journal Article", 1200, 2021));


            //Example 2:
        ArrayList<Publicacao> publicacoes2 = new ArrayList<>();
        ArrayList<Investigador> autores2 = new ArrayList<>();
        autores2.add(new Investigador("Alice Johnson", "alice.johnson@example.com", "Categoria1"));
        autores2.add(new Investigador("Bob Williams", "bob.williams@example.com", "Categoria2"));
        autores2.add(new Investigador("Charlie Brown", "charlie.brown@example.com", "Categoria3"));
        publicacoes2.add(new Publicacao(autores2, "Conference Paper", 800, 2020));
        publicacoes2.add(new Publicacao(autores2, "Journal Article", 1500, 2023));
        publicacoes2.add(new Publicacao(autores2, "Book Chapter", 400, 2022));


            //Example 3:
        ArrayList<Publicacao> publicacoes3 = new ArrayList<>();
        ArrayList<Investigador> autores3 = new ArrayList<>();
        autores3.add(new Investigador("Emily Davis", "emily.davis@example.com", "Categoria1"));
        publicacoes3.add(new Publicacao(autores3, "Conference Paper", 300, 2021));
        publicacoes3.add(new Publicacao(autores3, "Journal Article", 900, 2022));
        publicacoes3.add(new Publicacao(autores3, "Book Chapter", 600, 2020));


            //Example 4:
        ArrayList<Publicacao> publicacoes4 = new ArrayList<>();
        ArrayList<Investigador> autores4 = new ArrayList<>();
        autores4.add(new Investigador("Michael Brown", "michael.brown@example.com", "Estudante"));
        autores4.add(new Investigador("Sophia Wilson", "sophia.wilson@example.com" ,"Categoria2"));
        autores4.add(new Investigador("Daniel Smith", "daniel.smith@example.com", "Categoria3"));
        publicacoes4.add(new Publicacao(autores4, "Conference Paper", 400, 2022));
        publicacoes4.add(new Publicacao(autores4, "Journal Article", 900, 2022));


        //System.out.println(listaDePublicacoesPorAnoTipoFI(publicacoes4));
        System.out.println(listaDePublicacoesPorAnoTipoFI(publicacoes4));

    }
}
