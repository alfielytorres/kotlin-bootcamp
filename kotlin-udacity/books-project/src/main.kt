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
    val puppy = Puppy()
    val book = Book("Oliver Twist", "Charles Dickens", 1837, 540)

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
    println("Sad puppy, no more pages in ${book.title}. ")
}

