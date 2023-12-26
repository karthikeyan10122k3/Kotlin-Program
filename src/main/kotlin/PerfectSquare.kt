import kotlin.math.sqrt

fun main() {
    print("Enter a Number: ")
    val input = readln().toInt()

    if (input>0){
        isPerfectSquare(input)
    }
    else{
        println("Enter a Valid Number")
    }
}
fun isPerfectSquare(n:Int){
    val sr = sqrt(n.toDouble()).toInt()
    if ((sr * sr) == n){
        println("It is Perfect Square!")
    }
    else{
        println("It is not Perfect Square!")
    }
}