class Car(
        numberOfSeats: Int,
        numberOfWheels: Int,
        hasEngine: Boolean,
        val motor: Motor,
        val make: String,
        val model: String
) : Vehicle(
        numberOfSeats,
        numberOfWheels,
        hasEngine
) {

    override fun toString(): String {
        return """
            Make: $make
            Model: $model
            Motor: $motor
        """.trimIndent()
    }
}