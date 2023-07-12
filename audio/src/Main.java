import br.com.alvarenga.audio.modelos.Audio;

public class Main {
    public static void main(String[] args) {

        Audio audio = new Audio();

        audio.setTitulo("Teste");
        audio.setDuracao(3);
        audio.setTotalReproducoes(1);
        audio.setCurtidas(2);
        audio.setClassificacao("***");
        audio.exibirFicha();
        
    }
}