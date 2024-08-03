package Arrays

fun main() {
    var digits = intArrayOf(9, 8, 9, 9, 9)
    println(plusOne(digits).contentToString())
}

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.indices.reversed()) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
    }

    val newDigits = IntArray(digits.size + 1)
    newDigits[0] = 1
    return newDigits
}
