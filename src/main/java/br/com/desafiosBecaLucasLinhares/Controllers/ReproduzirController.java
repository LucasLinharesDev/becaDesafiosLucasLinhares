package br.com.desafiosBecaLucasLinhares.Controllers;

import br.com.desafiosBecaLucasLinhares.Services.ReproduzirService;
import br.com.desafiosBecaLucasLinhares.Models.Reproduzir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reproduzir")
public class ReproduzirController {

    @Autowired
    ReproduzirService reproduzirService;

    @PostMapping("iniciar")
    public ResponseEntity<Reproduzir> iniciarReproducao(@RequestBody Reproduzir reproducao){

   Reproduzir reproducaoIniciada = reproduzirService.iniciarReproducao(reproducao);

    return ResponseEntity.ok().body(reproducaoIniciada);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Reproduzir> obterPorId(@PathVariable Long id){

        Reproduzir reproducaoObtidaPorId = reproduzirService.obterPorId(id);

        return ResponseEntity.ok().body(reproducaoObtidaPorId);
    }

    @GetMapping("obter/lista")
    public ResponseEntity<List<Reproduzir>> obterLista(){

        List<Reproduzir> listaReproduzirObtida = reproduzirService.obterLista();

        return ResponseEntity.ok().body(listaReproduzirObtida);

    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Reproduzir> atualizarPorId(@PathVariable Long id, @RequestBody Reproduzir reproducao){

        Reproduzir reproducaoAtualizada = reproduzirService.atualizarPorId(id, reproducao);

        return ResponseEntity.ok().body(reproducaoAtualizada);
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Reproduzir> deletar(@PathVariable Long id){

        Reproduzir reproducaoDeletada = reproduzirService.deletar(id);

        return ResponseEntity.ok().body(reproducaoDeletada);

    }

}
