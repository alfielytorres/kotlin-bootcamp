open class Book(var title:String, var author:String) {
    private var currentPage = 0
    open fun readPage(){
        currentPage++
    }
}