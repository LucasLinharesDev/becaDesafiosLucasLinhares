package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.dtos.requestDTO.OuvinteRequest;
import br.com.desafiosBecaLucasLinhares.dtos.responseDTO.OuvinteResponse;
import br.com.desafiosBecaLucasLinhares.models.Ouvinte;
import br.com.desafiosBecaLucasLinhares.services.OuvinteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("ouvinte")
public class OuvinteController {

    @Autowired
    OuvinteService ouvinteService;

    @PostMapping("criar")
    public ResponseEntity<OuvinteResponse> criar(@RequestBody @Valid OuvinteRequest ouvinteRequest){

        return ResponseEntity.created(null).body(ouvinteService.criar(ouvinteRequest));

    }

    @GetMapping("obter/{id}")
    public ResponseEntity<OuvinteResponse> obterPorId(@PathVariable Long id){

        return ResponseEntity.ok().body(ouvinteService.obterPorId(id));

    }

    @GetMapping("obter/lista")
    public ResponseEntity<List<OuvinteResponse>> obterLista(){

        return ResponseEntity.ok().body(ouvinteService.obterLista());
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<Ouvinte> deletarPorId(@PathVariable Long id){

        ouvinteService.deletarPorId(id);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<OuvinteResponse> atualizarId(@PathVariable Long id, @RequestBody OuvinteRequest ouvinteRequest){

        ouvinteService.atualizarId(id, ouvinteRequest);

        return ResponseEntity.ok().build();

    }

}
