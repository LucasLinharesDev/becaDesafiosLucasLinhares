package br.com.desafiosBecaLucasLinhares.services;

import br.com.desafiosBecaLucasLinhares.dtos.requestDTO.OuvinteRequest;
import br.com.desafiosBecaLucasLinhares.dtos.responseDTO.OuvinteResponse;
import br.com.desafiosBecaLucasLinhares.models.Ouvinte;
import br.com.desafiosBecaLucasLinhares.repositories.OuvinteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class OuvinteService {

    @Autowired
    OuvinteRepository ouvinteRepository;

    public OuvinteResponse criar(OuvinteRequest ouvinteRequest){

        Ouvinte ouvinteCOnvertido = new Ouvinte(ouvinteRequest);

        Ouvinte ouvinteRetornado = ouvinteRepository.save(ouvinteCOnvertido);

        return new OuvinteResponse(ouvinteRetornado);

    }

    public OuvinteResponse obterPorId( Long id){

        return new OuvinteResponse(ouvinteRepository.findById(id).get());

    }

    public List<OuvinteResponse> obterLista(){

        List<OuvinteResponse> lista = new ArrayList<>();

        ouvinteRepository.findAll().stream().forEach(
                ouvinte -> {
                    lista.add(new OuvinteResponse(ouvinte));
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

        Ouvinte ouvinteConvertido = new Ouvinte(ouvinte);
        ouvinteConvertido.setId(id);

        return new OuvinteResponse(ouvinteRepository.findById(id)
                .map(objOuvinte -> ouvinteRepository.save(ouvinteConvertido))
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

}
