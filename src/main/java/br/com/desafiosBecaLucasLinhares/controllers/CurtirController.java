package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.Services.CurtirService;
import br.com.desafiosBecaLucasLinhares.model.Curtir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("curtidas")
public class CurtirController {

    CurtirService curtirService;

    @Autowired
    public CurtirController(CurtirService curtirService) {
        this.curtirService = curtirService;
    }

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

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Curtir> atualizarPorId(@PathVariable Long id, @RequestBody Curtir curtida){

        Curtir curtidaAtualizada = curtirService.atualizarPorId(id, curtida);

        return ResponseEntity.ok().body(curtidaAtualizada);
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Curtir> deletar(@PathVariable Long id){

        return ResponseEntity.ok().body(curtirService.deletar(id));
    }
}
