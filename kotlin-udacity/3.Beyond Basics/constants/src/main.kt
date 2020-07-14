


class stuff{
    companion object {
        const val constWord = 5 // good
    }
}

var CONSTANT = stuff.constWord

fun main() {
    print(CONSTANT)
}