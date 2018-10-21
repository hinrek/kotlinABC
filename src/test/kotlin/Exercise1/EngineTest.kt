package Exercise1

import org.junit.jupiter.api.Test
import kotlin.test.asserter

class EngineTest() {

    @Test
    fun `Is kotlin car engine correctly implemented`() {

        val speed = 2000f
        val modelName = "dummyModelName"
        val someOtherVariable = "dummy"

        val javaCarEngine = Exercise1.javaVersion.CarEngine(speed, modelName, someOtherVariable)
        // Implement CarEngine as Kotlin Data class
        val kotlinCarEngine = Exercise1.kotlinVersion.CarEngine()

        asserter.assertEquals("Data class is not yet correctly implemented.", javaCarEngine.toString(), kotlinCarEngine.toString())
    }
}