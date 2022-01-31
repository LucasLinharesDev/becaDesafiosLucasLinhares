package br.com.desafiosBecaLucasLinhares.services;

import br.com.desafiosBecaLucasLinhares.models.Reproduzir;
import br.com.desafiosBecaLucasLinhares.repositories.ReproduzirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReproduzirService {

    @Autowired
    ReproduzirRepository reproduzirRepository;

    public Reproduzir iniciarReproducao(Reproduzir reproducao){

        return reproduzirRepository.save(reproducao);

    }

    public Reproduzir obterPorId(Long id){

        return reproduzirRepository.findById(id).get();
    }

    public List<Reproduzir> obterLista(){

        return reproduzirRepository.findAll();

    }

    public void deletar( Long id){

        reproduzirRepository.deleteById(id);

    }

    public Reproduzir atualizarPorId( Long id, Reproduzir reproducao){

        reproducao.setId(id);

        return reproduzirRepository.save(reproducao);
    }

}
