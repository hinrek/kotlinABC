package exercise4

import org.junit.jupiter.api.Test
import kotlin.test.asserter

class AccountRegistrationTest {

    @Test
    fun `Is kotlin method with default values correctly implemented`() {

        val firstName = "Peeter"
        val lastName = "Puravik"
        val age = 30

        val javaRegistrationForms = listOf(
            JavaAccountRegistration().registerAccount(firstName, lastName, age).toString(),
            JavaAccountRegistration().registerAccount(firstName, lastName).toString(),
            JavaAccountRegistration().registerAccount(firstName, age).toString(),
            JavaAccountRegistration().registerAccount(firstName).toString()
        )

        /**
         * This code has been commented out, because when method with default values has not been implemented yet,
         * compiler will not be able to generate function overloads.
         *
         * In order to make this code compile, it is necessary to implement 'registerAccount' function correctly.
         */

        val kotlinRegistrationForms = mutableListOf<String>()
        /*kotlinRegistrationForms.addAll(
            listOf(
                KotlinAccountRegistration().registerAccount(firstName, lastName, age).toString(),
                KotlinAccountRegistration().registerAccount(firstName, lastName).toString(),
                KotlinAccountRegistration().registerAccount(firstName = firstName, age = age).toString(),
                KotlinAccountRegistration().registerAccount(firstName).toString()
            )
        )*/

        asserter.assertEquals("Register account method with default values has not been implemented yet.", javaRegistrationForms, kotlinRegistrationForms)
    }
}