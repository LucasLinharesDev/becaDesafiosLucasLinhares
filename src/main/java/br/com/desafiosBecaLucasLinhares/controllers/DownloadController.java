package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.Services.DownloadService;
import br.com.desafiosBecaLucasLinhares.model.Download;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("download")
public class DownloadController {


    DownloadService downloadService;

    @Autowired
    public DownloadController(DownloadService downloadService) {

        this.downloadService = downloadService;

    }

    @PostMapping("iniciar")
    public ResponseEntity<Download> iniciarDownload(@RequestBody Download download){

        Download downloadIniciado = downloadService.iniciarDownload(download);

        return ResponseEntity.created(null).body(downloadIniciado);
    }

    @GetMapping("obter/{id}")
    public ResponseEntity<Download> obterDownload(@PathVariable Long id){

        Download downloadObtidoPorId = downloadService.obterDownload(id);

        return ResponseEntity.ok().body(downloadObtidoPorId);
    }

    @GetMapping("obter/lista")
    public ResponseEntity<List<Download>> listaDeDownloads(){

        List<Download> listaObtida = downloadService.listaDeDownloads();

        return ResponseEntity.ok().body(listaObtida);

    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Download> atualizarDownload(@PathVariable Long id){

        Download downloadAtualizado = downloadService.atualizarDownload(id);

        return ResponseEntity.ok().body(downloadAtualizado);

    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Download> deletarDownload(@PathVariable Long id){

        Download downloadDeletado = downloadService.deletarDownload(id);
        return ResponseEntity.ok().body(downloadDeletado);

    }


}
