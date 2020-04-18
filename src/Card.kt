class Card {
    var value = 0
    var sign = "A"

    constructor(value: Int, sign: String ){
        this.value = value
        this.sign = sign
    }
    fun show(){
        println(this.sign)
    }
}