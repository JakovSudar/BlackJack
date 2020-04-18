class getDeckFactory {
    var deck = Deck()

    fun createDeck():Deck{
        deck.cards.add(Card(2,"2"))
        deck.cards.add(Card(3,"3"))
        deck.cards.add(Card(4,"4"))
        deck.cards.add(Card(5,"5"))
        deck.cards.add(Card(6,"6"))
        deck.cards.add(Card(7,"7"))
        deck.cards.add(Card(8,"8"))
        deck.cards.add(Card(9,"9"))
        deck.cards.add(Card(10,"10"))
        deck.cards.add(Card(11,"A"))
        deck.cards.add(Card(10,"J"))
        deck.cards.add(Card(10,"Q"))
        deck.cards.add(Card(10,"K"))

        return this.deck
    }
}