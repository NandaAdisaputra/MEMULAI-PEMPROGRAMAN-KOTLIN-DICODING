import org.junit.Assert
import org.junit.Test

class Test {

    private fun checkFunctionSorted(vararg value: Int) {
        val result = value.sorted()

        Assert.assertEquals("Fungsi sortedAscending seharusnya mengembalikan nilai $result", result, sortedAscending(*value))
    }

    private fun checkFunctionSortedDescending(vararg char: Char){
        val result = char.sortedDescending()

        Assert.assertEquals("Fungsi sortedDescending seharusnya mengembalikan nilai $result", result, sortedDescending(*char))
    }

    @Test
    fun test1() = checkFunctionSorted(10, 11, 13, 141, 30, 21, 32, 24)

    @Test
    fun test2() = checkFunctionSorted(*((1000.downTo(1) step 17).toList().toIntArray()))

    @Test
    fun test3() = checkFunctionSortedDescending('A', 'B', 'D', 'F', 'W', 'G', 'Z')

    @Test
    fun test4() = checkFunctionSortedDescending(*(('A'.downTo('Z') step 3).toList().toCharArray()))


}