package exercise06

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.asserter


class NullabilityTest {

    @Nested
    @DisplayName("Tests for the function 'getSafeStringLength'")
    inner class GetSafeStringLengthTests {

        @Test
        fun `Is 0 returned when null is given as input for 'getSafeStringLength' function`() {

            val givenString: String? = null
            asserter.assertEquals("When specified string input is null, 0 must be returned.", getSafeStringLength(givenString), 0)

        }

        @Test
        fun `Is string length returned when string is given as input for 'getSafeStringLength' function`() {

            val givenString: String? = "abc"
            asserter.assertEquals("When specified string input is not null, string length must be returned.", getSafeStringLength(givenString), 3)
        }
    }

    @Nested
    @DisplayName("Tests for the function 'getManagerNameTests'")
    inner class GetManagerNameTests {

        val ceo = Employee("Da Boss", null)
        val developer = Employee("Bob Smith", ceo)

        @Test
        fun `Is manager name returned when employee has manager`() {

            asserter.assertEquals("Developer has manager (not of course in Proekspert context) - CEO's name must be returned.", getManagerName(developer), ceo.name)
        }

        @Test
        fun `Is null returned when no manager is given for the employee`() {

            asserter.assertEquals("CEO has no manager - null must be returned.", getManagerName(ceo), null)
        }

    }
}