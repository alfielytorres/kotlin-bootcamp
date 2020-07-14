fun main() {

//    var allBooks = mutableSetOf("Book 1", "Book 2", "Book 3", "Book 4")
//    var library = mutableMapOf<String, String>("Book 1" to "Alfie")
//
//    println(library.any{it.key.contains("Book 2")})
//
//    println(library.getOrPut("Book 2"){"Killaz"})
//    println(library)
//
//
    var book = Book("Love of My Life","Alfie",2020)
    println(book.printUrl())

    println(book.canBorrow(20))
}

