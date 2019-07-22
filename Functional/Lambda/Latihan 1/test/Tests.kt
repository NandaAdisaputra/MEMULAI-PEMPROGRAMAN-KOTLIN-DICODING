import org.junit.Assert
import org.junit.Test

class Test {

    private fun checkFunction(value: Int){
        val result = value * value

        Assert.assertEquals("Fungsi multiple seharusnya mengembalikan nilai $result" , result , multiply(value))
    }

    @Test fun test1() = checkFunction(100)

    @Test fun test2() = checkFunction(200)

    @Test fun test3() = checkFunction(300)

    @Test fun test4() = checkFunction(400)
}