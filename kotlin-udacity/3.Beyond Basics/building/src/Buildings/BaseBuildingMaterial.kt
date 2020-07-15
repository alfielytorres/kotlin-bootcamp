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

class Building<T: BaseBuildingMaterial>(val baseMaterials:T){

    val baseMaterialsNeeded=100
    var actualMaterialsNeeded = baseMaterials.numberNeeded*baseMaterialsNeeded

    fun build(){
            println(" ${actualMaterialsNeeded} ${baseMaterials::class.simpleName} required")
    }
}

fun main(){
    var Eureka = Building(Brick())
    Eureka.build()
}