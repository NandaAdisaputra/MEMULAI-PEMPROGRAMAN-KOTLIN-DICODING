fun main() {
    filter(User.NAME)
    filter(User.PHONE)
    filter(User.ADDRESS)
    filter(User.GENDER)
}

// TODO 1
fun filter(user: User) =  when (user) {
    User.NAME -> println("User name")
    User.GENDER -> println("User gender")
    User.ADDRESS -> println("User address")
    User.PHONE -> println("User phone")
}

enum class User {
    NAME, GENDER, ADDRESS, PHONE
}