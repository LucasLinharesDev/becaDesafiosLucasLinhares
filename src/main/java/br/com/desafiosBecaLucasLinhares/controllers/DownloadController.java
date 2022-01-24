package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.model.Download;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("download")
public class DownloadController {

    @PostMapping("iniciar")
    public ResponseEntity<Download> iniciarDownload(@RequestBody Download download){

        download.getMusica().adicionarEmQuantidadeDownloads();

        download.getOuvinte().adicionarEmListaDownloads(download.getMusica());

        return ResponseEntity.created(null).body(download);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Download> obterDownload(@PathVariable Long id){

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Download> atualizarDownload(@PathVariable Long id){

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Download> deletarDownload(@PathVariable Long id){

        return ResponseEntity.ok().build();

    }


}
