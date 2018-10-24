package exercise5

import org.junit.jupiter.api.Test
import kotlin.test.asserter

class GreetingsTest {

    @Test
    fun sayHello() {

        val helloInLanguages = listOf(
            exercise5.greet(Positions.BOSS) == Positions.BOSS.hello,
            exercise5.greet(Positions.COWORKER) == Positions.COWORKER.hello,
            exercise5.greet(Positions.CLIENT) == "${Positions.CLIENT.hello} $EVERYTHING_IS_FINE"
        )

        println(helloInLanguages)
        val wrongGreetings = helloInLanguages.filter { isGreetingCorrect -> !isGreetingCorrect }

        asserter.assertTrue("Greet every person properly by their position!", wrongGreetings.isEmpty())
    }
}