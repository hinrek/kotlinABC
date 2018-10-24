package exercise04

const val DEFAULT_ACCOUNT_OWNER_LAST_NAME = "Parker"
const val DEFAULT_ACCOUNT_OWNER_AGE = 30

class KotlinAccountRegistration {

    data class RegistrationForm(
        private val firstName: String,
        private val lastName: String,
        private val age: Int
    )

    /**
     * Look under main/java/exercise04 directory and investigate AccountRegistration_Java class.
     * As it can be noted, there is getAlphabetCharactersNTimes function registerAccount() (with arguments firstName, lastName and age) and it returns RegistrationForm object based on the inputs.
     * However, when user wants to for instance only specify firstName, this function must be overloaded, thus there are few overloads for different scenarios.
     *
     * In Kotlin, this kind of function overloading is solved internally.
     * Update this function, so if method is called for instance only with firstName as input, lastName and age would be initialized by their default values.
     * NOTE: There are constants defined under this file, which must be used as default values.
     *
     * ANOTHER NOTE:
     * Kotlin part of the tests has been commented and you must uncomment this section.
     * As compiler will generate method overloads when default values have been set, compiler errors will be thrown before.
     */
    fun registerAccount(firstName: String, lastName: String, age: Int) = RegistrationForm(firstName, lastName, age)
}