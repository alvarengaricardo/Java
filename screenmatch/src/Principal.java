import br.com.alvarenga.screenmatch.modelos.Filme;
import br.com.alvarenga.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(9);
        meuFilme.avaliar(8);
        meuFilme.avaliar(10);
        meuFilme.exibirFichaTecnica();
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.calcularMedia());

        Serie mandalorian = new Serie();
        mandalorian.setNome("Mandalorian");
        mandalorian.setAnoDeLancamento(2019);
        mandalorian.setTemporadas(3);
        mandalorian.setEpisodiosPorTemporada(8);
        mandalorian.setMinutosPorEpisodio(40);
        mandalorian.setAtiva(true);
        mandalorian.setIncluidoNoPlano(true);
        mandalorian.exibirFichaTecnica();
        System.out.println("Horas para maratonar: " + mandalorian.getDuracaoEmMinutos()/60);
        mandalorian.exibirFichaTecnica();

    }
}
