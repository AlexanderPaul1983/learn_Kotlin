package Funny_Tasks

class Fakulteat {
    fun calculateFakult(facultynumber: Int){
        var ergebnis = 1

        for (malty in 2..facultynumber){
            ergebnis = malty * ergebnis
        }
        println("Das Fakultät von $facultynumber ist $ergebnis.")
    }
}

fun main(args: Array<String>){
    var falc = Fakulteat()
    falc.calculateFakult(0)
}