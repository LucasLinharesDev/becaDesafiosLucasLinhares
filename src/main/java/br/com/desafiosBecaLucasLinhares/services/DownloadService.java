package br.com.desafiosBecaLucasLinhares.services;

import br.com.desafiosBecaLucasLinhares.models.Download;
import br.com.desafiosBecaLucasLinhares.repositories.DownloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        download.setId(id);

        return downloadRepository.save(download);
    }
}
