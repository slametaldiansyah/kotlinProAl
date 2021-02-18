fun main() {
    var age: Byte = 20
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L
    var sample: Float = 10.11F
//    println(age)
//    println(height)
//    println(distance)
//    println(balance)

    // literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001
//    //literal print
//    println(binaryLiteral)
//    println(decimalLiteral)
//    println(hexadecimalLiteral)


    // menambahkan _ untuk mempermudah membaca
    var price: Long = 9_000_000_000L

    //conversion
    var number: Int = 100
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    println(price)

//
}