package kenJeZelf.models.model_all;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class mastertextfield {
	private JTextField mastertextfield = new JTextField();

	Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);

	public mastertextfield(Color color) {
		mastertextfield.setEditable(true);
		mastertextfield.setFont(new Font("Arial", Font.PLAIN, 25));
		mastertextfield.setBorder(border);
		mastertextfield.setOpaque(true);
		mastertextfield.setForeground(color);
		mastertextfield.setBackground(Color.white);

	}

	public JTextField getMastertextfield() {
		return mastertextfield;
	}
}
