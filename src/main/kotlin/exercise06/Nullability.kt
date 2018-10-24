package exercise06

/**
 * Retrieve string length or '0' when String is null.
 * Use elvis operator to solve this exercise.
 */
fun getSafeStringLength(string: String?): Int = Int.MAX_VALUE

/**
 * Retrieve manager name by checking first, whether manager type is nullable.
 * Use safe call operator to solve this exercise.
 */
class Employee(val name: String, val manager: Employee?)
fun getManagerName(employee: Employee): String? = ""
