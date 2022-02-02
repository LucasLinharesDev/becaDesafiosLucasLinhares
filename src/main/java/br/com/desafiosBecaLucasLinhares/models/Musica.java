package br.com.desafiosBecaLucasLinhares.models;


import br.com.desafiosBecaLucasLinhares.dtos.requestDTO.MusicaRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Musica implements AcoesMusica{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private int volume;
    private String artistaNome;

    public Musica(MusicaRequest musicaRequest) {

        this.setNome(musicaRequest.getNome());
        //this.setVolume(musicaDTO.getVolume());
        this.setArtistaNome(musicaRequest.getArtistaNome());
    }

    @Override
    public void mudarVolume(int volume) {
    setVolume(volume);
    }

}
