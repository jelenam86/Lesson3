package optional;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		String momsBirthday = "Septmber 21th";
		String dadsBirthday = "March 5th";
		String myBirthday = "September 4th";

		String answer = JOptionPane.showInputDialog("Which birthday you want to know?");

		JOptionPane.showMessageDialog(null, "You typed: " + answer);

		if (answer.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		} else if (answer.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		} else if (answer.equals("Jelena")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}
	}
}
