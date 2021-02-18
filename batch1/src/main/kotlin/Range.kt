fun main() {

//    val range = 1..100
    //bisa dibalik
//    val range = 100 downTo 1
    //dan ditambahkan step
    val range = 100 downTo 1 step 5

//    println(range)
    println(range.count())
    println(range.contains(50))
    println(range.contains(500))
    println(range.first)
    println(range.last)
    println(range.step)

}