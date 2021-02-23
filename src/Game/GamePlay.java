package Game;

public class GamePlay {
    int numberOfPlayers;
    int numberOfQuestions;

    GamePlay(int numberOfPlayers, int numberOfQuestions){

        this.numberOfPlayers = numberOfPlayers;
        this.numberOfQuestions = numberOfQuestions;
    }

    public void setQuestions(int numberOfQuestions){
        for (int i = 1; i < numberOfQuestions + 1; i++){
            System.out.println("Detta är fråga " + i);
        }
    }

    public void gameProgress(){

        //for arraylängd med frågor{
        //random fråga från array
        //spelare 1 --> sista besvarar
        //ta bort frågan

    }


}
