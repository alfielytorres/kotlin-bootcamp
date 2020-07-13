fun main() {

    var myAquarium = Aquarium(10,20,40)
    var height = myAquarium.height
    println("Height $height")
    var volume = myAquarium.volume
    println("Volume $volume")

    myAquarium.volume=500000
    volume=myAquarium.volume
    height = myAquarium.height
    println("Volume Changed volume to $volume")
    println("Height $height")

    var fishAquarium = Aquarium( 200)
    println(fishAquarium.numberOfFish)
}