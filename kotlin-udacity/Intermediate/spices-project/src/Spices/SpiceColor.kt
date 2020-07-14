package Spices

interface SpiceColor {
    val color:String
}

object YellowSpiceColor:SpiceColor{
    override val color: String
        get() ="Yellow"

}

object WhiteSpiceColor:SpiceColor{
    override val color: String
        get() ="White"

}
object RedSpiceColor:SpiceColor{
    override val color: String
        get() ="Red"

}