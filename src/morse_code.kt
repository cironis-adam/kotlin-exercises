fun main(args: Array<String>) {

    // initializing variables
    val alphabet : String = "abcdefghijklmnopqrstuvwxyz"
    val morseSymbols : Array<String> = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

    var message : String = " ..   ..-.  ---  .-.  --.  ---  -   -  ---   -...  ..-  -.--   .-   -.-.  ---  ..-.  ..-.  .  . "
    var decodedMessage : String = ""

    // break message into morse code symbols
    val symbols = message.split(" ")

    // loop through the message
    for (symbol in symbols) {
        val index = morseSymbols.indexOf(symbol)

        // check if symbol found
        if (index != -1) {
            decodedMessage += alphabet[index]
        }
    }

    println("Message: $message")
    println("Decoded message: $decodedMessage")

}