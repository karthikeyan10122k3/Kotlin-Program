package Arrays

fun main() {
    var array : IntArray= intArrayOf(0,1,2,2,3,0,4,2)
    val value = readln().toInt() // Element To remove

    println(removeElement(array,value))

}
fun removeElement(nums: IntArray, `val`: Int): Int {
    if (nums.isEmpty()) {
        return 0
    }

    var firstPointer = 0
    var secondPointer = nums.size - 1
    while (firstPointer <= secondPointer) {
        if (nums[firstPointer] == `val`) {
            nums[firstPointer] = nums[secondPointer]
            secondPointer--
        } else {
            firstPointer++
        }
    }
    return firstPointer

}
