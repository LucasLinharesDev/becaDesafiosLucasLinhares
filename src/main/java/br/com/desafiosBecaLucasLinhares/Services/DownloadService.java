package br.com.desafiosBecaLucasLinhares.Services;

import br.com.desafiosBecaLucasLinhares.Models.Download;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DownloadService {


    public Download iniciarDownload(Download download){

        download.getMusica().adicionarEmQuantidadeDownloads();

        download.getOuvinte().adicionarEmListaDownloads(download.getMusica());

        return download;
    }


    public Download obterDownload(Long id){

        Download download1 = new Download();
        download1.setId(id);

        return download1;

    }

    public List<Download> listaDeDownloads(){

    List<Download> listaDeDownloads = new ArrayList<>();

    return listaDeDownloads;
    }

    public Download atualizarDownload(Long id){

        Download download1 = new Download();

        download1.setId(id);

        return download1;

    }


    public Download deletarDownload( Long id){

        Download download1 = new Download();
        download1.setId(id);

        return download1;

    }


}
