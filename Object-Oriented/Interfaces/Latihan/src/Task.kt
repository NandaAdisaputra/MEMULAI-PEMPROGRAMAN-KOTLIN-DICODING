// TODO 1
interface Animal {
    fun walk() {
        println("${javaClass.name} walk!")
    }

    fun eat() {
        println("${javaClass.name} eat!")
    }
}

// TODO 2
class Cat : Animal

class Dog : Animal

fun main() {
    val cat = Cat()
    val dog = Dog()

    // TODO 3
    cat.eat()
    cat.walk()
    dog.eat()
    dog.walk()
}


