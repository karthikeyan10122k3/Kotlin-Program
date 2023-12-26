fun main() {
    print("Enter a Number 1: ")
    val input1 = readln().toInt()

    print("Enter a Number 2: ")
    val input2 = readln().toInt()

    val factorSum1 = getFactorSum(input1)
    val factorSum2 = getFactorSum(input2)

    if((input1/factorSum1) == (input2/factorSum2)){
        println("The Numbers $input1 and $input2 are Friendly Pairs")
    }
    else{
        println("The Numbers $input1 and $input2 are Not Friendly Pairs")
    }
}
fun getFactorSum(num:Int):Int{
    var sum = 0
    for (i  in 1 until num){
        if ((num%i) == 0){
            sum += i
        }
    }
    return sum
}