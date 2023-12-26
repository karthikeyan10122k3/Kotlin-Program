package basics

import java.lang.StringBuilder

fun main() {
    print("Enter String 1: ")
    val inputString1 = "anagram"
    print("Enter String 2: ")
    val inputString2 = "granaam"

//Method-1
    var temp:Char

    val builderString1 = StringBuilder(inputString1)
    val builderString2 = StringBuilder(inputString2)

    for (i in builderString1.indices){
        for (j in i+1 until builderString1.length){
            if (builderString1[j] < builderString1[i]){
                temp = builderString1[i]
                builderString1[i] = builderString1[j]
                builderString1[j] = temp
            }
        }
    }
    for (i in builderString2.indices){
        for (j in i+1 until builderString2.length){
            if (builderString2[j] < builderString2[i]){
                temp = builderString2[i]
                builderString2[i] = builderString2[j]
                builderString2[j] = temp
            }
        }
    }
    val builderString1toString1 = builderString1.toString()
    val builderString1toString2 = builderString2.toString()

//    println("Sorted String 1: $builderString1toString1")
//    println("Sorted String 2: $builderString1toString2")

// Method-2
    val string1 = inputString1.toCharArray()
    val string2 = inputString2.toCharArray()

    val sortedString1 = string1.sorted()
    val sortedString2 = string2.sorted()

//    println("Sorted String 1: $sortedString1")
//    println("Sorted String 2: $sortedString2")

    if ((sortedString1 == sortedString2) && (builderString1toString1 == builderString1toString2)){
        println("Anagram")
    }
    else {
        println("Not Anagram")
    }

}