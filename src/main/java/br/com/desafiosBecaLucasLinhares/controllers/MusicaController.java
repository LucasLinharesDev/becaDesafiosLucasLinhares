package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.model.Musica;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("musica/")
public class MusicaController {

    @PostMapping("criar")
    public ResponseEntity<Musica> criar(@RequestBody Musica musica){

        return ResponseEntity.created(null).body(musica);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Musica> obterMusica(@PathVariable Long id){

        return ResponseEntity.noContent().build();

    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Musica> atualizarId(@PathVariable Long id, @RequestBody Musica musica){

        musica.setId(id);
        return ResponseEntity.ok().body(musica);

    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Musica> deletar(@PathVariable Long id){

        return ResponseEntity.ok().build();
    }

}
