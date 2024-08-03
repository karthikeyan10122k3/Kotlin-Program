package Arrays

fun main() {
    val nums: IntArray = intArrayOf(1,3,5,6)
    val target = 7
    println(searchInsert(nums,target))
}
fun searchInsert(nums: IntArray, target: Int): Int {

    var startIndex = 0
    var endIndex = nums.size - 1
    while (startIndex <= endIndex){
        val midIndex = (startIndex + endIndex)/2
        if (nums[midIndex] == target){
            return midIndex
        }else if (nums[midIndex] <= target){
            startIndex = midIndex + 1
        }else{
            endIndex = midIndex - 1
        }
    }
    return startIndex
}