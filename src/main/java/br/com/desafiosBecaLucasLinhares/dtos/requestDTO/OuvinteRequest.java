package br.com.desafiosBecaLucasLinhares.dtos.requestDTO;

import br.com.desafiosBecaLucasLinhares.models.Ouvinte;
import br.com.desafiosBecaLucasLinhares.models.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OuvinteRequest{

    @NotBlank(message = "Nome não pode ser vazio!")
    private String nome;

    @NotNull(message = "Idade não pode ser vazia!")
    private Integer idade;

    @NotBlank(message = "Sexo não pode ser vazio!")
    private String sexo;

    @NotBlank(message = "Login não pode ser vazio!")
    private String login;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
