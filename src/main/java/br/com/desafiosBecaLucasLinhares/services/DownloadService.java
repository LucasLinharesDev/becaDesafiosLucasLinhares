package br.com.desafiosBecaLucasLinhares.services;

import br.com.desafiosBecaLucasLinhares.models.Download;
import br.com.desafiosBecaLucasLinhares.repositories.DownloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class DownloadService {

    @Autowired
    DownloadRepository downloadRepository;

    public Download iniciarDownload(Download download){

        return downloadRepository.save(download);

    }

    public Download obterDownload(Long id){

    return downloadRepository.findById(id).get();

    }

    public List<Download> listaDeDownloads(){

    return downloadRepository.findAll();

    }

    public void deletarDownload( Long id){

        downloadRepository.deleteById(id);

    }

    public Download atualizarDownload(Long id, Download download){

       return downloadRepository.findById(id)
                .map(obj -> downloadRepository.save(obj))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

    }
}
