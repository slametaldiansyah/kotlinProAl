fun main() {
    val names: Array<String> = arrayOf("aldi","Deby","Hans")
    val aldi: String = names[0]
    val Deby: String = names.get(1)
    val Hans: String = names.get(2)

    names.set(0,"Ansyah")
    val Ansyah: String = names[0]

    names[1] = "Noviralita"
    println(names[0])
    println(names[1])

    //number array
    val nilai: Array<Int> = arrayOf(9,8,7)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    //array null
    val input: Array<String?> = arrayOfNulls(5)
    input[0] = "Array1"
    input[1] = "Array2"
    input[2] = "Array3"
    input[3] = "Array4"
    input[4] = "Array5"

    println(input.get(1))
}