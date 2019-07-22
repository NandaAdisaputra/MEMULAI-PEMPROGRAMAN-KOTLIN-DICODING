fun main() {

    // TODO 3
    getAllEnumObjectValue().forEach {
        println(it)
    }
}

// TODO 1
fun getAllEnumObjectValue() = Array(User.values().size) {
    User.values()[it].value
}

// TODO 2
enum class User(val value: String) {
    NAME("Nanda Adisaputra"),
    GENDER("Pria"),
    ADDRESS("Kp.Jempono"),
    PHONE("089...")
}