import kotlin.math.pow
fun main(args: Array<String>) {
        print("Enter a Number:")
        val number :Int = readln().toInt()
        val length :Int = number.toString().length
        println("Length: $length")
        armstrongFinder(number, length)
    }

fun armstrongFinder(number: Int, length: Int) {
    var sum = 0
    var temp :Int = number
    while (temp != 0) {
        val rem :Int = temp % 10
        sum += rem.toDouble().pow(length.toDouble()).toInt()
        temp /= 10
    }
    if (number == sum) {
        println("It is an Armstrong Number ")
    } else {
        println("It is not an Armstrong Number")
    }
}
