package exercise07

/**
 * This method will generate string by looping over the alphabet (from 'A' to 'Z') and based on
 * lettersAmount input argument it will generate as many characters.
 * @lettersAmount - amount of letters to append by character (as nullable type)
 *
 * Check whether lettersAmount input is not null, by using let function.
 *
 * Next part is a little bit trickier:
 * You must loop over alphabet characters (from 'A' to 'Z') by using for loop.
 * In each cycle, amount of characters must be appended to StringBuilder. (amount is specified as non-null lettersAmount in let function)
 * In order to append lettersAmount of characters, extension function "multiply" for type Int has been created for you.
 * You must implement this method so it would return lettersAmount of character (character is given as input to extension function).
 */
fun getAlphabetCharactersNTimes(lettersAmount: Int?): String? {
    return ""
}

private fun Int.multiply(letter: Char): String {
    return ""
}