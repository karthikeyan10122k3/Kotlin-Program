fun main() {
    // variable declaration
    val name = "Karthikeyan R"
    val age = 20
    val degree = "BTech"
    val branch = "Information Technology"
    val college = "Velammal Engineering College"
    val male = true

    // when function
    val gender:String = when(male) {
        true -> printMale()
        else -> printFemale("Female")
    }

    val gpa: Array<Double> = arrayOf(8.4, 8.3, 8.15, 7.92)
    var totGPA: Double = 0.0;

    //Arrays inbuilt "foreach" method
    // has a default "it" name for each element in array , which can be used for parsing
    //can also use variable of our wish
    gpa.forEach {
        totGPA += it
    }
//    gpa.forEach { i ->
//        totGPA +=i
//    }
    val cumulativeGPA = totGPA/gpa.size

    println("I my Name is $name $age years old $gender, Pursuing $degree in the field of $branch at $college with CPGA $cumulativeGPA ")

    //Mapof() - immutable
    // mutablemapOf() - mutable

    val skills = mutableMapOf(1 to "JAVA" , 2 to "Kotlin" , 3 to "HTML" , 4 to "CSS" , 5 to "JavaScript")
    println("Skills :")
    skills.forEach { (number, skill) ->
        println("$number : $skill")
    }

    // List
    val hobbies = listOf("walking","playing","reading Manga","youtube")
    println("Hobbies:")
    printHobbies(bullet ="*" ,hobbies)

}
// Functions
fun printMale() = "Male"
fun printFemale( female:String ):String {

    return female

}

fun printHobbies(bullet: String, vararg hobbies: List<String>){
    for (hobby in hobbies){
        println("$bullet $hobby")
    }
}

