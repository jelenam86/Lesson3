package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {

		int rand = new Random().nextInt();

		String answer = JOptionPane.showInputDialog("Guess is next number higher or lower than " + rand);
		int number = new Random().nextInt();

		if ((answer.equals("higher") && number > rand) || (answer.equals("lower") && number < rand)) {
			JOptionPane.showMessageDialog(null, "Correct! Next number is " + number);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! Next number is " + number);
		}
	}
}
