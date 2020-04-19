class Game(var player:Player,var dealer:Dealer) {

    fun initialDeal():Boolean{
        player.hit()
        player.hit()
        player.showScore()
        if(player.score == 21){
            println("BlackJack!")
            println("Player wins!")
            return  false
        }else
        dealer.hit()
        return  true
    }

    fun playersTurn(){
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
    }
    fun dealersTurn(){
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
    }


}