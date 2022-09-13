

package com.tlglearning.cards.model;


public class Card {

  private final Rank rank;
  private final Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank rank(){
    return rank;
  }

  public Suit suit(){
    return suit;
  }

  @Override
  public String toString() {
    return rank.symbol()+ suit.symbol();
  }

  //TODO Override equals methods
  //TODO Override hashcode methods


}
