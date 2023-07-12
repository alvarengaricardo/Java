package br.com.alvarenga.audio.modelos;

public class Musica extends Audio {
    private String artista;
    private String album;
    private int anoLancamento;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public void exibirFicha(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Genero: " + genero);
        System.out.println("Total de reproduções: " + totalReproducoes);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Classificação: " + classificacao);

    }
}

