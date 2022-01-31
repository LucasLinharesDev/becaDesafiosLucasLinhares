package br.com.desafiosBecaLucasLinhares.services;

import br.com.desafiosBecaLucasLinhares.models.Curtir;
import br.com.desafiosBecaLucasLinhares.models.Musica;
import br.com.desafiosBecaLucasLinhares.repositories.CurtirRepository;
import br.com.desafiosBecaLucasLinhares.repositories.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CurtirService {

    @Autowired
    CurtirRepository curtirRepository;

    public Curtir adicionarCurtida(Curtir curtida){

        return curtirRepository.save(curtida);

    }


    public Curtir obterPorId( Long id){

        return curtirRepository.findById(id).get();
    }

    public List<Curtir> listaDeCurtidas(){

       return curtirRepository.findAll();
    }

    public void deletar(Long id){

       curtirRepository.deleteById(id);
    }

    public Curtir atualizarPorId( Long id, Curtir curtida){

        curtida.setIdPrincipal(id);

        return curtirRepository.save(curtida);

    }

}