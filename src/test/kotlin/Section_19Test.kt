import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_19Test: StringSpec({
    " Testcase 1"{
        val obj1= Section_19()
        obj1.main(49) shouldBe "7 14 21 28 35 42 "
    }
    " Testcase 2"{
        val obj1= Section_19()
        obj1.execute("payal") shouldBe "payal You are already here"
    }
})