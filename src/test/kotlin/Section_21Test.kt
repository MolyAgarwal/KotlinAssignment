import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_21Test:StringSpec({
    "Testcase 1"{
        val obj1=Section_21()
        obj1.main("cat") shouldBe "Lifespan for cat is 15"
    }
    "Testcase 1"{
        val obj1=Section_21()
        obj1.main("crow") shouldBe "Lifespan for crow is 20"
    }
})