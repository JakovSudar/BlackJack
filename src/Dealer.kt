class Dealer (val deck:Deck){
    var score = 0

    fun play(){
        var flag = true
        while(flag){
            if(score <17){
                hit()
            }
            else if (score > 16 )
                flag = false

        }
        println("Dealer score: "+ this.score)
    }
    fun hit(){
        val card = deck.drawCard()
        if(card.value == 11){
            if(this.score>10){
                this.score+=1
            }
            else{
                this.score+=11
            }
        }else{
            this.score+=card.value
        }
        println("Dealer draws: "+card.sign)
    }
    fun resetScore(){
        this.score=0
    }
}