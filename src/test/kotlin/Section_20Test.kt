import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_20Test: StringSpec({
    "Testcase 1"{
        val obj1=Section_20()
        obj1.main("12") shouldBe "Sorry you are not allowed"

    }
    "Testcase 2"{
        val obj1=Section_20()
        obj1.main("stop") shouldBe "Program Stopped"

    }
})