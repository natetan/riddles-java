/**
 * Yulong Tan
 * 11.28.16
 *
 * RiddleManager reads riddles from a text file and loads them for use
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RiddleManager {

	// File to use
	public static final String FILE = "riddles.txt";

	// Stores the riddles
	private List<Riddle> riddles;

	// Reads the riddles from a text file and stores it
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
