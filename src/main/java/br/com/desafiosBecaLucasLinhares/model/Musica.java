package br.com.desafiosBecaLucasLinhares.model;

public class Musica implements AcoesMusica{

    private Long id;
    private String nome;
    private int volume;
    private String artistaNome;
    private Long quantidadeDownloads;
    private Long quantidadeCurtidas;


    @Override
    public void mudarVolume() {

    }
}
