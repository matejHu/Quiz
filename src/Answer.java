public class Answer {
    private String text;
    private char letter;
    private boolean isTrue;

    public Answer(char letter, String text, boolean isTrue){
        this.letter = letter;
        this.text = text;
        this.isTrue = isTrue;
    }
    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter){
        this.letter = letter;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean isTrue) {
        this.isTrue = isTrue;
    }
}
