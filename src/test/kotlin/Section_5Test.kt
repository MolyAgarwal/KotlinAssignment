import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_5Test: StringSpec({
    "sec5 Testcase 1"{
        val obj1= ageCalculate()
        val year=2000
        obj1.calculate(year) shouldBe 2022-year
    }
})