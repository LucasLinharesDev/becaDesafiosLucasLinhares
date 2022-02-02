package br.com.desafiosBecaLucasLinhares.services;

import br.com.desafiosBecaLucasLinhares.dtos.requestDTO.MusicaRequest;
import br.com.desafiosBecaLucasLinhares.dtos.responseDTO.MusicaResponse;
import br.com.desafiosBecaLucasLinhares.models.Musica;
import br.com.desafiosBecaLucasLinhares.repositories.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MusicaService {

    @Autowired
    MusicaRepository musicaRepository;

    public MusicaResponse criar(MusicaRequest musicaRequest){

        Musica musicaConvertida = musicaRequest.converter(musicaRequest);

        if(musicaConvertida.getVolume() == 0)
            musicaConvertida.mudarVolume(50);

        return new MusicaResponse(musicaRepository.save(musicaConvertida));
    }

    public MusicaResponse obterPorId(Long id){

        return new MusicaResponse(musicaRepository.findById(id).get());

    }

    public List<MusicaResponse> obterLista(){

        List<MusicaResponse> lista = new ArrayList<>();

        musicaRepository.findAll().stream().forEach(
                musica -> {
                    lista.add(new MusicaResponse(musica));
                }
        );
        return lista;
    }

    public MusicaResponse atualizar(Long id, MusicaRequest musica){

        Musica musicaConvertida = new Musica(musica);
        musicaConvertida.setId(id);

       return new MusicaResponse(musicaRepository.findById(id)
                .map(objMusica -> musicaRepository
                        .save(musicaConvertida))
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    public void deletar(Long id){

        if(!musicaRepository.existsById(id))
            musicaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        musicaRepository.deleteById(id);
    }


}
