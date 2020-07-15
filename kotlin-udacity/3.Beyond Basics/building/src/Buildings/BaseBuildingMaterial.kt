package Buildings

open class BaseBuildingMaterial {
    open val numberNeeded=1
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded=4
}

class Brick: BaseBuildingMaterial() {
    override val numberNeeded=8
}

class Building<out T: BaseBuildingMaterial>(val buildingMaterials: T){

    val baseMaterialsNeeded=100
    var actualMaterialsNeeded = buildingMaterials.numberNeeded*baseMaterialsNeeded

    fun build(){
            println(" ${actualMaterialsNeeded} ${buildingMaterials::class.simpleName} required")
    }
}

annotation class author

@author class classAuthor{
    var name="Alfie Torres"
}

fun main(){
    var Eureka = Building(Brick())
    Eureka.build()
    println(classAuthor.)

}