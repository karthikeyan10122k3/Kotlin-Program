package basics

fun main() {
    print("Enter a Number: ")
    val input = readln().toInt()

    var sum = 0
    var temp = input
    while (temp!=0){
        val remainder = temp%10
        sum += remainder
        temp /= 10
    }
    if ((input%sum) == 0){
        println("It is Harshad Number!")
    }
    else{
        println("It is Not Harshad Number!")
    }
}