fun main() {
//    var result1: Int = 10 / 3
    var result1 = 10.0 / 3.0
    println(result1)

//    var result2: Int = 10 + 10 / 2
    var result2 = 10 + 10 / 2
    println(result2)

    var total = 0

    val barang1 = 100
//    total = total + barang1 .....bisa disingkat jadi
    total += barang1

    val barang2 = 200
//    total = total + barang2
    total += barang2
    val barang3 = 500
//    total = total + barang3
    total += barang3

    total++ //total + 1
    println(total)
    total-- //total -1
    println(total)

    val suhu = -3
    println(suhu)

    val sehat = true
    println(!sehat)
}