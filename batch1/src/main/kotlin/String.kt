fun main() {
    val firstName: String = "Aldi"
    val lastName: String = "Ansyah"
    val address: String = """
        |Jalan Jalan aja, Rt 00/00
        |Kota Prindapan
        |Kelurahan Padjajaran
        |Mars
    """.trimMargin()
    println(address)

    //menggabungkan
//    var fullName: String = firstName + " " + lastName
    //agar tidak warning
    val fullName: String = "$firstName $lastName"

    //melihat panjang baris nama
    val desc: String = "$fullName length = ${fullName.length}"
    println(desc)
    println(fullName)
}