const val MAX_NUMBER_BOOKS =20

class Book(var title:String, var author:String, var year:Int){
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