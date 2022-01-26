package br.com.desafiosBecaLucasLinhares.Services;

import br.com.desafiosBecaLucasLinhares.Models.Curtir;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CurtirService {


    public Curtir adicionarCurtida(Curtir curtida){

        curtida.musica.setQuantidadeCurtidas(curtida.musica.getQuantidadeCurtidas() + 1L);

        return curtida;
    }


    public Curtir obterPorId( Long id){

        Curtir curtida1 = new Curtir();
        curtida1.setId(id);

        return curtida1;
    }

    public List<Curtir> listaDeCurtidas(){

        List<Curtir> listaDeCurtidas1 = new ArrayList<>();

        return listaDeCurtidas1;
    }


    public Curtir atualizarPorId( Long id, Curtir curtida){

       curtida.setId(id);

        return curtida;
    }


    public Curtir deletar(Long id){

        Curtir curtidaDeletada = new Curtir();
        curtidaDeletada.setId(id);

        return curtidaDeletada;
    }


}
