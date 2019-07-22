import kotlin.reflect.KProperty

// TODO 1
class PropertyDelegate {

    private var value: Any? = null

    operator fun getValue(classRef: Any?, property: KProperty<*>): Any? {
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any?) {
        println("Nilai ${property.name} dari: $value berubah menjadi $newValue")
        value = newValue
    }
}

class Person {
    // TODO 2
    var name: Any? by PropertyDelegate()
var age: Any? by PropertyDelegate()
var gender: Any?by PropertyDelegate()
}

fun main() {
    val person = Person()
    person.name = "John"
    person.age = 22
    person.gender = "male"

    println("Name: ${person.name}")
    println("Age: ${person.age}")
    println("Gender: ${person.gender}")
}