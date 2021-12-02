class Duolingo {
    fun play(){
        val boat = Word("boat", "boot", "Engels")
        val shovel = Word("shovel", "schup", "Engels")
        val sword = Word("sword", "zwaard", "Engels")
        val bucket = Word("bucket", "emmer", "Engels")
        val pain = Word("pain", "brood", "Frans")
        val oreille = Word("oreille", "oor", "Frans")
        val table = Word("table", "tafel", "Engels")
        val lapin = Word("lapin", "konijn", "Frans")
        val floor = Word("floor", "vloer", "Engels")
        val fire = Word("fire", "vuur", "Engels")
        println(fire.original)

        val list = listOf(fire.original,floor.original,lapin.original,table.original,oreille.original,pain.original,boat.original,bucket.original,shovel.original,sword.original)
        val numberOfElements = 5

        val randomElements = list.asSequence().shuffled().take(numberOfElements).toList()
        println(randomElements)

    }
}