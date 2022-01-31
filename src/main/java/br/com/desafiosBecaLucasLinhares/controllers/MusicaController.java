package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.models.Musica;
import br.com.desafiosBecaLucasLinhares.services.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("musica")
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    @PostMapping("criar")
    public ResponseEntity<Musica> criar(@RequestBody Musica musica){

        return ResponseEntity.created(null).body(musicaService.criar(musica));
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Musica> obterPorId(@PathVariable Long id){

        Musica musicaObtida = musicaService.obterPorId(id);
        return ResponseEntity.ok().body(musicaObtida);

    }

    @GetMapping("obter/lista")
    public ResponseEntity<List<Musica>> obterLista(){

        List<Musica> listadeMusicas = musicaService.obterLista();

        return ResponseEntity.ok().body(listadeMusicas);
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Musica> atualizarId(@PathVariable Long id, @RequestBody Musica musica){

        Musica musicaAtualizada = musicaService.atualizar(id, musica);

        return ResponseEntity.ok().body(musicaAtualizada);

    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Musica> deletar(@PathVariable Long id){

       musicaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

}
