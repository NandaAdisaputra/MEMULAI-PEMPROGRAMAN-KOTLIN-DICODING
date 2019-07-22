import org.junit.Assert
import org.junit.Before
import org.junit.Test

class Test {

    lateinit var arithmetic: Arithmetic
    private val defaultValue = 5
    private val primaryValue = 10
    private val secondaryValue = 78

    @Before
    fun setup() {
        arithmetic = Arithmetic(primaryValue)
    }

    @Test
    fun test1Primary() {

        val resultSum = defaultValue + primaryValue
        val resultMultiple = defaultValue * primaryValue
        Assert.assertEquals("sum", resultSum , arithmetic.sum())
        Assert.assertEquals("multiple", resultMultiple , arithmetic.multiple())
    }

    @Test
    fun test1Secondary() {
        arithmetic = Arithmetic(primaryValue, secondaryValue)

        val resultSum = primaryValue + secondaryValue
        val resultMultiple = primaryValue * secondaryValue
        Assert.assertEquals("sum", resultSum , arithmetic.sum())
        Assert.assertEquals("multiple", resultMultiple , arithmetic.multiple())
    }
}