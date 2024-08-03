package Arrays

fun main() {
    val nums= intArrayOf(3,1,-2,-5,2,-4)

    println( println(rearrangeArray(nums).contentToString()))
}

fun rearrangeArray(nums: IntArray): IntArray {
    val rearrangedArray = IntArray(nums.size)
    var positivePointer = 0
    var negativePointer = 1

    for ( num in nums){
        if (num > 0) {
            rearrangedArray[positivePointer] = num
            positivePointer += 2
        } else {
            rearrangedArray[negativePointer] = num
            negativePointer += 2
        }
    }
    return rearrangedArray
}