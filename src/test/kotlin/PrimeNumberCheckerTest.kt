import Funny_Tasks.PrimNumbersChecker
import junit.framework.TestCase.assertEquals
import org.junit.Test

class PrimeNumberCheckerTest {
    private var primChecker = PrimNumbersChecker()

    @Test
    fun toTestPrimeNumbersChecker_With_Prime() {
        val result = primChecker.checkPrimeNumber(7)
        assertEquals("That is a prime", result)
    }
    @Test
    fun toTestPrimeNumbersChecker_With_Zero() {
        val result = primChecker.checkPrimeNumber(0)
        assertEquals("The number 0 is not a prime!", result)
    }
    @Test
    fun toTestPrimeNumbersChecker_With_Two() {
        val result = primChecker.checkPrimeNumber(2)
        assertEquals("The number 2 is not a prime!", result)
    }
}
