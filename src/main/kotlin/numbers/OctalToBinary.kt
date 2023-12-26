package numbers

fun main() {
    print("Enter a Octal Number: ")
    val octalNum = readln()

    println("The Binary Equivalent of $octalNum is ${octalToBinaryConversion(octalNum)}")
}
fun octalToBinaryConversion(oct :String): String{
    val decimalNum = oct.toInt(8)
    return Integer.toBinaryString(decimalNum)
}