package com.example.rockpaperscissors

fun main(){

    var computerChoice = ""
    var playerChoice = ""
    var validInput = false

    while(!validInput) {
        println("Rock, Paper or Scissors? Enter your choice!")
        playerChoice = readln().trim()

        if (playerChoice == "Rock" || playerChoice == "Paper" || playerChoice == "Scissors") {
            validInput = true
        } else {
            println("Invalid input. Please enter Rock, Paper or Scissors exactly as shown")
        }
    }

    val randomNumber = (1 .. 3).random()

    computerChoice = when(randomNumber) {
        1 -> {
            "Rock"
        }
        2 -> {
            "Paper"
        }
        else -> {
            "Scissors"
        }
    }
    println(computerChoice)

    val winner = when{
        playerChoice == computerChoice  -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    if(winner == "Tie") {
        println("It's a tie")
    }else{
        println("$winner won!")
    }
}