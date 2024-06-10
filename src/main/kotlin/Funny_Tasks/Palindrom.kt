package Funny_Tasks

import java.util.*

class Palindrom {
    fun palindromChecker(sentence: String): String {
        val toUpperCaseSentence = sentence.lowercase()
        val sentenceReverse = toUpperCaseSentence.reversed()
        return if (sentenceReverse.equals(toUpperCaseSentence)) "Das ist ein Palindrom" else "Das ist kein Palindrom"

    }
}

fun main(){
    val pal = Palindrom()
    println(pal.palindromChecker(" "))
}