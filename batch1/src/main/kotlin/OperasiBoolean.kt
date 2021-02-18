fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 70
    val nilaiTambahan = 90

    val standarLulusUjian = nilaiUjian > 75
    val standarLulusAbsen = nilaiAbsen > 80
    val standarLulusTambahan = nilaiTambahan > 70

    val lulusJahat = standarLulusUjian && standarLulusAbsen && standarLulusTambahan

//    val lulusJahat = ((standarLulusUjian && standarLulusAbsen) && standarLulusTambahan) //secara default kiri kekanan
    val lulusSlow = standarLulusUjian || standarLulusAbsen || standarLulusTambahan

    println(lulusJahat)
    println(lulusSlow)

}