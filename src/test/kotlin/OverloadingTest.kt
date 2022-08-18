import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class OverloadingTest:StringSpec({
    "TestCase 1"{
        val obj1=Overloading()
        obj1.cost("coffee",5.6) shouldBe "A coffee costs ${5.6*1.2}"
    }

})