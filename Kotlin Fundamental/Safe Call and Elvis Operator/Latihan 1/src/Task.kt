fun main() {
    val text: String? = "Dicoding Academy"

    val textLength = getTextLength(text)

    print("Text memiliki panjang karakter : $textLength")
}

// TODO
fun getTextLength(text: String?) = text?.length ?:0