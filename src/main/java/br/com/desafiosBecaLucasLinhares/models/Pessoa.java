package br.com.desafiosBecaLucasLinhares.models;

import jdk.jfr.Description;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Description("tipo_pessoa")
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Campo nome não pode ser vazio.")
    private String nome;

    @NotNull
    @Min(18)
    private Integer idade;

    @NotBlank
    private String sexo;

}
