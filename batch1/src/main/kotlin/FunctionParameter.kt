fun inputName(firstName: String, lastName: String?){
        if(lastName == null){
            println("hello $firstName")
        }else{
            println("hello $firstName $lastName")
        }
}

fun main() {
    inputName("Aldi",null)
    inputName("Beby","Noviralita")
}