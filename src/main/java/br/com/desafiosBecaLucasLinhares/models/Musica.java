package br.com.desafiosBecaLucasLinhares.models;


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

    @Override
    public void mudarVolume(int volume) {
    setVolume(volume);
    }

}
