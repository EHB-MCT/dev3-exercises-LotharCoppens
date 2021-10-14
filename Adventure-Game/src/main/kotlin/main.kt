fun main() {
    println("Eron: Hey you, you’re finally awake. You were trying to cross the border, right? Walked right into that Imperial ambush, same as us, and that thief over there. Damn you Stormcloaks. Skyrim was fine until you came along.")


    challengeOne()
}

fun challengeOne(){
    println("Eron: Want to know more about what happend?")
    println("Eron: answer my question: The one who made it doesn't need it, the one who buys it doesn't buy it for himself, and the one who needs it doesn't know he needs it.")

    val answers = setOf<String>("Coffin", "coffin")
    val userAnswer = readLine()

    if (answers.contains(userAnswer)){
        winOne()
    } else {
        gameOverOne()
    }
}

fun winOne() {
    println("Eron: Good Answer you may proceed")
    challengeTwo()
}
fun gameOverOne(){
    println("Eron: Wrong")
}
fun challengeTwo(){
    println("Eron: Lets go talk to the High King and prove your worth")
    println("High King: So I heard you we're trying to cross the border, and i will let you pass it if you can tell me what my real name is")
    println("High King: I have a heart that never beats, I have a home but I never sleep. I can take a mans house and build anothers, And I love to play games with my many brothers. I am a king among fools. Who am I?")

    val answersTwo = setOf<String>("King of hearts", "The King of Hearts", "king of hearts")
    val userAnswer = readLine()

    if (answersTwo.contains(userAnswer)){
        winTwo()
    } else {
        gameOverOne()
    }


}

fun winTwo(){
    println("Correct")

    challengeThree()
}

fun challengeThree(){
    print("guess the correct dice roll to proceed")

    val dice1 = (Math.random() * 6 + 1).toInt()
    System.out.println("Roll: total = " +dice1)

    val low: IntArray = intArrayOf(1, 2, 3)
    val high: IntArray = intArrayOf(4, 5, 6)

    if (dice1 == low){
        winThree()
    } else{
        gameOverOne()
    }

}

fun winThree(){
    print("You guessed correctly")

}

