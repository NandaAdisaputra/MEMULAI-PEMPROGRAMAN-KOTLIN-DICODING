import org.junit.Assert
import org.junit.Test

class Test {

    private fun checkFunction(name: String, age: Int = 19, address: String = "St. Petersburg") {
        val result = mapOf(
                "name" to name,
                "age" to age,
                "address" to address
        )

        Assert.assertEquals("Fungsi setUser() seharusnya mengembalikan nilai $result", result, setUser(name, age, address))
    }

    @Test
    fun test1() = checkFunction("Kotlin")

    @Test
    fun test2() = checkFunction("Dicoding")

    @Test
    fun test3() = checkFunction("Academy")

    @Test
    fun test4() = checkFunction("John" , 23)

    @Test
    fun test5() = checkFunction("Kotlin" , 3)

    @Test
    fun test6() = checkFunction("John" , 23 , "St. Petersburg")
}