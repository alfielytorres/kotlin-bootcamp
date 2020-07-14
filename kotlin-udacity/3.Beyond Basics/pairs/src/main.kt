fun main() {

    var myBook = Book("Deathly Hallows","Alfie Torres", 2020)
    print(myBook.getBookTriple())
}

class Book(var title:String, var author:String, var year:Int){
    fun getBookTriple(): Triple<String, String, Int>{
        return Triple(title, author, year)
    }
}