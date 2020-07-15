fun main() {
    var myGame=Game()
    println(myGame.path)
    myGame.north()
    myGame.south()
    myGame.east()
    myGame.west()
    myGame.end()


}

enum class Directions {
    NORTH,EAST,SOUTH,WEST,START,END
}

class Game{
    var path = mutableListOf<Directions>(Directions.START)

    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}
    val end= { ->
        path.add(Directions.END)
        println("GAME OVER:$path")
        path.clear()
        print(path)
        false
    }

}