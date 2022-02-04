package br.com.desafiosBecaLucasLinhares.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curtir{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPrincipal;

    @OneToOne
    @NotNull(message = "Musica não pode ser nula.")
    public Musica musica;

    @OneToOne
    @NotNull(message = "Ouvinte não pode ser nulo.")
    public Ouvinte ouvinte;

}
