package basics

fun main() {
    print("Enter a Number: ")
    val input = readln().toInt()

    isAbundantNumber(input)
}
fun isAbundantNumber(n:Int){
    var sum = 0
    for (i in 1 until n){
        if ((n%i) == 0){
            sum += i
        }
    }
    if (sum > n){
        println("It is Abundant Number!")
    }
    else{
        println("It is Not Abundant Number!")
    }
}