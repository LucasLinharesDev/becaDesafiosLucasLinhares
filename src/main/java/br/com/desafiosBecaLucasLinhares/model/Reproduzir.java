package br.com.desafiosBecaLucasLinhares.model;

import java.util.Date;

public class Reproduzir {

    private Long id;
    private Ouvinte ouvinte;
    private Musica musica;
    private Date data;

    public Reproduzir(){

    }

    public Reproduzir(Ouvinte ouvinte, Musica musica, Date data) {

        setOuvinte(ouvinte);
        setMusica(musica);
        setData(data);

    }

    // Métodos Acessores e Auxiliares

    public Long getId() {

        return id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public Ouvinte getOuvinte() {

        return ouvinte;

    }

    public void setOuvinte(Ouvinte ouvinte) {

        this.ouvinte = ouvinte;

    }

    public Musica getMusica() {

        return musica;

    }

    public void setMusica(Musica musica) {

        this.musica = musica;

    }

    public Date getData() {

        return data;

    }

    public void setData(Date data) {

        this.data = data;

    }


}
