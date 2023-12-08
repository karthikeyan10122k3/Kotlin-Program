fun main() {
    print("Enter Input : ")
    val input = readln()
    val alphabetSet = hashSetOf<Char>()

    for (i in 'a'..'z'){
        alphabetSet.add(i)
    }
    var inputSet = hashSetOf<Char>()
    for (i in input )
        if (!i.isWhitespace()){
            inputSet.add(i.lowercaseChar())
        }
    if (inputSet == alphabetSet){
        println("Pangram!")
    }
    else{
        println("Not Pangram")
    }
}


