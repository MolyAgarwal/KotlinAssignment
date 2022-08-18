import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class hwTest: StringSpec({

    "Ex4 Testcase 1"{
        val obj1= hw()
        obj1.main() shouldBe "Working fine!"
         }

    "Ex4 Testcase 2"{
    val obj2= hw()
    obj2.add(2,3) shouldBe 5
}
    "Ex4 Testcase 2"{
        val obj3= hw()
        obj3.sub(5,3) shouldBe 2
    }
})