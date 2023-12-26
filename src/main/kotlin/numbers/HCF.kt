package numbers

fun main() {
    print("Enter a Number 1: ")
    val num1 = readln().toInt()

    print("Enter a Number 2: ")
    val num2 = readln().toInt()

    println("HCF of $num1 and $num2 is : ${hcfCalculator(num1, num2)}")
}
fun hcfCalculator(n1 :Int , n2 :Int): Int{
    var hcf = 0
    val smallNum:Int = if (n1<n2) n1 else n2

    for (i in 1 until smallNum){
        if ((n1%i)==0 && (n2%i)==0){
            hcf = i
        }
    }
    return hcf
}
