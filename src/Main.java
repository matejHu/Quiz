import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        HashSet<Question> questions;
        int qCount;
        int points = 0;

        Question q1 = new Question("How much is 2+2");
        q1.addCorrectAnswer('a', "4", true);
        q1.addIncorrectAnswer('b', "5", false);
        q1.addIncorrectAnswer('c', "6", false);
        q1.addIncorrectAnswer('d', "7", false);

        Question q2 = new Question("The correct names of the months of the year:");
        q2.addCorrectAnswer('a', "June", true);
        q2.addCorrectAnswer('b', "July", true);
        q2.addCorrectAnswer('c', "February", true);
        q2.addIncorrectAnswer('d', "Moonshine", false);

        Question q3 = new Question("How many fingers do you have on one hand?");
        q3.addCorrectAnswer('a', "5", true);
        q3.addIncorrectAnswer('b', "4", false);
        q3.addIncorrectAnswer('c', "6", false);

        Question q4 = new Question("What is fruit?");
        q4.addCorrectAnswer('a', "Apple", true);
        q4.addCorrectAnswer('b', "Banana", true);
        q4.addCorrectAnswer('c', "Tomato", true);

        questions = new HashSet<>();
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);

        qCount = questions.size();

        StringBuilder answers = new StringBuilder();
        q4.getText();
        q4.printAllAnswers();
        System.out.print("Odpověď: ");
        String answer = scanner.nextLine();

        System.out.println("Vaše odpověď je správná v tolika bodech: "+countCommonCharacters(answer, q4.joinCorrectAnswerLetters()) + " z " + q4.getSizeofCorrectAnswers());

    }
    public static int countCommonCharacters(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}