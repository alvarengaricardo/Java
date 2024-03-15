package a200180.escopo;

class Pessoa {
    static int id = 1;
}

class Teste2 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.id); // acessando pelo objeto. id = 1
        System.out.println(Pessoa.id); // acessando direto pela classe. id = 1
        p.id ++; // soma 1
        System.out.println(Pessoa.id); // id = 2
        p.id ++;
        Pessoa pp = new Pessoa(); 
        p.id ++;
        System.out.println(pp.id); // id = 4
        System.out.println(Pessoa.id); // id = 4
    }
}