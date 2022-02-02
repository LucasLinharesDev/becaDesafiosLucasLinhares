package br.com.desafiosBecaLucasLinhares.dtos.requestDTO;

import br.com.desafiosBecaLucasLinhares.models.Ouvinte;
import br.com.desafiosBecaLucasLinhares.models.Pessoa;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OuvinteRequest{

    private String nome;
    private int idade;
    private String sexo;
    private String login;

}
