//generics in and out
//required to say out
class Talker<out T: Animal>(val animal:T){ // has to be val
    fun getAnimal():String{
        return animal.name
    }
}

//using the generic
fun talkToAnimal(animal: Talker<Animal>){
    println("Talking to ${animal.getAnimal()}")
}



fun main() {

    var dogPack = Talker(Dog("Ellie"))
    talkToAnimal(dogPack)

    var catPack = Talker(Dog("Tim"))
    talkToAnimal(catPack)

}


//inheritance
open class Animal(var name: String){
    fun feed(){
        println("feeding ${name}")
    }

    fun walk(){
        println("${name} is walking")
    }
}

class Cat(name:String): Animal(name), Mammal by Feline {

}

class Dog(name:String): Animal(name), Mammal by Canine {
}

//interface delagation
interface Mammal{
    fun talk()
}

object Feline: Mammal{
    override fun talk() {
        println("meow")
    }
}

object Canine: Mammal{
    override fun talk() {
        println("Bark")
    }
}