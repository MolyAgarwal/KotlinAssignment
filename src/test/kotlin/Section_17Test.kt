import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_17Test: StringSpec({
    " Testcase 1"{
        val obj1= Section_17()
        obj1.main("Hema") shouldBe "Good Bye"
    }

})