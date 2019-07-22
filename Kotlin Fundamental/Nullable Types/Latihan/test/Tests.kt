import org.junit.Assert
import org.junit.Test

class Test {

    private fun checkFunction(valueA: Int?, valueB: Int?) {
        val result = if (valueA != null && valueB != null) valueA + valueB else 0

        Assert.assertEquals("Fungsi sum() seharusnya mengembalikan nilai $result", result, sum(valueA, valueB))
    }

    @Test
    fun testNonNull() = checkFunction(10, 10)

    @Test
    fun testNull() = checkFunction(null, null)
}