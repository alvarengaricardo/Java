// Embaralhando e distribuindo cartas

package br.com.deitel.cap07.SimplePoker;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // coloca as Cards em ordem aleatória

        // imprime todas as cartas na ordem de distribução

        for (int i = 1; i <= 52; i++) {
            // distribui e exibe
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) // gera uma nova linha após cada quarta carta
                System.out.println();
        }
    }
}
