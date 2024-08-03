package numbers

class ReverseInteger7 {
    fun reverse(x: Int): Int {
        var reverseNumber = 0
        var temp = x

        while (temp != 0) {
            val rem = temp % 10

            if (reverseNumber > Int.MAX_VALUE / 10 || (reverseNumber == Int.MAX_VALUE / 10 && rem > 7)) {
                return 0
            }
            if (reverseNumber < Int.MIN_VALUE / 10 || (reverseNumber == Int.MIN_VALUE / 10 && rem < -8)) {
                return 0
            }

            reverseNumber = reverseNumber * 10 + rem
            temp /= 10
        }
        return reverseNumber
    }
}

fun main() {
    val obj = ReverseInteger7()
    val x = 1534236469
    println(obj.reverse(x)) // Should print 0 due to overflow
}
