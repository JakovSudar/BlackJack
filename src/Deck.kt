import java.util.concurrent.ThreadLocalRandom

class Deck {
    var cards = mutableListOf<Card>()

    fun drawCard():Card{
        val randomCard = ThreadLocalRandom.current().nextInt(0,cards.size )
        return cards[randomCard]
    }
}