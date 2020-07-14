fun main() {

    var myHerbs = mutableListOf(Spice("Pepper",3),
        Spice("Parsley",0),
        Spice("Paprika",8),
        Spice("Lemon Grass",1)
    )

    var salt = makeSalt()
    myHerbs.add(salt)

    for(element in myHerbs){
        println("${element.name} ${element.heat} ${element.spiceness}")
    }

    println("FILTERED HERBS ")
    var filteredHerbs = myHerbs.filter{it.heat<4}
    for(element in filteredHerbs){
        println("${element.name} ${element.heat} ${element.spiceness}")
    }

}