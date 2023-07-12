import br.com.alvarenga.audio.modelos.Audio;
import br.com.alvarenga.audio.modelos.Musica;
import br.com.alvarenga.audio.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Audio audio = new Audio();
        audio.setTitulo("Teste");
        audio.reproduzir();
        audio.reproduzir();
        for (int i = 1; i<=12; i++){
            audio.curtir();
        }
        audio.avaliar();
        audio.exibirFicha();

        Musica musica = new Musica();
        musica.setTitulo("Aces High");
        musica.setArtista("Iron Maiden");
        musica.setAlbum("Powerslave");
        musica.setAnoLancamento(1984);
        musica.setGenero("Heavy Metal");
        for (int i = 1; i <=5342; i++){
            musica.reproduzir();
        }
        for (int i = 1; i <= 250; i++) {
            musica.curtir();
        }
        musica.avaliar();
        musica.exibirFicha();

        Podcast podcast = new Podcast();

        podcast.setTitulo("Monark Talks");
        podcast.setHost("Monark");
        podcast.setDescricao("Entrevista com Capitão do Bope.");
        for (int i = 1; i <=6579; i++){
            podcast.reproduzir();
        }
        for (int i = 1; i <= 789; i++) {
            podcast.curtir();
        }
        podcast.avaliar();
        podcast.exibirFicha();

    }
}