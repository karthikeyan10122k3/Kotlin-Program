package numbers

fun main() {
    print("Enter a Decimal Number: ")
    val decimalNum = readln().toInt()

    println("The HexaDecimal Equivalent of $decimalNum is ${decimalToHexadecimalConversion(decimalNum)}")
}
fun decimalToHexadecimalConversion(dec :Int): String{
    return Integer.toHexString(dec)
}