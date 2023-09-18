package br.com.deitel.cap07.SimplePoker;

import java.security.SecureRandom;

public class DeckOfCards {
    private static final int NUMBER_OF_CARDS = 52; // número fixo de cards
    private static final SecureRandom randomNumbers = new SecureRandom();
    private Card[] deck; // array de objetos Card
    private int currentCard; // índice da próxima carta a ser distribuída (0-51)

    // construtor que monta o baralho de cartas
    public DeckOfCards() {
        String[] faces = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Rainha", "Rei"};
        String[] suits = {"Copas", "Ouros", "Espada", "Paus"};

        deck = new Card[NUMBER_OF_CARDS]; // cria o Array de objetos Card
        currentCard = 0;

        // preenche o baralho
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    // embaralha as cartas
    public void shuffle() {
        // a próxima chamada para o método dealCard deve começar no deck[0]
        currentCard = 0;

        // para cada Card, seleciona outra Card aleatória (0-51) e as compara
        for (int first = 0; first < deck.length; first++) {
            //seleciona número aleatório entre 0 e 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    // distribui uma Card
    public Card dealCard() {
        // determina se ainda há Cards a distribuir
        if (currentCard < deck.length)
            return deck[currentCard++]; // retorna o card atual no Array
        else
            return null; // nulo indica que todas as Cards foram distribuídas
    }
}
