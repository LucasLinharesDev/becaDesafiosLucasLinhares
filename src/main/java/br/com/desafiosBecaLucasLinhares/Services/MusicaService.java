package br.com.desafiosBecaLucasLinhares.Services;

import br.com.desafiosBecaLucasLinhares.model.Musica;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicaService {

    public Musica criar( Musica musica ){

        return musica;
    }

    public Musica obterMusica(Long id){

        Musica musica1 = new Musica();
        musica1.setId(id);

        return musica1;

    }

    public List<Musica> obterLista(){

        List<Musica> listaDeMusicas = new ArrayList<>();

        return listaDeMusicas;
    }

    public Musica atualizarId(Long id, Musica musica){

        musica.setId(id);
        return musica;

    }

    public Musica deletar(Long id){

        Musica musica1 = new Musica();
        musica1.setId(id);

        return musica1;
    }


}
