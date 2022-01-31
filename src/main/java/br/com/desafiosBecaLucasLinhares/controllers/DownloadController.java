package br.com.desafiosBecaLucasLinhares.controllers;

import br.com.desafiosBecaLucasLinhares.services.DownloadService;
import br.com.desafiosBecaLucasLinhares.models.Download;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("download")
public class DownloadController {

    @Autowired
    DownloadService downloadService;

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

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Download> deletarDownload(@PathVariable Long id){

        downloadService.deletarDownload(id);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("atualizar/{id}")
    public ResponseEntity<Download> atualizarDownload(@PathVariable Long id, @RequestBody Download download){

        return ResponseEntity.ok().body(downloadService.atualizarDownload(id, download));

    }

}
