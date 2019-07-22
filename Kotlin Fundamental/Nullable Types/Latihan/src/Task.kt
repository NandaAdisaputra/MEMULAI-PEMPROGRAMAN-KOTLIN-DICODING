fun main() {
    val valueA: Int? = 10
    val valueB: Int? = 10

    val result = sum(valueA, valueB)

    print("Result : $result")
}

// TODO
fun sum(valueA: Int?, valueB: Int?): Int {
    return if (valueA != null && valueB != null) valueA + valueB else 0
}