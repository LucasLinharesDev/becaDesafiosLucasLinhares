package br.com.desafiosBecaLucasLinhares.services;

import br.com.desafiosBecaLucasLinhares.dtos.requestDTO.MusicaRequest;
import br.com.desafiosBecaLucasLinhares.dtos.responseDTO.MusicaResponse;
import br.com.desafiosBecaLucasLinhares.models.Musica;
import br.com.desafiosBecaLucasLinhares.repositories.MusicaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicaService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    MusicaRepository musicaRepository;

    public MusicaResponse criar(MusicaRequest musicaRequest){

        Musica musicaConvertida = modelMapper.map(musicaRequest,Musica.class);
//        if(musicaRequest.getArtistaNome() == null | musicaRequest.getNome() == null)
//            throw new JsonInvalidoException("os campos 'nome' e 'artistaNome' são obrigatórios");

        if(musicaConvertida.getVolume() == 0)
            musicaConvertida.mudarVolume(50);

        return modelMapper.map(musicaRepository.save(musicaConvertida),MusicaResponse.class);
    }

    public MusicaResponse obterPorId(Long id){

        Musica musicaobtida = musicaRepository.findById(id).get();
        return modelMapper.map(musicaobtida, MusicaResponse.class);

    }

    public List<MusicaResponse> obterLista(){

        List<MusicaResponse> lista = new ArrayList<>();

        musicaRepository.findAll().stream().forEach(
                musica -> {
                    lista.add(modelMapper.map(musica, MusicaResponse.class));
                }
        );
        return lista;
    }

    public void deletar(Long id){

        musicaRepository.deleteById(id);

    }

    public MusicaResponse atualizar(Long id, MusicaRequest musica){

        Musica musicaConvertida = modelMapper.map(musica, Musica.class);
        musicaConvertida.setId(id);

        return modelMapper.map(musicaRepository.findById(id)
                .map(objMusica -> musicaRepository
                        .save(musicaConvertida))
                .orElseThrow()
                , MusicaResponse.class)
        ;
    }
}
