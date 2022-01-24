package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.model.Reproduzir;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("reproduzir")
public class ReproduzirController {


    @PostMapping("iniciar")
    public ResponseEntity<Reproduzir> iniciarReproducao(@RequestBody Reproduzir reproducao){

    reproducao.getOuvinte().adicionarEmReproduzidas();

    return ResponseEntity.ok().body(reproducao);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Reproduzir> obterPorId(@PathVariable Long id){

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Reproduzir> atualizarPorId(@PathVariable Long id, @RequestBody Reproduzir reproducao){

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Reproduzir> deletar(@PathVariable Long id){

        return ResponseEntity.noContent().build();

    }

}
