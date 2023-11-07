// EX04_GRA_DorangoPJP
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04_gra_dorangopjp;
import java.util.Scanner;

/**
 *
 * @author pj
 */
public class EX04_GRA_DorangoPJP {
    static Scanner sc = new Scanner(System.in);
    private static int roundsToWin = 2;
    
    static Move rock = new Move("Rock");
    static Move paper = new Move("Paper");
    static Move scissors = new Move("Scissors");
    
    public static void main(String[] args) {
        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        while (true) {
            mainMenu();
        }
    }
    
    public static void mainMenu() {
        System.out.println("Welcome to Rock, Paper, Scissors! Please choose an option:");
        System.out.println("1. Start Game");
        System.out.println("2. Change number of rounds");
        System.out.println("3. Exit application");
        
        System.out.print("> ");
        String userInput = sc.nextLine();
        
        System.out.println("\n---------------------------\n");
        
        // User input evaluation
        
        if (userInput.equals("1") 
                || userInput.equalsIgnoreCase("start") 
                || userInput.equalsIgnoreCase("start game")) {
            startGame();
        } else if (userInput.equals("2")
                || userInput.equalsIgnoreCase("change")
                || userInput.equalsIgnoreCase("change number of rounds")
                || userInput.equalsIgnoreCase("change rounds")
                || userInput.equalsIgnoreCase("settings")) {
            settings();
        } else if (userInput.equals("3")
                || userInput.equalsIgnoreCase("exit")
                || userInput.equalsIgnoreCase("done")) {
            exit();
        } else {
            System.out.println("That is not one of the options.");
        }
        
        System.out.println("\n---------------------------\n");
    }
    
    public static void startGame() {
        int userRoundsWon = 0;
        int computerRoundsWon = 0;
        
        System.out.println("This match is first to " + roundsToWin + " wins.");
        
        while (userRoundsWon < roundsToWin && computerRoundsWon < roundsToWin) {
            Move userMove;
            Move computerMove;
            
            System.out.println("Player: " + userRoundsWon + " - Computer: " + computerRoundsWon);
            System.out.println("The computer has selected its move. Select your move:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.print("> ");
            
            String computerChoice = Integer.toString((int) Math.floor(Math.random()*3) + 1);
            
            String userInput = sc.nextLine();
            userMove = getMoveChoice(userInput);
            computerMove = getMoveChoice(computerChoice);
            
            int winner = Move.compareMoves(userMove, computerMove);
            
            System.out.print("Player chose " + userMove.getName() + ", ");
            System.out.print("Computer chose " + computerMove.getName() + ". ");
            
            if (winner == 0) {
                System.out.println("Player won the round!");
                userRoundsWon++;
            } else if (winner == 1) {
                System.out.println("Computer won the round!");
                computerRoundsWon++;
            } else {
                System.out.println("It was a tie!");
            }
            
            System.out.println("\n---------------------------\n");
        }
        
        if (userRoundsWon > computerRoundsWon) {
            System.out.println("Congratulations! You won the game!");
        } else {
            System.out.println("You lost! The computer won the game.");
        }
    }
    
    public static void settings() {        
        System.out.println("How many rounds should it take to win?");
        System.out.print("> ");
        
        String userRoundsToWin = sc.nextLine();
        
        setRoundsToWin(userRoundsToWin);
    }
    
    public static void exit() {
        System.out.println("Thank you for playing!");
        System.exit(0);
    }
    
    public static Move getMoveChoice(String moveChoice) {
        Move move;
        
        if (moveChoice.equals("1")
                || moveChoice.equalsIgnoreCase("rock")) {
            move = rock;
        } else if (moveChoice.equals("2")
                || moveChoice.equalsIgnoreCase("paper")) {
            move = paper;
        } else if (moveChoice.equals("3")
                || moveChoice.equalsIgnoreCase("scissors")) {
            move = scissors;
        } else {
            System.out.println("This is an invalid move.");
            
            System.out.print("> ");
            String userInput = sc.nextLine();
            
            move = getMoveChoice(userInput);
        }
        
        return move;
    }
    
    // Setters
    
    public static void setRoundsToWin(String newRoundsToWin) {
        roundsToWin = Integer.parseInt(newRoundsToWin);
    }
    
    public static void setRoundsToWin(int newRoundsToWin) {
        roundsToWin = newRoundsToWin;
    }
}
