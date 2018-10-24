package exercise05

enum class Positions(val hello: String) {
    COWORKER("Hey mate, how has it been?"),
    BOSS("Hi, sir!"),
    CLIENT("Greetings!")
}

const val EVERYTHING_IS_FINE = "Everything is going according to the plan!"

/**.
 * @Positions enum class sets the proper way of saying hello for each position.
 *
 * Use 'when' expression to greet coworker, boss and client by returning "hello" for certain enum constant.
 * However, when you talk to client, you must additionally make clear that everything is fine:
 * - concatenate 'hello' and 'EVERYTHING_IS_FINE" constants by using Kotlin string templates.
 */
fun greet(position: Positions): String {
    return "Oh hi, Mark!"
}