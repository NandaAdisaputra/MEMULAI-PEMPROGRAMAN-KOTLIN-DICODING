import java.lang.NumberFormatException

fun main() {
    val valueA = "19.1"
    val valueB = "20"
    var result = 0

    // TODO
    try {
        result = valueA.toInt() + valueB.toInt()
    } catch (e: NumberFormatException) {
        result = (valueA.toDouble() + valueB.toDouble()).toInt()
    } finally {
        println("Result is $result")
    }
}
