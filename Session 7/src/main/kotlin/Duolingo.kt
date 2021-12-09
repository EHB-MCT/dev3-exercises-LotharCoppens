class Duolingo (
    val roundsize: Int = 5,
    var language: String = "English"
){


    var words = setOf<Word>(
        EnglishWord("boat", "boot", 1),
    EnglishWord("shovel", "schup", 1),
    EnglishWord("sword", "zwaard", 1),
    EnglishWord("bucket", "emmer", 2),
    FrenchWord("pain", "brood",2),
    FrenchWord("oreille", "oor",1),
    FrenchWord("table", "tafel",1),
    FrenchWord("lapin", "konijn",2),
    EnglishWord("floor", "vloer",1),
    FrenchWord("feu", "vuur",2)
    )

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