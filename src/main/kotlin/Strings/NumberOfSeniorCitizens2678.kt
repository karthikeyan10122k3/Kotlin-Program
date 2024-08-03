package Strings

class NumberOfSeniorCitizens2678 {

    fun countSeniors(details: Array<String>): Int {
        return details.count {
            it[11] > '6' || (it[11] == '6' && it[12] > '0')
        }
    }
}
fun main(){
    val numCitizen = NumberOfSeniorCitizens2678()
    val details = arrayOf("7868190130M7522", "5303914400F9211", "9273338290F4010")
    println(numCitizen.countSeniors((details)))
}