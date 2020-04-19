fun main() {
    var deck = getDeckFactory().createDeck()

    var player = Player(deck)
    var dealer = Dealer(deck)

    var game = Game(player,dealer)
    var play = true
    while(play){
        //checks for blackjack
        if(game.initialDeal()){
            game.playersTurn()
            game.dealersTurn()
        }
        player.resetScore()
        dealer.resetScore()

        println("One more game? [y/n]")
        if(readLine().toString() == "n") play = false
    }

}