package optional;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {

	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018

		for (int i = 0; i < 10; i++) {
			int randomNumber = new Random().nextInt(5);
			System.out.println(randomNumber);

			if (randomNumber == 0)
				JOptionPane.showMessageDialog(null, "You! You are great!");
			else if (randomNumber == 1)
				JOptionPane.showMessageDialog(null, "You're a gift to those around you.");
			else if (randomNumber == 2)
				JOptionPane.showMessageDialog(null, "You should be proud of yourself.");
			else if (randomNumber == 3)
				JOptionPane.showMessageDialog(null, "You should be thanked more often. So thank you!!");
			else
				JOptionPane.showMessageDialog(null, "There's ordinary, and then there's you.");
		}
	}
}
