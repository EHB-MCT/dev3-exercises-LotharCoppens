class Duolingo (
    var roundsize: Int = 5,
    var language: String = "English"
){

    var words = WordDeck().wordDeck


    init{
        println("What language?")
        language = readLine().toString()
        if (language == "French" ||  language == "English" ) {
            words = words.filter { it.language == language }.toMutableSet()
        }else{
            throw Exception("No valid language")
        }
    }

    fun play(){
        val randomWords = words.shuffled().take(roundsize).toMutableSet()


        while (randomWords.isNotEmpty()){

        val randomWord = randomWords.random()
        println("What is the translation for " + randomWord.original)
        val userAnswer = readLine()

        if(randomWord.translated == userAnswer){
            println("Correct it was " +randomWord.translated)
            randomWords.remove(randomWord)
            if (randomWord.difficulty > 1){
                randomWord.difficulty--
            }else{
                randomWord.difficulty++

            }

        }else{
            println("Wrong it was " +randomWord.translated)
        }
        println("you have " + randomWords.count() + " Left")

    }
        println("You made it!")
    }
}