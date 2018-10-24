package exercise05

import org.junit.jupiter.api.Test
import kotlin.test.asserter

class GreetingsTest {

    @Test
    fun sayHello() {

        val helloInLanguages = listOf(
            exercise05.greet(Positions.BOSS) == Positions.BOSS.hello,
            exercise05.greet(Positions.COWORKER) == Positions.COWORKER.hello,
            exercise05.greet(Positions.CLIENT) == "${Positions.CLIENT.hello} $EVERYTHING_IS_FINE"
        )

        println(helloInLanguages)
        val wrongGreetings = helloInLanguages.filter { isGreetingCorrect -> !isGreetingCorrect }

        asserter.assertTrue("Greet every person properly by their position!", wrongGreetings.isEmpty())
    }
}