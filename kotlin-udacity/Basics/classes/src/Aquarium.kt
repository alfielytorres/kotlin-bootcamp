


class Aquarium(var height:Int=5,var width:Int=5,var depth:Int=5){
    var numberOfFish: Int = 0

    var volume:Int
        get() = height*depth*width
        set(value){ height = value/(width*depth) }

    constructor( numberOfFish: Int): this(){
        this.numberOfFish = numberOfFish
    }
}