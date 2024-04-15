
import java.util.ArrayList;

public class Question {
    private String text;
    private int countAnswers;
    private ArrayList<Answer> Answers;


    public Question(String text) {
        this.text = text;
        this.Answers = new ArrayList<>();
    }

    //Přidá správnou odpověď
    public void addAnswer(char letter, String text) {
        Answers.add(new Answer(letter, text,true));
    }

    //Přidá špatnou odpověď
    public void addIncorrectAnswer(char letter, String text) {
        Answers.add(new Answer(letter, text,false));
    }

    //Vrátí všechny správné odpovědi
    public ArrayList<Answer> getAnswers() {
        return Answers;
    }

    //Vrátí všechny špatné odpovědi
    public ArrayList<Answer> getIncorrectAnswers() {
        return Answers;
    }

    //Vrátí text otázky
    public String getText() {
        return text;
    }


    //Vrátí počet všech odpovědí v seznamu
    public int getCountAnswers(){
        countAnswers = Answers.size();
        return countAnswers;
    }

    //Vrátí počet špatných odpovědí
    public int getSizeofInCorrectAnswers(){
        int counter = 0;
        for (Answer answer : Answers) {
            if(answer.isTrue() == false){
                counter++;
            }
        } return counter;
    }

    //Vrátí počet správných odpovědí v seznamu
    public int getSizeofCorrectAnswers(){
        int counter = 0;
        for (Answer answer : Answers) {
            if(answer.isTrue() == true){
                counter++;
            }
        } return counter;
    }

    //Vypíše seznam otázek
    public void printAllAnswers() {
        for (Answer answer : Answers) {
            System.out.println(answer.getLetter() + ")" + answer.getText());
        }
    }

    // Vrátí zřetězené písmena správných odpovědí
    public String joinCorrectAnswerLetters() {
        StringBuilder builder = new StringBuilder();
        for (Answer answer : Answers) {
            if (answer.isTrue() == true) {
                builder.append(answer.getLetter());
            }
        }
        return builder.toString();
    }
    //Vrátí zřetězené písmena špatných odpovědí
    public String joinInCorrectAnswerLetters() {
        StringBuilder builder = new StringBuilder();
        for (Answer answer : Answers) {
            if (answer.isTrue() == false) {
                builder.append(answer.getLetter());
            }
        }
        return builder.toString();
    }




}