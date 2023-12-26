package numbers

fun main() {
    print("Enter a Number 1: ")
    val num1 = readln().toInt()

    print("Enter a Number 2: ")
    val num2 = readln().toInt()

    println("LCM of $num1 and $num2 from Method-1 is : ${lcmCalculator1(num1 , num2)}")
    println("LCM of $num1 and $num2 from Method-1 is : ${lcmCalculator2(num1 , num2)}")


}
fun lcmCalculator1(n1 :Int , n2 :Int): Int{
    var lcm = 0
    val maxNum:Int = if (n1>n2) n1 else n2

    for (i in  (n1*n2) downTo  maxNum ){
        if ((i%n1)==0 && (i%n2)==0){
            lcm = i
        }
    }
    return lcm
}
fun lcmCalculator2(n1: Int, n2: Int): Int {
    var hcf = 0
    val smallNum: Int = if (n1 < n2) n1 else n2

    for (i in 1 until smallNum) {
        if ((n1 % i) == 0 && (n2 % i) == 0) {
            hcf = i
        }
    }

    return (n1 * n2) / hcf
}
