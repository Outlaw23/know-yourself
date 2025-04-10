package kenJeZelf.model_all;

import javax.swing.*;
import java.awt.*;

public class masterlabel {
	JLabel masterLabel = new JLabel();
	// style from label
	public masterlabel(String text, Color coler) {
		masterLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		masterLabel.setText(text);
		masterLabel.setForeground(coler);
	}
	// get label
	public JLabel getMasterLabel() {
		return masterLabel;
	}

}
