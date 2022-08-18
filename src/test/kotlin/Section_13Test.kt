import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_13Test:StringSpec({
    var ex16=Section_13()
    "testcase 1"{
        ex16.total() shouldBe 7253
    }

})

