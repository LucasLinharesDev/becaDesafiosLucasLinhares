package br.com.desafiosBecaLucasLinhares.model;

import java.util.ArrayList;
import java.util.List;

public class Ouvinte extends Pessoa{

    private Long id;
    private String login;
    private Long totalMusicasReproduzidas=0L;

    List<Musica> listaMusicasDownload = new ArrayList<>();

    public Ouvinte(){

    }

    public Ouvinte(String nome, int idade, String sexo, String login,
                   Long totalMusicasReproduzidas,Musica musica) {

        super(nome, idade, sexo);
        setLogin(login);
        setTotalMusicasReproduzidas(totalMusicasReproduzidas);
        this.listaMusicasDownload.add(musica);

    }

    public void adicionarEmReproduzidas(){

    setTotalMusicasReproduzidas(getTotalMusicasReproduzidas()+1L);
    }

    public void adicionarEmListaDownloads(Musica musica){

        listaMusicasDownload.add(musica);

    }

    //Metodos Acessores e Auxiliares

    public Long getId() {

        return id;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {

        return login;

    }

    public void setLogin(String login) {

        this.login = login;

    }

    public Long getTotalMusicasReproduzidas() {

        return totalMusicasReproduzidas;

    }

    public void setTotalMusicasReproduzidas(Long totalMusicasReproduzidas) {

        this.totalMusicasReproduzidas = totalMusicasReproduzidas;

    }

}




