package exercise07

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import kotlin.test.asserter

internal class AlphabetTest {

    @Nested
    @DisplayName("Tests for the function 'getAlphabetCharactersNTimes'")
    inner class GetAlphabetCharactersNTimes {

        @Test
        fun `Is alphabet characters (from 'A' to 'Z') correctly multiplied by given letters amount parameter`() {

            val lettersAmount = 3
            val alphabetCharacters3Times = "AAABBBCCCDDDEEEFFFGGGHHHIIIJJJKKKLLLMMMNNNOOOPPPQQQRRRSSSTTTUUUVVVWWWXXXYYYZZZ"

            asserter.assertEquals("Each character in alphabet characters (from 'A' to 'Z') must be multiplied as many times: $lettersAmount and appended.", getAlphabetCharactersNTimes(lettersAmount), alphabetCharacters3Times)
        }

        @Test
        fun `Is null returned when given lettersAmount parameter is null`() {

            asserter.assertEquals("Null must be returned when letters amount argument for function is null..", getAlphabetCharactersNTimes(null), null)
        }
    }
}