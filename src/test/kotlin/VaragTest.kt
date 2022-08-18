import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class VaragTest: StringSpec({
    "Testcase 1" {
        val obj = Varag()
        obj.main(2, "Mohan", "shyam") shouldBe "Hello Mohan -- Hello Mohan -- \nHello shyam -- Hello shyam -- \n"
    }
})