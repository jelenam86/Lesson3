package optional;

import java.awt.Color;
import java.lang.reflect.Field;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {

	public static void main(String[] args) {

		Robot r = new Robot();
		int answer1 = 0; // Answer to question for more colors. Default answer is "yes".

		do {
			String answer = JOptionPane.showInputDialog("What color do you like the robot to draw a star?");
			Color color = Color.ORANGE;

			try {
				Field field = Class.forName("java.awt.Color").getField(answer);
				color = (Color) field.get(null);
			} catch (Exception e) {
				color = null;
			}

			if (answer.equals(""))
				r.setRandomPenColor();
			else {
				if (!answer.equalsIgnoreCase("orange") && color == null) {
					JOptionPane.showMessageDialog(null, "The robot doesn't recognize that color. So orange is chosen.");
					color = Color.ORANGE;
				}
				r.setPenColor(color);
			}

			r.setPenWidth(10);
			r.penDown();
			r.setSpeed(8);

			for (int i = 0; i < 5; i++) {
				r.move(100);
				r.turn(144);
			}

			answer1 = JOptionPane.showConfirmDialog(null, "Do you want robot to draw another star?", "",
					JOptionPane.YES_NO_OPTION);

			if (answer1 == 0) {
				r.setPos(new Random().nextInt(700) + 100, new Random().nextInt(400) + 100);
				r.setAngle(new Random().nextInt(360));
			}
		} while (answer1 == 0);
	}
}
