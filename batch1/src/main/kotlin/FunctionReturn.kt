// harus ada :Int diantara kurung
fun sum(a: Int, b: Int): Int{
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int):Int{
    if (b == 0){
        return 0
    }else{
        val total = a / b
        return total
    }
}

fun main() {
    val result = sum(10,11)
    println(result)
    println(sum(10,2))

    println(bagi(10,2))
    println(bagi(10,0))
}