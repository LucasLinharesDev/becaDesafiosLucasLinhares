package br.com.desafiosBecaLucasLinhares.services;

import br.com.desafiosBecaLucasLinhares.models.Ouvinte;
import br.com.desafiosBecaLucasLinhares.repositories.OuvinteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class OuvinteService {

    @Autowired
    OuvinteRepository ouvinteRepository;

    public Ouvinte criar( Ouvinte ouvinte){

        return ouvinteRepository.save(ouvinte);

    }

    public Ouvinte obterPorId( Long id){

        return ouvinteRepository.findById(id).get();

    }

    public List<Ouvinte> obterLista(){

        return ouvinteRepository.findAll();


    }

    public void deletarPorId( Long id){

        ouvinteRepository.deleteById(id);
    }

    public Ouvinte atualizarId( Long id, Ouvinte ouvinte){
        ouvinte.setId(id);
        return ouvinteRepository.save(ouvinte);

    }

}
