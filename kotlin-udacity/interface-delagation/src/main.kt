import Spices.CurrySpice
import Spices.RedSpiceColor
import Spices.Spice
import Spices.YellowSpiceColor

fun main() {
    var yellowCurry = CurrySpice("Yellow Curry",YellowSpiceColor)
    yellowCurry.prepareSpice()
    println(yellowCurry.name)
    println(yellowCurry.color)
    println("NEXT SPICE=============================")
    var redCurry = CurrySpice("Red Curry",RedSpiceColor)
    redCurry.prepareSpice()
    println(redCurry.name)
    println(redCurry.color)

}