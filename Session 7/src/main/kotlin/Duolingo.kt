class Duolingo (){
    val words = setOf<Word>(
        Word("boat", "boot", "Engels"),
    Word("shovel", "schup", "Engels"),
    Word("sword", "zwaard", "Engels"),
    Word("bucket", "emmer", "Engels"),
    Word("pain", "brood", "Frans"),
    Word("oreille", "oor", "Frans"),
    Word("table", "tafel", "Frans"),
    Word("lapin", "konijn", "Frans"),
    Word("floor", "vloer", "Engels"),
    Word("feu", "vuur", "Frans")

    )
    fun play(){
        println("how many words would you like per round?")
        val roundsize = readLine()
        println("What language do you want?")
        val filter = readLine()
        val randomWords = words.filter { it.language == filter}.shuffled().take(roundsize!!.toInt()).toMutableSet()


        while (randomWords.isNotEmpty()){

        val randomWord = randomWords.random()
        println("What is the translation for " + randomWord.original)
        val userAnswer = readLine()

        if(randomWord.translated == userAnswer){
            println("Correct")
            randomWords.remove(randomWord)

        }else{
            println("Wrong it was " +randomWord.translated)
        }
        println("you have " + randomWords.count() + " Left")

    }
        println("You made it!")
    }
}