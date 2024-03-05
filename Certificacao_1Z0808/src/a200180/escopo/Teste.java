package a200180.escopo;

public class Teste {

    String nome = "Luna"; // variável existe dentro da classe

    //
    public void m1() {
        int x = 10;

        for (int i = 0, j = 0; i <= 10; i++) j++; // atenção, essa é a forma reduzida do for, o escopo de j está
        // somente na linha do for
        if (x >= 10) {
            int y = 50; // variável local ao bloco
            System.out.println(y);
        }
        System.out.println(x);
        System.out.println();

    }

    public void m2(String nome) {
        // o parâmetro só existe dentro do método
        System.out.println(nome);
    }

    public static void main(String[] args) {
        Teste t = new Teste();
        t.m1();
        t.m2("Ricardo");
    }
}
