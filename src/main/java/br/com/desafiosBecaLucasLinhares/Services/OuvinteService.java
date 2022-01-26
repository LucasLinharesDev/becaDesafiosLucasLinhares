package br.com.desafiosBecaLucasLinhares.Services;

import br.com.desafiosBecaLucasLinhares.model.Ouvinte;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OuvinteService {


    public Ouvinte criar( Ouvinte ouvinte){

        return ouvinte;

    }

    public Ouvinte deletarPorId( Long id){

        Ouvinte ouvinteDeletado = new Ouvinte();
        ouvinteDeletado.setId(id);

        return ouvinteDeletado;
    }

    public List<Ouvinte> obterLista(){

        List<Ouvinte> listadeOuvintes = new ArrayList<>();

        return listadeOuvintes;

    }

    public Ouvinte obterPorId( Long id){

        Ouvinte ouvinte1 = new Ouvinte();
        ouvinte1.setId(id);

        return ouvinte1;
    }

    public Ouvinte atualizarId( Long id, Ouvinte ouvinte){

        ouvinte.setId(id);

        return ouvinte;

    }

}
