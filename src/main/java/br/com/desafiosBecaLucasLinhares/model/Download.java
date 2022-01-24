package br.com.desafiosBecaLucasLinhares.model;

import java.util.Date;

public class Download {

    private Long id;
    private Musica musica;
    private Ouvinte ouvinte;
    private Date data;

    public Download(){

    }

    public Download(Musica musica, Ouvinte ouvinte, Date data) {

        setMusica(musica);
        setOuvinte(ouvinte);
        setData(data);

    }

    // Métodos auxiliares e Acessores

    public Long getId() {

        return id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public Musica getMusica() {

        return musica;

    }

    public void setMusica(Musica musica) {

        this.musica = musica;

    }

    public Ouvinte getOuvinte() {

        return ouvinte;

    }

    public void setOuvinte(Ouvinte ouvinte) {

        this.ouvinte = ouvinte;

    }

    public Date getData() {

        return data;

    }

    public void setData(Date data) {

        this.data = data;

    }
}
