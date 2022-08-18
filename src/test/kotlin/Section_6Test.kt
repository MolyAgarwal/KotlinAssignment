import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_6Test:StringSpec({
    "sec6 Testcase 1"{
        val obj1= Section_6()
        val n=6
        val results=3.14*n
        obj1.result(n) shouldBe "Type of result ${results::class.java} and result is ${results} "
    }
}
)