package exercise4

const val DEFAULT_ACCOUNT_OWNER_LAST_NAME = "Parker"
const val DEFAULT_ACCOUNT_OWNER_AGE = 30

class KotlinAccountRegistration {

    data class RegistrationForm(
            private val firstName: String,
            private val lastName: String,
            private val age: Int
    )

    fun registerAccount(firstName: String, lastName: String = DEFAULT_ACCOUNT_OWNER_LAST_NAME, age: Int = DEFAULT_ACCOUNT_OWNER_AGE) = RegistrationForm(firstName, lastName, age)
}