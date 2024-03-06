/*

Fazem parte da estrutura de uma classe Java:
    - Informação referente ao pacote, 1 nome- opcional
    - Imports da classe, pode ter vários - opcional
    - classe
    - interfaces
    - Comentários

*/

package a200180.classe;

import java.util.Date;
import java.io.*;

class Pessoa {

    static int totalDePessoas = 0; // só existirá uma variável, independentemente da quantidade de classes instanciadas
                                   // isso acontece por ser uma variável tipo static

    /* Dentro de uma classe pode haver:
       - Variáveis de atributo / instância / objetos
       - construtores com variáveis de parâmetros
       - métodos e variáveis locais
    */
}

// não há conflito na classe abaixo
// compila, apesar de não ser o padrão Java (PEGADINHA)
class B {
    int B;
    B(){
        // construtor
        // construtor não retorna, tem o mesmo nome da classe
        // pode ter return vazio
    }
    void B(){  //método
    }
}

interface Figura {

}