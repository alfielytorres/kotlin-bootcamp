fun main() {
    //Make mascas brain
    val mascasBrain = Brain(500)
    println(mascasBrain)

    //destructuring
    val (iq) = mascasBrain
    print(iq)
}

data class Brain(val iqLevel:Int){}