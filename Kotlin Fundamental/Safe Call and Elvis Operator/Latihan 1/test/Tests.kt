import org.junit.Assert
import org.junit.Test

class Test {

    private fun checkFunction(text: String?) {
        val result = text?.length ?: 0
        Assert.assertEquals("Fungsi getTextLength() seharusnya mengembalikan nilai $result", result, getTextLength(text))
    }

    @Test
    fun testNonNull() = checkFunction("Dicoding Academy")

    @Test
    fun testNull() = checkFunction(null)
}