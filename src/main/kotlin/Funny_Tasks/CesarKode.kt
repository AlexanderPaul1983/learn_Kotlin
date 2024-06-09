package Funny_Tasks

class CesarKode {
    fun creapt(word_to_creapt: String, number: Int){
        for (buchstaben in word_to_creapt){
            print(buchstaben + number)
        }
    }
    fun entcreapt(word_to_creapt: String, number: Int){
        for (buchstaben in word_to_creapt){
            print(buchstaben - number)
        }
    }
}