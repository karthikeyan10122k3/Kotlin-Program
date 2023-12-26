fun main() {
    print("Enter a Number: ")
    val input = readln().toInt()

    if (input!=0){
        val result = (input * input).toString()
        if (result.endsWith("$input")){
            println("It is Automorphic Number!")
        }
        else{
            println("It is Not Automorphic Number!")
        }
    }
}