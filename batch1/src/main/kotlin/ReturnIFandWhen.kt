fun sayHello(name: String = ""):String{
    return if (name == ""){
        "Hello Bro"
    }else{
        "Hello $name"
    }
}

fun sayHelloWhen(name: String = ""):String{
    return when(name){
        "" -> "Hello Bro"
        else -> "Hello $name"
    }
}

fun main() {
    sayHello("Aldi")
    println(sayHello())
    val result = sayHelloWhen("aldi")
    println(result)
}