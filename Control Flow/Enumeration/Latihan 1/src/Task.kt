fun main() {

    // TODO 3
    getAllEnumObject().forEach {
        println(it)
    }
}

// TODO 2
fun getAllEnumObject() =  User.values()

// TODO 1
enum class User {
    NAME, GENDER, ADDRESS, PHONE
}