package exercise01

import kotlin.test.Test
import kotlin.test.asserter

class Function01Test {

    @Test
    fun `Test if sayHello returns correct stuff`() {
        val name = "John Smith"
        val expected = "Hello John Smith"

        asserter.assertEquals("Did not return $expected", expected, sayHello(name))
    }
}