import java.util.HashSet;

public class Quiz {
    HashSet<Question> questions;

    public Quiz(){

        Question q1 = new Question("How much is 2+2");
        q1.addAnswer('a', "4");
        q1.addIncorrectAnswer('b', "5");
        q1.addIncorrectAnswer('c', "6");
        q1.addIncorrectAnswer('d', "7");

        Question q2 = new Question("The correct names of the months of the year:");
        q2.addAnswer('a', "June");
        q2.addAnswer('b', "July");
        q2.addAnswer('c', "February");
        q2.addIncorrectAnswer('d', "Moonshine");

        Question q3 = new Question("How many fingers do you have on one hand?");
        q3.addAnswer('a', "5");
        q3.addIncorrectAnswer('b', "4");
        q3.addIncorrectAnswer('c', "6");

        Question q4 = new Question("What is fruit?");
        q4.addAnswer('a', "Apple");
        q4.addAnswer('b', "Banana");
        q4.addAnswer('c', "Tomato");

        questions = new HashSet<>();
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);

        }

    public HashSet<Question> getQuestions() {
        return questions;
    }
    public int getSizeOfQuestionsList(){
        return questions.size();
    }
}

