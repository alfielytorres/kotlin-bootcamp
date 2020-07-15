class Fish(var name:String){
}
fun main() {
    val fish= Fish("timmy")
    println(fish.run { name})

    //apply HOCS
    println(fish.apply { name})
    fish.apply{name="ellie"}
    fish.apply{name="mascariñas"}

    myWith(fish.name){
        println(capitalize())
    }

    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    print(numbers.divisibleBy{
        it.rem(4)
    })
}

//My own HOCS
fun myWith( string:String, operation:String.()->Unit){
    string.operation()
}



fun List<Int>.divisibleBy(block:(Int)->Int):List<Int>{
    var myList = mutableListOf<Int>()
    for(i in this){
        if(block(i)==0){
            myList.add(i)
        }
    }
    return myList
}