package br.com.desafiosBecaLucasLinhares.dtos.responseDTO;

import br.com.desafiosBecaLucasLinhares.models.Ouvinte;
import br.com.desafiosBecaLucasLinhares.models.Pessoa;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OuvinteResponse {

    private Long id;
    private String nome;

    public OuvinteResponse(Ouvinte ouvinte){

        setId(ouvinte.getId());
        setNome(ouvinte.getNome());
    }

}
