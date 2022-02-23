package br.com.desafiosBecaLucasLinhares.dtos.requestDTO;

import br.com.desafiosBecaLucasLinhares.models.Ouvinte;
import br.com.desafiosBecaLucasLinhares.models.Pessoa;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class OuvinteRequest{

    @NotBlank(message = "Nome não pode ser vazio!")
    private String nome;

    @NotNull(message = "Idade não pode ser vazia!")
    private Integer idade;

    @NotBlank(message = "Sexo não pode ser vazio!")
    private String sexo;

    @NotBlank(message = "Login não pode ser vazio!")
    private String login;

}
