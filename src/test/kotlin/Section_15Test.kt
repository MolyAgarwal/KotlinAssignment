import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_15Test:StringSpec({
    " Testcase 1"{
        val obj1= Section_15()
        obj1.numToGrade(80) shouldBe "B"
    }
})