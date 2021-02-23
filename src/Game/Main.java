package Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner gameOptions = new Scanner(System.in);
        System.out.println("Hur många spelar är ni?");
        int numberOfPlayers = gameOptions.nextInt();
        System.out.println("Hur många frågor vill ni ha?");
        int numberOfQuestions = gameOptions.nextInt();

        GamePlay gamePlay = new GamePlay(numberOfPlayers, numberOfQuestions);
        System.out.println("Spelläge: " + gamePlay.numberOfPlayers + " spelare!");
        System.out.println("Spellängd: " + gamePlay.numberOfQuestions + " frågor!");
        gamePlay.setQuestions(gamePlay.numberOfQuestions);

    }
}
