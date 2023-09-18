package br.com.deitel.cap07.SimplePoker;

public class Card {
    private final String face; // face
    private final String suit; // naipe

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String toString() {
        return face + " de " + suit;
    }
}
