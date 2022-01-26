package br.com.desafiosBecaLucasLinhares.model;


public class Musica implements AcoesMusica{

    private Long id;
    private String nome;
    private int volume;
    private String artistaNome;
    private Long quantidadeDownloads=0L;
    private Long quantidadeCurtidas=0L;

    public Musica() {

    }

    public Musica(String nome, int volume, String artistaNome,
                  Long quantidadeDownloads, Long quantidadeCurtidas) {

        this.nome = nome;
        this.volume = volume;
        this.artistaNome = artistaNome;
        this.quantidadeDownloads = quantidadeDownloads;
        this.quantidadeCurtidas = quantidadeCurtidas;

    }

    // Métodos Acessores e Auxiliares

    public Long getId() {

        return id;

    }

    public void setId(Long id) {
        this.id = id;
    }

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

    //toString

    @Override
    public String toString() {

        return "Musica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", volume=" + volume +
                ", artistaNome='" + artistaNome + '\'' +
                ", quantidadeDownloads=" + quantidadeDownloads +
                ", quantidadeCurtidas=" + quantidadeCurtidas +
                '}';

    }

    public void adicionarEmQuantidadeDownloads() {

        setQuantidadeDownloads(getQuantidadeDownloads()+1L);

    }
}
