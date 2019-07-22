fun main() {
    // TODO 2
    val result = setUser("John", 23, "St. Petersburg")

    // TODO 3
    println(result)

}

// TODO 1
fun setUser(name: String, age: Int = 19, address: String = "Saint Petersburg") =
        mapOf(
                "name" to name,
                "age" to age,
                "address" to address)
