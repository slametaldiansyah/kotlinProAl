fun main() {
    var names = arrayOf("Hasan","Agus","Fadil","Iman","Lutfi","AB")
    var total = 0

    //fungsi for ini sama sengan foreach diphp
    for (name in names){
        println(name)
        total++
    }
    println("Total perulangan = $total")


    //for in range
    for (value in 0..10){
        println(value)
    }
    for (value2 in 10 downTo 0 step 2){
        println(value2)
    }

    //cek data names array
    val cekArray = names.size -1
    println(cekArray)
    for (i in 0..cekArray){
        println("Index $i = ${names.get(i)}")
    }
}