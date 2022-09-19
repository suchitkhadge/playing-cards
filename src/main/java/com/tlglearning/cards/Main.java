package com.tlglearning.cards;

import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Random;

public class Main {

  public static void main(String[] args) {

    //Create instance of Deck
    Deck deck = new Deck();
    System.out.println(deck);

    //Shuffle the deck
    Random rng = new SecureRandom();
    deck.shuffle(rng);
    System.out.println(deck);


  }


}
