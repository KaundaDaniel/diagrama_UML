package models;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusica;

public class Iphone implements ReprodutorMusica, AparelhoTelefonico, NavegadorNaInternet {
    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {
        System.out.println();

    }

    @Override
    public void aumentarVolumen() {

    }

    @Override
    public void disminuirVolumen() {

    }

    @Override
    public String selecionarMusica(Musica musica) {
        return  musica.getTitulo() + " " + musica.getDuracao();
    }

    @Override
    public void ligar() {

    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void navegarParaPagina(String url) {

    }

    @Override
    public void voltarPagina() {

    }

    @Override
    public void avancarPagina() {

    }

    @Override
    public void fecharNavegador() {

    }

    @Override
    public void actualizarPagina() {

    }
}
