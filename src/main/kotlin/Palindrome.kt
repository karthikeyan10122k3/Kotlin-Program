fun main() {
    println("Enter a String: ")
    val inputString = readln()

    //Method-1
    var reverseString1: String = ""
    for (i in inputString.length - 1 downTo 0 ){
        reverseString1 += inputString[i]
    }

    //Method-2
    val reverseString2 = inputString.reversed()


    if ((inputString == reverseString1) && (inputString == reverseString2)){
        println("Palindrome")
    }
    else{
        println("Not Palindrome")
    }

}