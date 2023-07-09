import br.com.alvarenga.screenmatch.modelos.Filme;

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
    }
}
