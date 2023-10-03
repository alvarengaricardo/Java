# Anotações Java 1ZO-808

### Comentários

~~~ Java
// comentário em uma única linha (single-line)

/*
*comentário em múltiplas linhas (multi-line)
*/

/** 
* comentário javadoc
* @autor Ricardo
*/
~~~

### Classes x Arquivos

* O arquivo *.java* deve ter o mesmo nome da classe que ele contém se essa for *public*.
* Pode haver mais de uma classe em um arquivo, mas o nome do arquivo deve corresponder ao nome da classe marcada como *public*.
* Classe: Bloco de construção básico (template).
* Objeto: Instância de uma classe em tempo de execução.
* Classes possuem atributos e métodos.

### Método *main()*

* Ponto inicial de execução de um programa.

~~~ Java

public class Zoologico{
    public static void main(String[] args){
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}

$ java Zoologico macaco girafa

//-----
// A ordem de public e static não interfere na execução de main().
// Podendo ser:
public static void main(String[] args){
static public void main(String[] args){
~~~

##### varargs

Somente o último parâmetro de um método em Java pode ser do tipo *varargs*.

Um parâmetro *vararg* pode receber 0, muitos ou um array de parâmetros. Aliás, é por essa característica que o parâmetro *vararg* deve ser o último parâmetro do método.

Para declarar um *vararg* nós colocamos três pontos no tipo do parâmetro. Por *exemplo: void metodo1(int a, String... b)*. Neste exemplo o parâmetro *b* é o parâmetro *vararg* do método.

Vejamos no exemplo abaixo todas as formas de utilizar o parâmetro do tipo *vararg*.

~~~ Java

public class Varargs {

    public static void main(String[] args) {

        //Sem o 3º parâmetro (Vararg...)
        metodoComVarargs("a1", true);

        //Com o 3º parâmetro do tipo int
        metodoComVarargs("a2", false, 1);

        //Com o 3º parâmetro do tipo int[] (array de int)
        metodoComVarargs("a3", true, new int[]{1, 2, 3});

        //Com vários parâmetros int a partir do 3º parâmetro (Vararg...)
        metodoComVarargs("a4", true, 1, 2, 3, 4, 5);
    }

    static void metodoComVarargs(String a, boolean b, int... c) {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c.length);
        for (int d : c)
            System.out.println(d);
        System.out.println();
    }
}
~~~
### Declaração e import de pacotes
import - import pacotes da linguagens ou criados pelo dev
package - define o pacote

~~~ Java
import java.util.Random;
import java.util.*;
~~~

#### imports redundantes
~~~ Java
import java.lang 
~~~

#### WildCards
~~~ Java
// NO GOOD - A wildcard only matches
// class names, not "file.*Files"
import java.nio.*;
// NO GOOD - You can only hava one wildcard
// and it must be at the end
import java.nio.*.*;
// NO GOOD - You cannot import methods, only class names
import java.nio.files.Paths.*;
~~~

#### Conflitos de Nome
Podem ocorrer conflitos de nomes entre classes, por exemplo:
* Classe Date existe no pacote java.util e java.sql. É necessário definir no import.
~~~ Java
import java.util.*;
import java.sql.*;
public class Conflitos{
	Date.data;
}
// existe ai uma ambiguidade - erro de compilação
// no caso abaixo ocorre um warning:
import java.util.Date;
import java.sql.*;

// abaixo ocorre erro de compilação:
import java.util.Date;
import java.sql.Date;

// Solução: Definir explicitamente:
import java.util.Date;
import java.sql.Date;
public class Conflitos{
	java.util.Date.data;
}
~~~
#### Criando novos pacotes
~~~ Java
package pacotea; // o pacote é uma pasta do SO
                 // c:\temp\pacotea\ClasseA.java
public class ClasseA {
}
-----------
package pacoteb; //c:\temp\pacoteb\ClasseB.java
import pacotea.ClasseA;
public class ClasseB{
	public static void main(String [] args){
	}
}
~~~
#### Compilando Pacotes Diferentes
~~~ DOS
javac packagea/ClasseA.java packageb/ClasseB.java
java packageb.ClasseB
~~~
