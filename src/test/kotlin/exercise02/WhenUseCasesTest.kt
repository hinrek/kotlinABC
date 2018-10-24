package exercise02

import kotlin.test.Test
import kotlin.test.asserter

class WhenUseCasesTest {

    @Test
    fun `Test differentInputTypes String input`() {
        val stringInput = "This is a String"
        val expectedStringReturn = "String"

        asserter.assertEquals("$stringInput must return $expectedStringReturn", expectedStringReturn, getOutputBasedOnInputType(stringInput))
    }

    @Test
    fun `Test differentInputTypes Int input`() {
        val intInput = 1134
        val expectedIntReturn = 0

        asserter.assertEquals("$intInput must return $expectedIntReturn", expectedIntReturn, getOutputBasedOnInputType(intInput))
    }

    @Test
    fun `Test differentInputTypes Float input`() {
        val floatInput = 0.2323f
        val expectedFloatReturn = "else"

        asserter.assertEquals("$floatInput must return $expectedFloatReturn", expectedFloatReturn, getOutputBasedOnInputType(floatInput))
    }
}