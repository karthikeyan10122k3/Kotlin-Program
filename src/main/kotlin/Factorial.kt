fun main() {
    print("Enter a Number to find Factorial: ")
    val input = readln().toInt()

    //Method-1
    var fact1:Int = 1
    for (i in 1..input){
        fact1 *= i
    }
    println("Factorial using Method-1: $fact1")

    println("Factorial using Method-2: " + factorial(input))
}

//Method-2
fun factorial(num :Int):Int{
    var fact :Int
    if (num == 0 || num == 1)
        return 1
    else
        fact = num * factorial(num-1)
        return fact
}