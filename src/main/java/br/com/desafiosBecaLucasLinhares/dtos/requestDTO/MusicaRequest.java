package br.com.desafiosBecaLucasLinhares.dtos.requestDTO;

import br.com.desafiosBecaLucasLinhares.models.Musica;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicaRequest {

    private String nome;
    private int volume;
    private String artistaNome;

    public Musica converter(MusicaRequest musicaRequest) {

        return new Musica(musicaRequest);

    }

}
