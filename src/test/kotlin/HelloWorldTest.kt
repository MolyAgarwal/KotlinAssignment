import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class HelloWorldTest : StringSpec({

    "Sec3 Testcase 1"{
        val obj1= HelloWorld()
        var str ="Fluffy"
        obj1.msg(str) shouldBe "Hello $str"
    }

})