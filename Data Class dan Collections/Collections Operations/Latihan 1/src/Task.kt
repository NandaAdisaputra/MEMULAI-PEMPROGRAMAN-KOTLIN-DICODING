fun main() {

    val number = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // TODO 1
    val evenNumber = number.filter { it % 2 == 0 }

    // TODO 2
    val multipliedBy7 = evenNumber.map { it * 7 }

    // TODO 3
    val result = multipliedBy7.sum()

    // TODO 4
    println("Result $result")
}