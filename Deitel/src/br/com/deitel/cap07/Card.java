package br.com.deitel.cap07;

// A classe representa uma carta de baralho
public class Card {
    private final String face;
    private final String suit; // naipe

    // construtor de dois argumentos inicializa face e naipe da carta
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    // retorna representação String de card
    public String toStrinf() {
        return face + " of " + suit;
    }
}