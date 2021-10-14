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
    print("guess the correct dice roll to proceed ")

    val diceResult = (1..6).random()
    val userAnswer = readLine()
    var acceptedAnswers = setOf<Int>()

    if (userAnswer == "low") {
        acceptedAnswers = setOf(1,2,3)
    } else {
        acceptedAnswers = setOf(4,5,6)
    }

    if (acceptedAnswers.contains(diceResult)){
        winThree()
    } else {
        gameOverThree()
    }

}

fun gameOverThree(){
    println("Eron: Wrong, retry")
    challengeThree()
}


fun winThree(){
    print("You guessed correctly ")
    challengeFour()

}

fun challengeFour(){
    print("Lets pick a weapon you can wield to cross the border but be carfull if you pick the wrong one you could face some other options")
    print("1. Sword 2. Bow 3. Axe")
    val userAnswer = readLine()

    if (userAnswer == "Sword") {
        winFour()
    } else if (userAnswer == "Bow"){
        println("Too Bad, pick again")
        challengeFour()
    }else if (userAnswer == "Axe") {
        gameOverOne()
    }


}

fun winFour(){
    print("Great job! you will need that sharp bow to defeat the elder dragon you will have to defeat but to go into battle you have to guess the age of the dragon")

    val secretAge = (Math.random() * 100 + 1).toInt()

    var guess: Int
    var attempts=0

    while (true) {
        print("Enter your guess (1-100): ")
        guess = readLine()!!.toInt()

        when (guess.compareTo(secretAge)) {
            -1 -> { println("Too Young!"); attempts++ }
            0 -> { attempts++; println("Thats correct! He is $secretAge years old. You took $attempts guesses!"); return }
            1 -> { println("Too Old!"); attempts++ }
        }
    }

}

