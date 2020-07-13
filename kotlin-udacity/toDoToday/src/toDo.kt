enum class moods {
    SAD, HAPPY
}

fun getDefaultTemperature() = 24

fun getDefaultWeather() = "sunny"

fun whatShouldIDoToday(mood:moods,weather:String=getDefaultWeather(),temperature:Int=getDefaultTemperature()){
    when{
        isHappy(mood) && isSunny(weather) && isHot(temperature)-> println("go for a walk")
        else -> println("Stay home and read.")
    }
}
fun isHot(temperature: Int) = temperature >20
fun isHappy(mood: moods) = mood==moods.HAPPY

fun isSunny(weather: String) = weather.toLowerCase().equals("sunny")

fun main() {
    println("Enter Mood (Happy/Sad): ")
    var mood:String? = readLine()?.toLowerCase()

    if(mood.equals("sad")){
        whatShouldIDoToday(moods.SAD)
    }else{
        whatShouldIDoToday(moods.HAPPY)
    }
}

