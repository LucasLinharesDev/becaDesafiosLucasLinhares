package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.model.Ouvinte;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ouvinte")
public class OuvinteController {

    @PostMapping("criar")
    public ResponseEntity<Ouvinte> criar(@RequestBody Ouvinte ouvinte){

        return ResponseEntity.created(null).body(ouvinte);

    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Ouvinte> deletarPorId(@PathVariable Long id){

        return ResponseEntity.ok().build();
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Ouvinte> obterPorId(@PathVariable Long id){

        return ResponseEntity.notFound().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Ouvinte> atualizarId(@PathVariable Long id, @RequestBody Ouvinte ouvinte){

        ouvinte.setId(id);
        return ResponseEntity.ok().body(ouvinte);

    }

}
