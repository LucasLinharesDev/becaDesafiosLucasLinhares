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
public class Download {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    @NotNull(message = "Musica não pode ser nula.")
    private Musica musica;

    @OneToOne
    @NotNull(message = "Ouvinte não pode ser nulo.")
    private Ouvinte ouvinte;

}
