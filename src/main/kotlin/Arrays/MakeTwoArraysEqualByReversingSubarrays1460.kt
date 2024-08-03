package Arrays

class MakeTwoArraysEqualByReversingSubarrays1460 {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        val map = hashMapOf<Int,Int>();

        for (i in target){
            map[i] = map.getOrDefault(i,0) + 1
        }
        for (i in arr){
            val count = map.getOrDefault(i,0)
            if (count == 0){
                return false
            }
            map[i] = count - 1
        }
        return true
    }
}

fun main() {
    val obj = MakeTwoArraysEqualByReversingSubarrays1460()
    val target = intArrayOf(7)
    val arr = intArrayOf(7);
    println(obj.canBeEqual(target, arr))

}
