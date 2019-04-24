package optional;

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;
		isVacation = false;
		int answer2 = 1;

		int answer1 = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);

		if (answer1 == 0)
			isWeekday = true;
		else
			isWeekday = false;

		if (isWeekday) {
			answer2 = JOptionPane.showConfirmDialog(null, "are we on vacation?", "", JOptionPane.YES_NO_OPTION);
			if (answer2 == 0)
				isVacation = true;
		}

		if (isVacation || !isWeekday)
			JOptionPane.showMessageDialog(null, "sleep in");
		else
			JOptionPane.showMessageDialog(null, "get up lazybones!");
	}
}
