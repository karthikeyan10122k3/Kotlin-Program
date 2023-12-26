import kotlin.math.pow

fun main() {
    print("Enter a Number: ")
    val input :Int = readln().toInt()

    print("Enter Power: ")
    val power :Int = readln().toInt()

    val result :Int = input.toDouble().pow(power.toDouble()).toInt()
    print("Power of the given Number is: $result")
}