package br.com.desafiosBecaLucasLinhares.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curtir{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPrincipal;

    @OneToOne
    public Musica musica;

    @OneToOne
    public Ouvinte ouvinte;

}
