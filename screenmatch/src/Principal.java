public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(9);
        meuFilme.avaliar(8);
        meuFilme.avaliar(10);
        meuFilme.exibirFichaTecnica();
    }
}
