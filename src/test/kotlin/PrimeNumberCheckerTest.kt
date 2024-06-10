import Funny_Tasks.PrimNumbersChecker
import junit.framework.TestCase.assertEquals
import org.junit.Test

class PrimeNumberCheckerTest {
    private var primChecker = PrimNumbersChecker()

    @Test
    fun toTestPrimeNumbersChecker() {
        val result = primChecker.checkPrimeNumber(7)
        assertEquals("That is a prime", result)
    }
}
