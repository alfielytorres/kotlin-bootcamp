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
    println("DATA CLASS=============================")
    var container = SpiceContainer(yellowCurry)
    var (spice) = container
    print(spice.name)

}

data class SpiceContainer(var Spice:Spice){
    var label=Spice.name
}