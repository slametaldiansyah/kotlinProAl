fun main() {
    var range = 100
    var i = 0

    while (true){
        println(i)
        i++
        if (i > range){
            break
        }
    }

    //cek bilangan ganjil
    for (i in 0..10)
    {
        //habis dibagi dua
        if (i % 2 == 0){
            continue
        }
        println("Ganjil = $i")

    }
println("\n")

    //cek bilangan prima
    var number: Int = 2
    var result: Boolean = true
    for (i in 2 until number)
    {
        if (number % i == 0){
            result = false
            break
        }
        else{
            result = true
        }
    }
    println("$number apakah prima ? $result")
}
