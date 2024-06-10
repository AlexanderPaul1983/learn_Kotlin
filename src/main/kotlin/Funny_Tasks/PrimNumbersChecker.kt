package Funny_Tasks

class PrimNumbersChecker {
    fun checkPrimeNumber(numb: Int): String {
        var nextNumber = 2
        while (nextNumber < numb) {
            if (numb % nextNumber == 0) {
                return "The number $numb is not a prime!"
            } else if (numb - nextNumber == 1) {
                return "That is a prime"
            } else {
                nextNumber++
            }
        }
        if (numb < 3){
            return "The number $numb is not a prime!"
        }
        return "That is a prime"
    }

}




fun main(){
    var checkprime = PrimNumbersChecker()
    println(checkprime.checkPrimeNumber(10))
}