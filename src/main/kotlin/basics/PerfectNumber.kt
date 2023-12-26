package basics

fun main() {
    print("Enter a Number: ")
    val input = readln().toInt()


    if(input!=0) {
        var sum = 0
        for (i in 1 until input) {
            if ((input % i) == 0) {
                sum += i
            }
        }
        if (input == sum){
            println("It is Perfect Number!")
        }
        else{
            println("It is not a Perfect Number")
        }
    }
    else{
        println("Enter Valid Number")
    }

}