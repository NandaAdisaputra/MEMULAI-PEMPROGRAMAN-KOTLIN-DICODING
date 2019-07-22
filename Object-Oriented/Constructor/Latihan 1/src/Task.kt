fun main() {
    val math = Arithmetic(10)

    val resultSum = math.sum()
    val resultMultiple = math.multiple()

    // TODO 2
    println(resultSum)
    println(resultMultiple)

}
class Arithmetic(val valueA: Int) {

    var valueB: Int = 5

    // TODO 1
    constructor(valueA: Int, valueB: Int) : this(valueA) {
        this.valueB = valueB
    }

    fun multiple() = valueA * valueB

    fun sum() = valueA + valueB
}