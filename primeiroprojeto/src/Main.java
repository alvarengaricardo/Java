public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // comentário
        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println(media);
        String sinopse;

        /*

        outro tipo de comentário

         */

        sinopse = """
                Filme: Top Gun Maverick
                Filme de aventura com galã dos anos 80.
                """;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int)(media / 2);
        System.out.println("Estrelas: " + classificacao);

        int x = 10;
        double y = x; // casting implícito
        System.out.println("y:" + y);

        double k = 10.5;
        int j = (int) k; // casting explícito
        System.out.println("j: " + j);

    }
}