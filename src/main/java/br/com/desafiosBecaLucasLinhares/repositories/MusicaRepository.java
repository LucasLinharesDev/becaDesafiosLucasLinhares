package br.com.desafiosBecaLucasLinhares.repositories;

import br.com.desafiosBecaLucasLinhares.models.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Long> {
}