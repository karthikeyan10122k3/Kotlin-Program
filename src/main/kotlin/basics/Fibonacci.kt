package basics

fun main() {
    print("Enter no of Fibonacci :")
    val input = readln().toInt()

    var a = 0
    var b = 1
    var c:Int;
    println("Fibonacci Series: ")
    print("$a $b ")
    for (i in 0 until input){
        c = a + b
        print("$c ")
        a = b
        b = c
    }
}