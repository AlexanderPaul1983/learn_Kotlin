package Funny_Tasks

class PrimNumbersChecker {
    fun checkPrimeNumber(numb: Int){
        var nextNumber = 2
        while (nextNumber < numb){
            if (numb % nextNumber == 0){
                println("The number $numb ist not a prime!")
                nextNumber = numb
            }
            else if (numb - nextNumber == 1){
                println("That is a prime")
                nextNumber++
            }
            else{
                nextNumber++
            }
        }
    }

}



fun main(){
    var checkprime = PrimNumbersChecker()
    checkprime.checkPrimeNumber(8)
}