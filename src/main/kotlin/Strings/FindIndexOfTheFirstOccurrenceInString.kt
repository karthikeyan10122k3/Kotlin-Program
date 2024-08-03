package Strings

fun main() {

    val haystack = "sadbutsad"
    val needle = "sad"
    println(strStr(haystack,needle))
}

fun strStr(haystack: String, needle: String): Int {

    if (haystack.isEmpty() || needle.isEmpty()){
        return -1
    }
    val index = haystack.indexOf(needle);

    return index
}