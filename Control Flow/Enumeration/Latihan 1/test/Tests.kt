import org.junit.Assert
import org.junit.Test

class Test {

    private fun checkFunction() {
        val users = arrayOf(User.NAME, User.GENDER, User.ADDRESS, User.PHONE)
        val condition = users.contentEquals(getAllEnumObject())
        Assert.assertTrue("Function getAllEnumObject() seharusnya mengembalikan nilai $users", condition)
    }

    @Test
    fun testGetAllObjectEnum() = checkFunction()
}