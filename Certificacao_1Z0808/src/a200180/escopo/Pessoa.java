package a200180.escopo;

class Pessoa {
    static int id = 1;
}

class Teste2 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.id); // acessando pelo objeto
        System.out.println(Pessoa.id); // acessando direto pela
        p.id ++;
        System.out.println(Pessoa.id); // acessando direto pela
        // classe
    }
}