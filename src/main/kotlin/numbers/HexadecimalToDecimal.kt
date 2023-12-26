package numbers

import kotlin.math.pow

fun main() {
    print("Enter a HexaDecimal: ")
    val hexadecimalString :String = readln()

    println("The Decimal Equivalent of $hexadecimalString is ${hexadecimalToDecimalConversion(hexadecimalString)}")
}
fun hexadecimalToDecimalConversion(hex : String):Int{

    return hex.toInt(16)
}


