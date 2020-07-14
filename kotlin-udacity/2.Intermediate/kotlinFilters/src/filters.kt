fun filterPlants(){
    val plants = listOf<String>("Aloe", "Sunflower","Papyrus")
    println("Normal List\n$plants")

    //Eager loading
    val eagerPlants = plants.filter { it.contains('P') }
    println("Eager Loading\n$eagerPlants")

    //Lazy loading
    val lazyPlants = plants.asSequence().filter { it.contains('P') }
    println("Lazy Loading\n$lazyPlants")

    //lazy list to list again
    println("Converted List")
    println(lazyPlants.toList())
}

fun filterFood(){

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    //find the words that start with c and end with e
    val filteredSpices = spices.filter { it[0]=='c'&&it[it.length-1]=='e' }
    println(filteredSpices)

    //take first three elements and find the ones that start with c
    val threeElements = spices.take(3)
    val filteredThreeElements = threeElements.filter{it[0]=='c'}
    println(filteredThreeElements)
}

fun main(){
    filterFood()
}
