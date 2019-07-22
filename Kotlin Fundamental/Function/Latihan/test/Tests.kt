import org.junit.Assert
import org.junit.Test

class Test {

    private fun functionSum(value1: Int, value2: Int) {
        val result = value1 + value2
        Assert.assertEquals("Fungsi sum() seharusnya mengembalikan nilai $result", result, sum(value1, value2))
    }


    @Test
    fun testSum1() = functionSum(10, 10)

    @Test
    fun testSum2() = functionSum(20, 20)

    @Test
    fun testSum3() = functionSum(30, 30)
}