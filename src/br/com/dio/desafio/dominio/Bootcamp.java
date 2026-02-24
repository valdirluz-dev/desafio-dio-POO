package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    Set<Conteudo> conteudos = new LinkedHashSet<>();
    Set<Dev> devsInscritos = new LinkedHashSet<>();

    public void adicionarConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }

    public void adicionarDev(Dev dev){
        this.devsInscritos.add(dev);
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataInicial.plusDays(45);
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

}
