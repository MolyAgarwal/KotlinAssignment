import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_4Test: StringSpec({
    "sec4 Testcase 1"{
        val obj1= stringsFunction()
        obj1.check("How Are You") shouldBe true
    }
    "sec4 Testcase 2"{
        val obj1= stringsFunction()
        val client="Mary"
        val products=3
        val price=30
        obj1.totalAmount() shouldBe "Hello $client your total amount is: ${products*price}"
    }

})