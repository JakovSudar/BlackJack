fun main() {
    var deck = getDeckFactory().createDeck()

    var player = Player(deck)
    var dealer = Dealer(deck)
    var play = true
    while(play){
        player.hit()
        player.hit()
        player.showScore()
        if(player.score == 21){
            println("BlackJack!")
        }
        dealer.hit()
        var playerChoice = ""
        while(true){
            println("Hit or stand? [h/s]")
            playerChoice= readLine().toString()

            if(playerChoice=="s") break

            player.hit()
            player.showScore()
            if(player.score>21){
                println("Busted!")
                break
            }
        }
        if(player.score<22){
            println("Dealers turn.")
            dealer.play()
            if(dealer.score>21){
                println("Player wins!")
            }else if(player.score == dealer.score){
                println("Tied!")
            }
            else if(player.score > dealer.score){
                println("Player wins!")
            }else println("Dealer wins")
        }else
            println("Dealer wins")
        player.resetScore()
        dealer.resetScore()

        println("One more game? [y/n]")
        if(readLine().toString() == "n") play = false
    }

}