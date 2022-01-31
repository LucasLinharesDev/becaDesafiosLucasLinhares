package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.services.OuvinteService;
import br.com.desafiosBecaLucasLinhares.models.Ouvinte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("ouvinte")
public class OuvinteController {

    @Autowired
    OuvinteService ouvinteService;

    @PostMapping("criar")
    public ResponseEntity<Ouvinte> criar(@RequestBody Ouvinte ouvinte){

        Ouvinte ouvinteCriado = ouvinteService.criar(ouvinte);
        return ResponseEntity.created(null).body(ouvinteCriado);

    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Ouvinte> obterPorId(@PathVariable Long id){

        Ouvinte ouvinteObtidoPorId = ouvinteService.obterPorId(id);

        return ResponseEntity.ok().body(ouvinteObtidoPorId);
    }

    @GetMapping("obter/lista")
    public ResponseEntity<List<Ouvinte>> obterLista(){

        return ResponseEntity.ok().body(ouvinteService.obterLista());
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Ouvinte> deletarPorId(@PathVariable Long id){

        ouvinteService.deletarPorId(id);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Ouvinte> atualizarId(@PathVariable Long id, @RequestBody Ouvinte ouvinte){

        Ouvinte ouvinteAtualizadoPorId = ouvinteService.atualizarId(id, ouvinte);

        return ResponseEntity.ok().body(ouvinteAtualizadoPorId);

    }

}
