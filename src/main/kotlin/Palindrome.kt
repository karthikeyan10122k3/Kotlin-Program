fun main() {
    println("Enter a String: ")
    val inputString = readln()
    var reverseString: String = ""
    for (i in inputString.length - 1 downTo 0 ){
        reverseString += inputString[i]
    }
    if (inputString == reverseString){
        println("Palindrome")
    }
    else{
        println("Not Palindrome")
    }

}