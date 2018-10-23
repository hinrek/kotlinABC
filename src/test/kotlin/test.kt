import kotlin.test.Test
import kotlin.test.asserter

class Test {

    @Test
    fun `Testing car`() {
        val myCar = Car(
                numberOfSeats = 4,
                numberOfWheels = 4,
                hasEngine = true,
                make = "Audi",
                model = "A5 Cabrio",
                motor = Motor(
                        horsePower = 300.45f,
                        oilLevel = 85
                )
        )

        println(myCar)
    }
}