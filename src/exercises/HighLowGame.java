package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {

		int rand = new Random().nextInt(100) + 1;
		System.out.println(rand);
		int number = 0;

		for (int i = 0; i < 5; i++) {
			String answer = JOptionPane.showInputDialog("Guess number between 1 and 100");
			number = Integer.parseInt(answer);

			if (number > rand && i != 4)
				JOptionPane.showMessageDialog(null, number + " is too high. " + (5 - i - 1) + " more tries.");
			else if (number < rand && i != 4)
				JOptionPane.showMessageDialog(null, number + " is too low. " + (5 - i - 1) + " more tries.");
			else
				break;
		}

		if (number == rand)
			JOptionPane.showMessageDialog(null, "You won!");
		else
			JOptionPane.showMessageDialog(null, "You lose!");

	}
}
