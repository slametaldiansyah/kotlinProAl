fun sayName(firstName: String,lastName: String? = null)
{
    if (lastName == null){
    println("Hallo $firstName")
    }else{
        println("Hallo $firstName $lastName")
    }
}

fun main() {
    sayName("Aldi")
    sayName("Aldi","Ansyah")
}