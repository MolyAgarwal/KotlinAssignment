import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Section_7Test : StringSpec({
    "sec7 Testcase 1"{
        val obj1= Section_7()
        val interest=1.055
        val initialAmount = 5000.5
        val finalAmount= initialAmount*interest*interest*interest*interest*interest
        obj1.interest(initialAmount) shouldBe "Your amount after 5 years with 5.5% of interest per year: $finalAmount"
    }

    "sec7 Testcase 2"{
        val obj1= Section_7()
        val animals=3
        val prodAnimal=1
        val child=2
        val members=child+1
        val fundingResult=((animals<=5)&&(prodAnimal>=1))||(members>=3)
        obj1.fundingResult() shouldBe "Does the farmer recieve funding? $fundingResult"
    }
})