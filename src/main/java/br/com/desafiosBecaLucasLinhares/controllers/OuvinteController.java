package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.Services.OuvinteService;
import br.com.desafiosBecaLucasLinhares.model.Ouvinte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("ouvinte")
public class OuvinteController {

    OuvinteService ouvinteService;

    @Autowired
    public OuvinteController(OuvinteService ouvinteService) {
        this.ouvinteService = ouvinteService;
    }

    @PostMapping("criar")
    public ResponseEntity<Ouvinte> criar(@RequestBody Ouvinte ouvinte){

        Ouvinte ouvinteCriado = ouvinteService.criar(ouvinte);
        return ResponseEntity.created(null).body(ouvinteCriado);

    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Ouvinte> deletarPorId(@PathVariable Long id){

        Ouvinte ouvinteDeletado = ouvinteService.deletarPorId(id);

        return ResponseEntity.ok().body(ouvinteDeletado);
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

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Ouvinte> atualizarId(@PathVariable Long id, @RequestBody Ouvinte ouvinte){

        Ouvinte ouvinteAtualizadoPorId = ouvinteService.atualizarId(id, ouvinte);

        return ResponseEntity.ok().body(ouvinteAtualizadoPorId);

    }

}
