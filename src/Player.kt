class Player (val deck: Deck) {
    var score = 0

    fun hit(){
        val card = deck.drawCard()
        //Ako busta sa A onda uzmi za A da je 1
        if(card.value == 11){
            if(score>10){
                score+=1
            }
            else{
                score+=11
            }
        }else{
            score+=card.value
        }
        println("You drew: "+card.sign)
    }

    fun showScore(){
        println("Player score: "+ this.score)
    }
    fun resetScore(){
        this.score=0
    }
}