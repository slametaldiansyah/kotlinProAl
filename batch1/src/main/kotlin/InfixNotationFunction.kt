infix fun String.to(type: String):String{
    if(type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Aldi Ansyah" to "UP"
    println(result)

    val result2 = "Aldi Ansyah" to "low"
    println(result2)
}