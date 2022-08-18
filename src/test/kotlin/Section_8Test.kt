import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_8Test : StringSpec({
    "sec8 Testcase 1"{
        val obj1= Section_8()
        val num =7
        val num2 = num.toDouble()
        val result = num2*7
        obj1.getLength(num) shouldBe "The length of $result is ${result.toString().length}"
    }
    "sec8 Testcase 2"{
        val obj1= Section_8()
        obj1.total(7) shouldBe 7*29.99
    }
})