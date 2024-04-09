
import java.util.ArrayList;

public class Question {
    private String text;
    private int countAnswers;
    private ArrayList<Answer> correctAnswers;
    private ArrayList<Answer> incorrectAnswers;

    public Question(String text) {
        this.text = text;

        this.correctAnswers = new ArrayList<>();
        this.incorrectAnswers = new ArrayList<>();
    }

    public void addCorrectAnswer(char letter, String text, boolean isTrue) {
        correctAnswers.add(new Answer(letter, text, isTrue));
    }

    public void addIncorrectAnswer(char letter, String text, boolean isTrue) {
        incorrectAnswers.add(new Answer(letter, text, isTrue));
    }

    public ArrayList<Answer> getCorrectAnswers() {
        return correctAnswers;
    }

    public ArrayList<Answer> getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public String getText() {
        return text;
    }

    public int getCountAnswers(){
        countAnswers = correctAnswers.size() + incorrectAnswers.size();
        return countAnswers;
    }
    public int getSizeofCorrectAnswers(){
        return correctAnswers.size();
    }


    public void printAllAnswers() {

        for (Answer answer : correctAnswers) {
            System.out.println(answer.getLetter() + ")" + answer.getText());
        }

        for (Answer answer : incorrectAnswers) {
            System.out.println(answer.getLetter() + ")" + answer.getText());
        }
    }

    public String joinCorrectAnswerLetters() {
        StringBuilder builder = new StringBuilder();
        for (Answer answer : correctAnswers) {
            builder.append(answer.getLetter());
        }
        return builder.toString();
    }




}