package Arrays

import kotlin.math.abs

fun main() {
    val nums = intArrayOf(-4,-2,1,4,8)

    println(findClosestNumber(nums ))
}

fun findClosestNumber(nums: IntArray): Int {
    var closest = nums[0]

    for (num in nums) {
        if (abs(num) < abs(closest)) {
            closest = num
        } else if (abs(num) == abs(closest) && num > closest) {
            closest = num
        }
    }

    return closest
}