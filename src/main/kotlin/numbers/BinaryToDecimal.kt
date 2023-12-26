package numbers

import kotlin.math.pow

fun main() {
    print("Enter a Binary Digits: ")
    val binaryNum = readln()

    println("The Decimal Equivalent of $binaryNum is ${binaryToDecimalConversion(binaryNum)}")
}

fun binaryToDecimalConversion(bin:String):Int{

    return bin.toInt(2)
}