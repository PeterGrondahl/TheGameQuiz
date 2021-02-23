package Game;

public abstract class QuestionBlueprint {
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;


    QuestionBlueprint(String question, String optionA, String optionB, String optionC, String optionD, String answer)
    {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
    }

}
