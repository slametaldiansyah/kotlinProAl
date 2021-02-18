fun main(){
    val number = 5
    println("IsPrimeNumber($number) = ${isPrime(number)}")
}

fun isPrime(number: Int): Boolean{
    var result = true

    for (i in 2 until number)
    {
        if (number % i == 0){
            result = false
            break
        }
    }
    return result
}
