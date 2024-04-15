import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        HashSet<Question> questions = quiz.getQuestions();

        Scanner scanner = new Scanner(System.in);

        Iterator<Question> iterator = questions.iterator();

        int questionCounter = 0;

        while (iterator.hasNext()) {
            Question question = iterator.next();
            System.out.println("Question: " + question.getText());
            System.out.println("Answers:");
            for (Answer answer : question.getAnswers()) {
                System.out.println(answer.getLetter() + ") " + answer.getText());
            }
            System.out.print("Your answer (enter the letter): ");
            String userAnswer = scanner.nextLine();

            // Check if the user's answer is correct
            if (userAnswer.equals(question.joinCorrectAnswerLetters())) {
                questionCounter++;
                System.out.println("Correct!");
                System.out.println("Counter of right answers: " + countCommonCharacters(question.joinCorrectAnswerLetters(), userAnswer) + "/" + question.getSizeofCorrectAnswers());
                System.out.println("Correct questions total: " + questionCounter);
            } else {
                System.out.println("Incorrect!");
                System.out.println("Counter of right answers: " + countCommonCharacters(question.joinCorrectAnswerLetters(), userAnswer) + "/" + question.getSizeofCorrectAnswers());
            }

            // Check if there are more questions
            if (iterator.hasNext()) {
                System.out.println("Press Enter to continue to the next question...");
                scanner.nextLine(); // Wait for user to press Enter
            } else {
                System.out.println("End of quiz.");
                System.out.println("You were correct in " + questionCounter + "/" + questions.size() + " of total number of questions");
            }
        }

        scanner.close();
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
