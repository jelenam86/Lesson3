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

		String[] words = { "mandlebrot", "handkerchief", "rhythm", "occurred", "millennium" };

		for (int i = 0; i < words.length; i++) {
			speak("Spell" + words[i]);
			String answer = JOptionPane.showInputDialog("Type your answer: ");
			if (answer.equals(words[i])) {
				score++;
				JOptionPane.showMessageDialog(null, "Correct");
			} else {
				JOptionPane.showMessageDialog(null, "Wrong");
			}
		}

		JOptionPane.showMessageDialog(null, "Your score: " + score + "/" + words.length);
	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
