import org.junit.Assert
import org.junit.Test

class Test {

    private fun checkFunction() {
        val values = Array(User.values().size) {
            User.values()[it].value
        }
        val condition = values.contentEquals(getAllEnumObjectValue())
        Assert.assertTrue("Function getAllEnumObjectValue() seharusnya mengembalikan nilai $values", condition)
    }

    @Test
    fun testGetAllObjectEnumValues() = checkFunction()
}