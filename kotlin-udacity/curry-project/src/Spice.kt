class Spice(var name:String="curry",var heat: Int=5){

    var spiceness: String = ""
        get() = when(heat){
            in 0..3 ->"not spicy"
            in 4..7 ->"mild"
            in 8..10->"spicy"
            else -> "none"
        }


}

fun makeSalt() = Spice("Salt",0)
