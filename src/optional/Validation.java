package optional;

import java.util.Random;

//import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class Validation {

	public static void main(String[] args) throws InterruptedException {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018

		for (int i = 0; i < 10; i++) {
			int randomNumber = new Random().nextInt(5);
			System.out.println(randomNumber);

			if (randomNumber == 0)
				//JOptionPane.showMessageDialog(null, "You! You are great!");
				speak("You! You are great!");
			else if (randomNumber == 1)
				//JOptionPane.showMessageDialog(null, "You're a gift to those around you.");
				speak("You're a gift to those around you.");
			else if (randomNumber == 2)
				//JOptionPane.showMessageDialog(null, "You should be proud of yourself.");
				speak("You should be proud of yourself.");
			else if (randomNumber == 3)
				//JOptionPane.showMessageDialog(null, "You should be thanked more often. So thank you!!");
				speak("You should be thanked more often. So thank you!!");
			else
				//JOptionPane.showMessageDialog(null, "There's ordinary, and then there's you.");
				speak("There's ordinary, and then there's you.");
		}
	}

	static void speak(String words) throws InterruptedException {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
		Thread.sleep(4000);
	}
}
