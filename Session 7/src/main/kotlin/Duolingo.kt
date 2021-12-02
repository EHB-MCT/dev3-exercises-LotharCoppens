class Duolingo (){
    var rounds:Int = 5
    var difficutly:String = "easy"
    var language:String = "English"

    val words = setOf<Word>(
        EnglishWord("boat", "boot"),
    EnglishWord("shovel", "schup"),
    EnglishWord("sword", "zwaard"),
    EnglishWord("bucket", "emmer"),
    FrenchWord("pain", "brood"),
    FrenchWord("oreille", "oor"),
    FrenchWord("table", "tafel"),
    FrenchWord("lapin", "konijn"),
    EnglishWord("floor", "vloer"),
    FrenchWord("feu", "vuur")
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