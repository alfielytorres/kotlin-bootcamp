import java.util.*

fun main() {
    println(gamePlay(12, rollDice))
}

//2 - Game Play Example

val rollDice:(Int) -> Int = {sides:Int-> if(sides==0) 0 else (Random().nextInt(sides)+1)}

// HOC
fun gamePlay(sides:Int, operation:((Int) -> Int)):Int {
    return operation(sides)
}



//// 1 - cat example
//val cat="tim"
//
//val feedCat: (String) -> String = {cat:String -> "Full $cat" }
//
//fun getFedCat(cat:String):String{
//    return "Full $cat"
//}
//
//fun feedCat(cat: String, operation: ((String) -> String)):String{
//    return operation(cat)
//}

// 2- game play example


