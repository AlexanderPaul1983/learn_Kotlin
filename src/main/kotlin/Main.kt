fun main(args: Array<String>) {

proofNumber(0)

}
// Aufgabe 1
var result = 0.0
fun addition (number: Int, number2: Int){
    result = number.toDouble() + number2.toDouble()
    println(result)
}
fun substraction(number1: Int, number2: Int){
    result = number1.toDouble() - number2.toDouble()
    println(result)
}
fun division (number1: Int, number2: Int){
    if(number2 == 0){
        println("Invalid division through 0")
    }
    else{
        result = number1.toDouble() / number2.toDouble()
        println(result)
    }
}
// Aufgabe 2 Aufgabe: Schreibe ein Programm, das zwei Strings als Eingabe nimmt und prüft, ob sie gleich sind oder nicht. Gib das Ergebnis aus.

fun toCompareStrings(word1: String, word2: String){
    if(word1.length == word2.length){
        println("The words \"$word1\" and \"$word2\" are equal.")
    }
    else if(word1.length > word2.length){
        println("The word $word1 is longer than $word2")
    }
    else{
        println("The word $word2 is longer than $word1")
    }
}

// Aufgabe 3
var calArray = intArrayOf(5, 6, 4, 5, 2, 6, 8, 4, 6, 10)

fun findSumAndAvarange(numbers: IntArray){
    val sum = calArray.sum()
    val avarage = calArray.average()
    println("The sum is $sum")
    println("The avarage is $avarage")
}
// Aufgabe 4 Aufgabe: Schreibe ein Programm, das eine Zahl als Eingabe nimmt und prüft, ob sie positiv, negativ oder null ist.
fun proofNumber(num: Int){
    if(num == 0){
        println("Es ist eine Null")
    }
    else if (num > 0){
        println("Die Zahl $num ist positiv")
    }
    else println("Die Zahl $num ist nagativ")
}