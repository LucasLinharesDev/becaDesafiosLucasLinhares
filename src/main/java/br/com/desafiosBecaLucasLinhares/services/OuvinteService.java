package br.com.desafiosBecaLucasLinhares.services;

import br.com.desafiosBecaLucasLinhares.dtos.requestDTO.OuvinteRequest;
import br.com.desafiosBecaLucasLinhares.dtos.responseDTO.OuvinteResponse;
import br.com.desafiosBecaLucasLinhares.models.Ouvinte;
import br.com.desafiosBecaLucasLinhares.repositories.OuvinteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class OuvinteService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    OuvinteRepository ouvinteRepository;

    public OuvinteResponse criar(OuvinteRequest ouvinteRequest){

        Ouvinte ouvinteRetornado = ouvinteRepository.save(modelMapper.map(ouvinteRequest, Ouvinte.class));

        return modelMapper.map(ouvinteRetornado, OuvinteResponse.class);

    }

    public OuvinteResponse obterPorId( Long id){

        return modelMapper.map(ouvinteRepository.findById(id).get(), OuvinteResponse.class);

    }

    public List<OuvinteResponse> obterLista(){

        List<OuvinteResponse> lista = new ArrayList<>();

        ouvinteRepository.findAll().stream().forEach(
                ouvinte -> {
                    lista.add(modelMapper.map(ouvinte, OuvinteResponse.class));
                }
        );
        return lista;


    }

    public void deletarPorId( Long id){

        if(!ouvinteRepository.existsById(id))
            ouvinteRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        ouvinteRepository.deleteById(id);
    }

    public OuvinteResponse atualizarId( Long id, OuvinteRequest ouvinte){

        Ouvinte ouvinteConvertido = modelMapper.map(ouvinte, Ouvinte.class);
        ouvinteConvertido.setId(id);

        return modelMapper.map(ouvinteRepository.findById(id)
                .map(objOuvinte -> ouvinteRepository.save(ouvinteConvertido))
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND)),OuvinteResponse.class);

    }

}
