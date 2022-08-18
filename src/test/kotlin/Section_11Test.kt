import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_11Test: StringSpec({
    "sec11 Testcase 1"{
        val obj1= Section_11()
        obj1.zoo() shouldBe "[zebra, chimp, elephant, panda]"
    }
})