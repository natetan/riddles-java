/**
 * Yulong Tan
 * 11.26.16
 *
 * Riddle class stores a riddle's text, answer, and number
 */

public class Riddle {

    private String riddle;
    private String answer;
    private int number;

    public Riddle(String riddle, String answer, int number) {
        this.riddle = riddle;
        this.answer = answer;
        this.number = number;
    }

    public String getRiddle() {
        return this.riddle;
    }

    public String getAnswer() {
        return this.answer;
    }

    public int getNumber() {
        return this.number;
    }

    public String toString() {
        return "Riddle:\t" + this.riddle + "\n" +
                "Answer:\t" + this.answer + "\n" +
                "Riddle number:\t" + this.number;
    }
}
