enum class Positions(val hello: String) {
    COWORKER("Hey mate, how has it been?"),
    BOSS("Hi, sir!"),
    CLIENT("Greetings!")
}

const val EVERYTHING_IS_FINE = "Everything is going according to the plan!"

/*

 */
fun greet(position: Positions): String {
    return when(position) {
        Positions.BOSS, Positions.COWORKER -> position.hello
        Positions.CLIENT -> "${position.hello} $EVERYTHING_IS_FINE"
    }
}