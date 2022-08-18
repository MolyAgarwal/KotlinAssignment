import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_16Test:StringSpec({
    " Testcase 1"{
        val obj1= Section_16()
        obj1.main(56) shouldBe "adult"
    }
})