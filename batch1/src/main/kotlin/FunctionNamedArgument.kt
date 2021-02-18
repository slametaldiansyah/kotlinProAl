fun namedArgument(
  firstName: String,
  middleName: String,
  lastName: String
){
    println("Nama : $firstName $middleName $lastName")
}

fun main() {
    namedArgument(
        lastName = "Brokucay",
        middleName = "Cangcut",
        firstName = "Cukimai"
    )
}