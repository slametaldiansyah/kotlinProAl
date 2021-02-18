//untuk membuat variable global
const val APPICATION = "Aldi App"
const val VERSION = "6.9"
//harus menggunakan val tidak bisa var

fun main() {

    //bisa diakses dimana saja
    println("$APPICATION : $VERSION")

    //var dapat diubah datanya
    var firstName = "aldi"
    firstName = "Deby"
    println(firstName)

    //val immuteable tidak dapat dirubah datannya
    val name = "aldi"
//    name = "Deby"
    println(name)

    //var nullable
    //membuat data null tidak disarankan kotlin
    var nullName: String? = "Aldi"
    nullName = null
    //println akan error ketika kita memanggil atribute
//    println(nullName.length)
    //harus ditambahkan ?
    println(nullName?.length)

}