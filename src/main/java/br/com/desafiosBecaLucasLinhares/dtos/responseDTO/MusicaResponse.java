package br.com.desafiosBecaLucasLinhares.dtos.responseDTO;

import br.com.desafiosBecaLucasLinhares.models.Musica;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MusicaResponse {

    private Long id;
    private String nome;
    private String artistaNome;


    public MusicaResponse(Musica musica){

        this.id = musica.getId();
        this.nome = musica.getNome();
        this.artistaNome = musica.getArtistaNome();
    }

}
