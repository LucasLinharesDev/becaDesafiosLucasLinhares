package br.com.desafiosBecaLucasLinhares.services;

import br.com.desafiosBecaLucasLinhares.models.Musica;
import br.com.desafiosBecaLucasLinhares.repositories.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MusicaService {

    @Autowired
    MusicaRepository musicaRepository;

    public Musica criar(Musica musica){

        if(musica.getVolume() == 0)
            musica.mudarVolume(50);

       return musicaRepository.save(musica);
    }

    public Musica obterPorId(Long id){

        return musicaRepository.findById(id).get();
    }

    public List<Musica> obterLista(){

        return musicaRepository.findAll();

    }

    public Musica atualizar(Long id, Musica musica){

       return musicaRepository.findById(id)
               .map(obj -> musicaRepository.save(obj))
               .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void deletar(Long id){

        if (!musicaRepository.existsById(id))
            new ResponseStatusException(HttpStatus.NOT_FOUND);

        musicaRepository.deleteById(id);
    }


}
