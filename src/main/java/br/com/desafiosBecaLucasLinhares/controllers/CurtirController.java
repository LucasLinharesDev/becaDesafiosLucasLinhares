package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.services.CurtirService;
import br.com.desafiosBecaLucasLinhares.models.Curtir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("curtidas")
public class CurtirController {

    @Autowired
    CurtirService curtirService;

    @PostMapping( "adicionar" )
    public ResponseEntity<Curtir> curtir( @RequestBody Curtir curtida){

        Curtir curtidaAdicionada = curtirService.adicionarCurtida(curtida);

        return ResponseEntity.ok().body(curtidaAdicionada);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Curtir> obterPorId(@PathVariable Long id){

        Curtir curtidaObtidaPorId = curtirService.obterPorId(id);

        return ResponseEntity.ok().body(curtidaObtidaPorId);
    }

    @GetMapping("obter/lista")
    public ResponseEntity<List<Curtir>> obterLista(){

        List<Curtir> listaObtida = curtirService.listaDeCurtidas();

        return ResponseEntity.ok().body(listaObtida);

    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Curtir> deletar(@PathVariable Long id){

        curtirService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Curtir> atualizarPorId(@PathVariable Long id, @RequestBody Curtir curtida){

        Curtir curtidaAtualizada = curtirService.atualizarPorId(id, curtida);

        return ResponseEntity.ok().body(curtidaAtualizada);
    }
}
