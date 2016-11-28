import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yulong on 11/26/16.
 */

public class RiddleManager {

	public static final String FILE = "riddles.txt";

	private List<Riddle> riddles;

	public RiddleManager() {
		this.riddles = new ArrayList<>();
		try {
			Scanner file = new Scanner(new File(FILE));
			int count = 1;
			while (file.hasNextLine()) {
				String riddle = file.nextLine();
				String answer = file.nextLine();
				riddles.add(new Riddle(riddle, answer, count));
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getRiddle() {
		int rand = (int) (Math.random() * this.riddles.size());
		return this.getRiddle(rand);
	}

	public String getRiddle(int riddleNumber) {
		if (riddleNumber < 0 || riddleNumber >= this.riddles.size()) {
			throw new IllegalArgumentException("Number is invalid");
		}
		return this.riddles.get(riddleNumber).toString();
	}

	public int numberOfRiddles() {
		return this.riddles.size();
	}
}
