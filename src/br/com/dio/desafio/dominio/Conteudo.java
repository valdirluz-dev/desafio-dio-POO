package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected String titulo;
    protected String descricao;
    protected static final int DEFAULT_XP = 10;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();
}