package a200180.escopo;

/*
Local Variables: Local variables are declared inside of methods and used locally in code.

Method Parameters: Method parameters are the variables thar are passed to the method from
calling segment of code. They are passed as arguments to the method.

Instance Variables: Instance variables are declared in the class. They are called instance
variables because they are created and remain in memory for as long as the instance of the
class exists. Instance variables store the state of the object. They are not within the
scope of any particular method; Instead, they are in scope for the entire class. They
exist and retain their value from the time a class is initialized until that class is
either reinitialized or no longer referenced.

 */


class Teste {
    String nome = "Luna"; // variável existe dentro da classe. É uma variável de instância
    static int id = 1;  // Variáveis static podem ser acessadas através de qualquer escopo
    /*
    Variável static: variável que pertence à própria classe e não a qualquer instância específica da classe.
    Isso significa que existe apenas uma cópia da variável na memória, independentemente de quantas
    instâncias da classe forem criadas.
     */

    static void metodo() {
        System.out.println(id);
    }

    public void m1() {
        int x = 10;
        for (int i = 0, j = 0; i <= 10; i++) j++; // atenção, essa é a forma reduzida do for, o escopo de j está
        // somente na linha do for
        if (x >= 10) {
            int y = 50; // variável local ao bloco
            System.out.println(y);
        }
        System.out.println(x);
    }

    public void m2(String nome) {
        // o parâmetro só existe dentro do método
        System.out.println(nome);
    }




    public static void main(String[] args) {
        Teste t = new Teste();
        t.m1();
        t.m2("Ricardo");
        System.out.println(t.nome);
        t.nome = "Lexxi";
        System.out.println(t.nome);
        System.out.println(t.id);       // variável static pela referência da instância
        System.out.println(Teste.id);   // variável static pela referência da Classe

        // acessando variável static utilizando método static
        System.out.println("***");
        Teste.metodo();
        t.metodo();
        Teste.metodo();

    }
}