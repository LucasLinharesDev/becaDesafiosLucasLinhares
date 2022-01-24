package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.model.Curtir;
import br.com.desafiosBecaLucasLinhares.model.Musica;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("curtidas")
public class CurtirController {

    @PostMapping( "adicionar" )
    public ResponseEntity<Curtir> curtir( @RequestBody Curtir curtida){

        curtida.musica.setQuantidadeCurtidas(curtida.musica.getQuantidadeCurtidas() + 1);
        return ResponseEntity.ok().body(curtida);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Curtir> obterPorId(@PathVariable Long id){

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Curtir> atualizarPorId(@PathVariable Long id, @RequestBody Musica musica){

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Curtir> deletar(@PathVariable Long id){

        return ResponseEntity.noContent().build();
    }
}
