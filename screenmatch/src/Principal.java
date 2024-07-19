import br.com.alvarenga.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alvarenga.screenmatch.calculos.FiltroRecomendacao;
import br.com.alvarenga.screenmatch.modelos.Episodio;
import br.com.alvarenga.screenmatch.modelos.Filme;
import br.com.alvarenga.screenmatch.modelos.Serie;

import java.util.ArrayList;

// https://unibb.alura.com.br/course/java-listas-colecoes-dados/task/126225

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Filme");
        meuFilme2.setAnoDeLancamento(2023);
        meuFilme2.setDuracaoEmMinutos(120);

        var meuFilme3 = new Filme(); // por inferência
        meuFilme3.setNome("Trilogia");
        meuFilme3.setAnoDeLancamento(2011);
        meuFilme3.setDuracaoEmMinutos(135);

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(10);
        meuFilme.avaliar(10);
        meuFilme.avaliar(8);
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

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.incluir(meuFilme);
        calculadoraDeTempo.incluir(meuFilme2);
        calculadoraDeTempo.incluir(meuFilme3);
        //System.out.println("Para assistir os filmes: " + calculadoraDeTempo.getTempoTotal() + " minutos.");

        calculadoraDeTempo.incluir(mandalorian);
        //calculadoraDeTempo.incluir(meuFilme2);
        System.out.println("Para assistir: " + calculadoraDeTempo.getTempoTotal()/60 + " horas.");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNome("Piloto");
        episodio.setSerie(mandalorian);
        episodio.setTotalVisualizacoes(732);
        filtro.filtrar(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(meuFilme3);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Elemento 0: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.get(0).toString());


    }
}
