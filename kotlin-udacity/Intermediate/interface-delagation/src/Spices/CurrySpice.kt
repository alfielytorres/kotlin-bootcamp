package Spices

class CurrySpice(name: String, color:SpiceColor) : Spice(name),  SpiceColor by color{

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("grinding ${name} into powder")
    }
}