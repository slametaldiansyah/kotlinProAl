fun String.hello(): String = "Hello $this"

fun String.printHello():Unit = println("Hello $this")

fun main() {
    val name = "aldi"
    println(name.hello())
    name.printHello()

    "Ansyah".printHello()
}