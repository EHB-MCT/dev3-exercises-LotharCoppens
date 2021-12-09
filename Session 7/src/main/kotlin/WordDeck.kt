class WordDeck {
    var wordDeck = setOf<Word>(
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
    var filteredWords: MutableSet<Word> = mutableSetOf()

    fun filterByLanguage(language: String) {
        filteredWords = wordDeck.filter { it.language == language}.toMutableSet()
    }

    fun reset() {
        filteredWords = wordDeck as MutableSet<Word>
    }
}