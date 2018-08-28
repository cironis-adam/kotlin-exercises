fun main(args: Array<String>) {

    var maybeNumber : Int? = 15
    maybeNumber?.let {
        println(it)
    }

    var maybeText : String? = "Hello world."
    println(maybeText?.length ?: 0)

    val simpsons : Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Maggie")
    simpsons.sort()
    simpsons.reverse()
    for (simpson in simpsons) {
        println(simpson)
    }

}
