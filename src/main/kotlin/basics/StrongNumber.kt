package basics

fun main() {
    print("Enter a number :")
    val input = readln().toInt()

    var temp = input
    var sum = 0
    while (temp!=0){
        val reminder= temp%10
        sum += factorial(reminder)
        temp /=10
    }
    if (input == sum){
        println("It is Strong Number!")
    }
    else{
        println("It is not Strong Number!")
    }
}