package br.com.desafiosBecaLucasLinhares.model;

public class Musica implements AcoesMusica{

    private Long id;
    private String nome;
    private int volume;
    private String artistaNome;
    private Long quantidadeDownloads;
    private Long quantidadeCurtidas;



    public Musica(String nome, int volume, String artistaNome,
                  Long quantidadeDownloads, Long quantidadeCurtidas) {

        setNome(nome);
        setVolume(volume);
        setArtistaNome(artistaNome);
        setQuantidadeDownloads(getQuantidadeDownloads()+quantidadeDownloads);
        setQuantidadeCurtidas(getQuantidadeCurtidas()+quantidadeCurtidas);

    }


    // Métodos Acessores e Auxiliares

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getVolume() {

        return volume;

    }

    public void setVolume(int volume) {

        this.volume = volume;

    }

    public String getArtistaNome() {

        return artistaNome;

    }

    public void setArtistaNome(String artistaNome) {

        this.artistaNome = artistaNome;

    }

    public Long getQuantidadeDownloads() {

        return quantidadeDownloads;

    }

    public void setQuantidadeDownloads(Long quantidadeDownloads) {

        this.quantidadeDownloads = quantidadeDownloads;

    }

    public Long getQuantidadeCurtidas() {

        return quantidadeCurtidas;

    }

    public void setQuantidadeCurtidas(Long quantidadeCurtidas) {

        this.quantidadeCurtidas = quantidadeCurtidas;

    }

    //Métodos da Interface

    @Override
    public void mudarVolume() {

    }
}
