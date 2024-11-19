package models;

public class Musica {
    private String titulo;
    private String genero;
    private double duracao;

    public Musica(String titulo, String genero, double duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
