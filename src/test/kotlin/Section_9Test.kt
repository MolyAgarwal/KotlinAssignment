import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_9Test: StringSpec({
    "sec9 Testcase 1"{
        val obj1= totalAmount()
        val name = "biscuit"
        val qty = 5
        obj1.total(name,5) shouldBe "$name's total cost : ${qty*9.99}"
    }
})