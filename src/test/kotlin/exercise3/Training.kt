package exercise3

import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException
import kotlin.reflect.full.primaryConstructor
import kotlin.test.asserter

class Training() {

    @Test
    fun `Is Training class (implemented in Kotlin) toString() method equal to Training class (implemented in Java) toString() method`() {

        val subject = "Kotlin ABC"
        val participantsAmount = 18
        val courseConductors = listOf("Carl Custav Mäeorg", "Hinrek Saar")

        val trainingAsJavaClass = Training_Java(subject, participantsAmount, courseConductors)

        val trainingAsKotlinDataClass = try {
            Training_Kotlin::class.primaryConstructor?.call(subject, participantsAmount, courseConductors) as Training_Kotlin
        }
        catch (exception: IllegalArgumentException) {
            asserter.fail(
                    "Class has not been provided with correct fields yet - " +
                    "argument types are ${subject::class.simpleName}, ${participantsAmount::class.simpleName} and ${courseConductors::class.simpleName}."
            )
        }


        asserter.assertEquals("Data class has not yet been correctly implemented.", trainingAsJavaClass.toString(), trainingAsKotlinDataClass.toString())
    }
}