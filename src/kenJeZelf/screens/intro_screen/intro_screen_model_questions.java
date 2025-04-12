package kenJeZelf.screens.intro_screen;

import kenJeZelf.models.model_all.masterlabel;

import javax.swing.*;

public class intro_screen_model_questions {

	// Maak teller een veld (klassevariabele)
	private static int teller = 0;

	public static void questionHandeler(JTextField textField, masterlabel label) {
		String[] questons = {
				"what is your last name",
				"what is your date of birth",
				"what is your age",
				"what is your gender",
				"what country are you from",
				"have school or work or both",
				"morning or evening person",
				"what language do you speak",
				"what is your favorite color"
		};

		if (textField.getText().equals("") || textField.getText().equals("Enter something in the text field")) {
			textField.setText("Enter something in the text field");
			System.out.println("false");
		} else {
			if (teller < questons.length) {
				label.getMasterLabel().setText(questons[teller]);
				System.out.println("teller: " + teller);
				teller++;
			} else {
				label.getMasterLabel().setText("You have answered all questions.");
				System.out.println("End of questions.");
			}
		}
	}
}
