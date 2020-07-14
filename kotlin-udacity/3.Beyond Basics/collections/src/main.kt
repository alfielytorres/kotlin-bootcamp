fun main() {


}


fun reverseList(list: List<Int>): List<Int>{
    var reversedList = mutableListOf<Int>()
    for(i in 0..list.size-1){
        reversedList.add(list[list.size-1-i])
    }
    return  reversedList
}

fun getFood(){
    var food= mutableMapOf<Int,String>(1 to "Carrot", 2 to "Potato", 3 to "Beef")
//    print(food.getOrDefault(5,"Not In The List"))
    food.getOrElse(4){
        food.put(4, "Chicken")
    }
    print(food)
}