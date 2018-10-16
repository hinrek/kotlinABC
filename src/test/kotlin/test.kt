import kotlin.test.Test
import kotlin.test.asserter

class Test {

    @Test
    fun `Testing hello world`() {
        val helloHinrek = printHelloName("Hinrek")

        val shouldReturn = "Hello Hinrek"

        asserter.assertEquals("Mingi lambi text", helloHinrek, shouldReturn)
    }
}