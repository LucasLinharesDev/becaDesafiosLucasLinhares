package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.Services.MusicaService;
import br.com.desafiosBecaLucasLinhares.model.Musica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("musica/")
public class MusicaController {

    private MusicaService musicaService;

    @Autowired
    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }

    @PostMapping("criar")
    public ResponseEntity<Musica> criar(@RequestBody Musica musica){

        Musica novaMusica = musicaService.criar(musica);
        return ResponseEntity.created(null).body(novaMusica);

    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Musica> obterMusica(@PathVariable Long id){

        Musica musicaObtidaPorId = musicaService.obterMusica(id);

        return ResponseEntity.ok().body(musicaObtidaPorId);

    }

    @GetMapping("obter/lista")
    public ResponseEntity<List<Musica>> obterLista(){

        List<Musica> listadeMusicas = musicaService.obterLista();

        return ResponseEntity.ok().body(listadeMusicas);
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Musica> atualizarId(@PathVariable Long id, @RequestBody Musica musica){

        Musica musicaAtualizada = musicaService.atualizarId(id, musica);

        return ResponseEntity.ok().body(musicaAtualizada);

    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Musica> deletar(@PathVariable Long id){

        Musica musicaDeletada = musicaService.deletar(id);

        return ResponseEntity.ok().body(musicaDeletada);
    }

}
