package Spices

abstract class Spice(var name:String,var heat: Int=5): Grinder{
    var spiceness: String = ""
        get() = when(heat){
            in 0..3 ->"not spicy"
            in 4..7 ->"mild"
            in 8..10->"spicy"
            else -> "none"
        }


    abstract fun prepareSpice()

}

