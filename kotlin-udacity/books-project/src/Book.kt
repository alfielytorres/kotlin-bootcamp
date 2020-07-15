const val MAX_NUMBER_BOOKS =20


open class Book(var title:String, var author:String, var year:Int, var pages:Int){
    companion object{
        const val BASE_URL ="http://books.com/"
    }
    fun getBookTriple(): Triple<String, String, Int>{
        return Triple(title, author, year)
    }
    fun canBorrow(booksBorrowed:Int):Boolean{
        if(booksBorrowed<=MAX_NUMBER_BOOKS){
            return true
        }
        return false
    }

    fun printUrl():String{
        var url = BASE_URL+title.replace(" ","-").toLowerCase()+".html"
        return url
    }
}

fun Book.getWeight():Double {return pages*1.5}

fun Book.tornPages(torn: Int) = if (pages >= torn){
    pages -= torn
} else {
    pages = 0
}