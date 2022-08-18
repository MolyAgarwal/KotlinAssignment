import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_12Test: StringSpec({
    var obj1=Section_12()
    "sec12 testcase 1"{
        obj1.addUser("Hina") shouldBe "Added"
        obj1.removeUser("payal") shouldBe "Removed"
        obj1.displayUser() shouldBe "[nitin, john, Hina]"
    }
})