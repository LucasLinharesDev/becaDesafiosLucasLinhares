package br.com.desafiosBecaLucasLinhares.models;

import br.com.desafiosBecaLucasLinhares.dtos.requestDTO.OuvinteRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ouvinte extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @CPF
    private String login;

    public Ouvinte(OuvinteRequest ouvinteRequest){

        this.setNome(ouvinteRequest.getNome());
        this.setIdade(ouvinteRequest.getIdade());
        this.setSexo(ouvinteRequest.getSexo());
        this.setLogin(ouvinteRequest.getLogin());

    }

}




