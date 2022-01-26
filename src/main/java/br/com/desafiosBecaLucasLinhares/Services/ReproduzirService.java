package br.com.desafiosBecaLucasLinhares.Services;

import br.com.desafiosBecaLucasLinhares.model.Reproduzir;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReproduzirService {


    public Reproduzir iniciarReproducao(Reproduzir reproducao){

        reproducao.getOuvinte().adicionarEmReproduzidas();

        return reproducao;
    }

    public Reproduzir obterPorId(Long id){

        Reproduzir reproducao1 = new Reproduzir();
        reproducao1.setId(id);

        return reproducao1;
    }

    public List<Reproduzir> obterLista(){

        List<Reproduzir> listaDeReproducao = new ArrayList<>();

        return listaDeReproducao;

    }

    public Reproduzir atualizarPorId( Long id, Reproduzir reproducao){

        reproducao.setId(id);

        return reproducao;
    }

    public Reproduzir deletar( Long id){

        Reproduzir reproducao1 = new Reproduzir();
        reproducao1.setId(id);

        return reproducao1;

    }

}
