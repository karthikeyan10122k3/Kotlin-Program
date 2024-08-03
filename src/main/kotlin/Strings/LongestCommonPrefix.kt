package Strings

fun main() {
    val strs = arrayOf("flower","flow","flight")
    println(longestCommonPrefix(strs))
}
fun longestCommonPrefix(strs: Array<String>): String {

    var prefix: String = strs[0]

    for (i in 1 until strs.size) {
        while (strs[i].indexOf(prefix) != 0){
            prefix = prefix.substring(0,prefix.length - 1);
        }
    }

    return prefix;
}
