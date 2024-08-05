
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


enum Suit {
    TREBOL('T'),
    DIAMANTES('D'),
    CORAZONES('C'),
    ESPADAS('E');

    private char simbolo;

    Suit(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getsimbolo() {
        return simbolo;
    }
}


class Card {
    private Suit suit;
    private String Valor;

    public Card(Suit suit, String Valor) {
        this.suit = suit;
        this.Valor = Valor;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getValor() {
        return Valor;
    }

    
    public int getValorNumero() {
        switch (Valor) {
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            case "A": return 14;
            default: return Integer.parseInt(Valor);
        }
    }

    @Override
    public String toString() {
        return Valor + suit.getsimbolo();
    }
}


class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        
        for (Suit suit : Suit.values()) {
            for (int i = 2; i <= 10; i++) {
                cards.add(new Card(suit, Integer.toString(i)));
            }
            cards.add(new Card(suit, "J"));
            cards.add(new Card(suit, "Q"));
            cards.add(new Card(suit, "K"));
            cards.add(new Card(suit, "A"));
        }
        
        Collections.shuffle(cards);
    }

    
    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("No hay más cartas en el mazo.");
        }
        return cards.remove(cards.size() - 1);
    }
}


public class CardGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Random rand = new Random();

        // Primer partida del juego
        Card cartaComputadora = deck.drawCard();
        
        Card cartaJugador = deck.drawCard();

        System.out.println("------------------------------------------------");
        System.out.println("Partida 1");
        System.out.println("------------------------------------------------");
        System.out.println("Carta de la computadora: " + cartaComputadora);
        System.out.println("Carta del jugador: " + cartaJugador);

        
        int valorComputadora = cartaComputadora.getValorNumero();
        int valorJugador = cartaJugador.getValorNumero();

        if (valorComputadora > valorJugador) {
            System.out.println("Gana computadora");
        } else if (valorJugador > valorComputadora) {
            System.out.println("Gana jugador");
        } else {
            System.out.println("Empate");
        }
        
        System.out.println("");

        // Segunda partida del juego
        Card cartaComputadora2 = deck.drawCard();
        
        Card cartaJugador2 = deck.drawCard();

        System.out.println("------------------------------------------------");
        System.out.println("Partida 2");
        System.out.println("------------------------------------------------");
        System.out.println("Carta de la computadora: " + cartaComputadora2);
        System.out.println("Carta del jugador: " + cartaJugador2);

        
        int valorComputadora2 = cartaComputadora2.getValorNumero();
        int valorJugador2 = cartaJugador2.getValorNumero();

        if (valorComputadora2 > valorJugador2) {
            System.out.println("Gana computadora");
        } else if (valorJugador2 > valorComputadora2) {
            System.out.println("Gana jugador");
        } else {
            System.out.println("Empate");
        }

    }
}
