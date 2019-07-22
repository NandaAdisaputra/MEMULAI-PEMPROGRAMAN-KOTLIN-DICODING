// TODO 1
abstract class Animal {
    fun run() {
        println("${this.javaClass.name} run!")
    }
}
class Cat : Animal()
class Dog : Animal()

fun main() {

    // TODO 2
    val cat = Cat()
    val dog = Dog()

    val animal: Animal = cat

    // TODO 3
    cat.run()
    dog.run()
    animal.run()
}