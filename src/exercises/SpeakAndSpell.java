package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

/**
 * The first Speak & Spell was introduced at the summer Consumer Electronics
 * Show in June 1978, making it one of the earliest hand-held electronic devices
 * with a visual display to use interchangeable game cartridges. It was my
 * favorite game as a kid.
 * 
 * https://www.youtube.com/watch?v=qM8FcN0aAvU
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		
		int score = 0;
		
		speak("Spell mandlebrot");
		String answer1 = JOptionPane.showInputDialog("Type your answer:");
		if (answer1.equals("mandlebrot")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}

		speak("Spell handkerchief");
		String answer2 = JOptionPane.showInputDialog("Type your answer:");
		if (answer2.equals("handkerchief")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}

		speak("Spell rhythm");
		String answer3 = JOptionPane.showInputDialog("Type your answer:");
		if (answer3.equals("rhythm")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}

		speak("Spell occurred");
		String answer4 = JOptionPane.showInputDialog("Type your answer:");
		if (answer4.equals("occurred")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}

		speak("Spell millennium");
		String answer5 = JOptionPane.showInputDialog("Type your answer:");
		if (answer5.equals("millennium")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}

		JOptionPane.showMessageDialog(null, "Your score: " + score);
	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
