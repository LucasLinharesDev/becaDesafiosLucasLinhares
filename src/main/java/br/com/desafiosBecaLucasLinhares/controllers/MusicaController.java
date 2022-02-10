package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.dtos.requestDTO.MusicaRequest;
import br.com.desafiosBecaLucasLinhares.dtos.responseDTO.MusicaResponse;
import br.com.desafiosBecaLucasLinhares.models.Musica;
import br.com.desafiosBecaLucasLinhares.services.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/musica")
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    @PostMapping("/criar")
    public ResponseEntity<MusicaResponse> criar(@RequestBody @Valid MusicaRequest musicaRequest){

        return ResponseEntity.created(null).body(musicaService.criar(musicaRequest));
    }

    @GetMapping("/obter/{id}")
    public ResponseEntity<MusicaResponse> obterPorId(@PathVariable Long id){

        return ResponseEntity.ok().body(musicaService.obterPorId(id));

    }

    @GetMapping("/obter/lista")
    public ResponseEntity<List<MusicaResponse>> obterLista(){

        List<MusicaResponse> listadeMusicas = musicaService.obterLista();

        return ResponseEntity.ok().body(listadeMusicas);
    }

    @PatchMapping("/atualizar/{id}")
    public ResponseEntity<MusicaResponse> atualizar(@PathVariable Long id, @RequestBody MusicaRequest musica){

        return ResponseEntity.ok().body(musicaService.atualizar(id, musica));

    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Musica> deletar(@PathVariable Long id){

       musicaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

}
