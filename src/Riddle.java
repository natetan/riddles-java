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
}
