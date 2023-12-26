package numbers

fun main() {
    print("Enter a Decimal Number: ")
    val decimalNum = readln().toInt()

    println("The Binary Equivalent of $decimalNum is ${decimalToBinaryConversion(decimalNum)}")
}
fun decimalToBinaryConversion(dec :Int): String{
    return Integer.toBinaryString(dec)
}

