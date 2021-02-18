fun satu(){
//    scoopFun() //error
}

fun main() {
    fun scoopFun(){
        println("Tidak Bisa Diakses Dari luar")
    }
    scoopFun()
}