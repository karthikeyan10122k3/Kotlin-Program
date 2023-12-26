package numbers

import kotlin.math.pow

fun main() {
    print("Enter a Octal Number: ")
    val octalNum = readln()

    println("The Decimal Equivalent of $octalNum is ${octalToDecimalConversion(octalNum)}")
}

fun octalToDecimalConversion(oct :String):Int{

    return oct.toInt(8)
}
