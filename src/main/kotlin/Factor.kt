fun main() {
    print("Enter the Number: ")
    val input :Int = readln().toInt()

    val factors :HashSet<Int> = hashSetOf<Int>()

    for (i in 1..input){
        if ((input%i) == 0){
            factors.add(i)
        }
    }
    println("The Factors of $input are: ${factors.sorted()}")

}