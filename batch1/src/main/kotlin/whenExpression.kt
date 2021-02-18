fun main() {
    var cekDataWhen = "G"

    when (cekDataWhen) {
        "A" -> println("nilai A")
        "B" -> println("nilai B")
        "C" -> println("nilai C")
        "D" -> println("nilai D")
        "E" -> println("nilai E")
        "F" -> println("nilai F")
        else -> println("nilai Tidak Ditemukan")
    }
    println("\n")

    cekDataWhen = "A"
    //bisa menggunakan ini untuk menampung banyak
    when (cekDataWhen) {
        "A" ->
        {
            println("nilai A")
            println("nilai == A Atau Apalah")
        }
        "B" -> {println("nilai B")}
        "C" -> {println("nilai C")}
        "D" -> {println("nilai D")}
        "E" -> {println("nilai E")}
        "F" -> {println("nilai F")}
        else -> {println("nilai Tidak Ditemukan")}
    }

    cekDataWhen = "B"
    //multiple option
    when(cekDataWhen){
        "A","B","C","D" -> println("Dapet")
        else -> {
            println("ga dapet")
        }
    }

    //cek data in array
    val finalExam = "A"
    val passValues = arrayOf("A","B","C")
    when(finalExam){
        in passValues -> println("Data in array exist")
        !in passValues -> println("Data Not exist") //bisa juga menggunakan else
    }

    //menggunakan is untuk cek tipe data
    val name = "Aldi"
    when(name){
        is String -> println("$name Name Is String")
        !is String -> println("Not String") //bisa menggunakan else
    }

    //when tanpa variable
    val nilai = 10
    when{
        nilai > 70 -> println("nilai diatas 70")
        nilai > 100 -> println("nilai nilai diatas 100")
        else -> println("Tidak Ada Nilai")
    }
}