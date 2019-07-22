fun main() {

    // TODO 3
    val resultSortedAscending = sortedAscending(10, 11, 13, 141, 30, 21, 32, 2)
    val resultSortedDescending = sortedDescending('A', 'B', 'D', 'F', 'W', 'G', 'Z')

    // TODO 4
    println(resultSortedAscending)
    println(resultSortedDescending)

}

// TODO 1
fun sortedAscending(vararg value: Int) = value.sorted()

// TODO 2
fun sortedDescending(vararg char: Char) = char.sortedDescending()