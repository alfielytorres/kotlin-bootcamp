import java.util.*

// TEST CASE - nullability (Test Works)
// incrementFish(null)
fun incrementFish(value: Int? ){
    println(value?.inc()?:0) // elvis operating increments if value is not null
}

// TEST CASE
// println(getRandomNumber())
fun getRandomNumber(): Int {
    return Random().nextInt(10)+1 // prints a number from 1 to 10 inclusive
}

// TEST CASE - iterating through a list (Test Works)
//  var pets: List<String?> = mutableListOf("Tim","Tom","Sunny","Desmond")
//  pets = mutableListOf("farts") // this would change the list
//  printList(pets)
fun printList(list: List<String?>){
    for((index,element) in list.withIndex()){
        var position = index+1
        println("$position Pet - $element") // template strings
    }
}

fun getUserInput(){
    println("Who is your love?")
    var love: String = readLine() ?: "No one"
    println(love)
}
fun main() {
    getUserInput()
}