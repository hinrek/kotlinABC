fun getAlphabetCharactersNTimes(lettersAmount: Int?): String? {
    return lettersAmount?.let { amount ->
        buildString {
            for (letter in 'A'..'Z') {
                append(amount.multiply(letter))
            }
        }
    }
}

private fun Int.multiply(letter: Char): String {
    var string = ""
    for (i in 1..this) {
        string+=letter
    }
    return string
}