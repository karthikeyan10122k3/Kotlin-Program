package numbers

fun main() {
    print("Enter a Decimal Number: ")
    val decimalNum = readln().toInt()

    println("The Octal Equivalent of $decimalNum is ${decimalToOctalConversion(decimalNum)}")
}
fun decimalToOctalConversion(dec :Int): String{
    return Integer.toOctalString(dec)
}