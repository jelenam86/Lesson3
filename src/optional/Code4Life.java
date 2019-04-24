package optional;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("How many hours you spent coding this week?");
		int hours = Integer.parseInt(answer);

		if (hours > 2) {
			JOptionPane.showMessageDialog(null, "You are a Code Ninja.");
			if (hours > 5)
				playBatmanTheme();
		} else
			JOptionPane.showMessageDialog(null, "Stop watching YouTube and write some code instead.");
	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}