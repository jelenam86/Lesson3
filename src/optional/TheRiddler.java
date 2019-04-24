package optional;

import javax.swing.JOptionPane;

public class TheRiddler {

	// Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

	public static void main(String[] args) {

		int score = 0;
		String[] riddles = new String[10];
		String[] answers = new String[10];

		riddles[0] = "What can travel around the world while staying in a corner?";
		answers[0] = "a stamp";

		riddles[1] = "What has hands but can not clap?";
		answers[1] = "a clock";

		riddles[2] = "You can drop me from the tallest building and I'll be fine, \nbut if you drop me in water I die. What am I?";
		answers[2] = "paper";

		riddles[3] = "Forward I am heavy, but backward I am not. What am I?";
		answers[3] = "forward I am ton, backwards I am not";

		riddles[4] = "Imagine you are in a dark room. How do you get out?";
		answers[4] = "stop imagining.";

		riddles[5] = "What occurs once in every minute, twice in every moment, yet never in a thousand years?";
		answers[5] = "the letter m";

		riddles[6] = "Alive without breath,\n" + "As cold as death;\n" + "Never thirsty, ever drinking,\n"
				+ "All in mail never clinking.\n\n" + "\"The Hobbit\" by J. R. R. Tolkien";
		answers[6] = "fish";

		riddles[7] = "What is always coming but never arrives?";
		answers[7] = "tomorrow";

		riddles[8] = "What invention lets you look right through a wall?";
		answers[8] = "a window";

		riddles[9] = "Paul's height is six feet, he's an assistant at a butcher's shop, \nand wears size 9 shoes. What does he weigh?";
		answers[9] = "meat";

		for (int i = 0; i < riddles.length; i++) {
			String answer = JOptionPane.showInputDialog(riddles[i]);
			if (answer.equals(answers[i])) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
			} else {
				JOptionPane.showMessageDialog(null, "Wrong!");
				JOptionPane.showMessageDialog(null, "Correct answer is: " + answers[i]);
			}
		}

		JOptionPane.showMessageDialog(null, "Your score: " + score + "/" + riddles.length);

	}
}