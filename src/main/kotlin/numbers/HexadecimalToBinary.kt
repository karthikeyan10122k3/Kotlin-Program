package numbers

fun main() {
    print("Enter a Hexadecimal: ")
    val hexaDecimalNum = readln()

    println("The Binary Equivalent of $hexaDecimalNum is ${hexaDecimalToBinaryConversion(hexaDecimalNum)}")
}
fun hexaDecimalToBinaryConversion(hex :String): String{
    val hexaNum = hex.toInt(16)
    return Integer.toBinaryString(hexaNum)
}