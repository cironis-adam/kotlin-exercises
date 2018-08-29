fun main(args: Array<String>) {

    // initializing variables
    val message : String = "thisisaverysecretmessagetosomeoneveryconfidential"
    println("Original text: $message")
    var secretMessage : String = ""
    var shift : Int = 25

    // loop through the message
    for (m in message) {
        var i = m.toInt()
        i += shift
        if (i > 'z'.toInt()) {
            i -= 26
        }
        val letter = i.toChar()
        secretMessage += letter
    }

    // write the secret message
    println("Secret text: $secretMessage")

}