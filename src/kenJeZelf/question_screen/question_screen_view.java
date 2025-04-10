package kenJeZelf.question_screen;

import kenJeZelf.model_all.masterbutton;
import kenJeZelf.model_all.masterlabel;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;
import static java.awt.Color.gray;

public class question_screen_view {
	public JPanel questionscreen() {

		// Create a new JPanel
		JPanel panelMain = new JPanel();
		panelMain.setLayout(new BorderLayout());
		panelMain.setPreferredSize(new Dimension(1920, 1080));
		panelMain.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
		panelMain.setBackground(new Color(255, 255, 255));

		// sub panels
		// panel Center
		JPanel panelMainCenter = new JPanel();
		panelMainCenter.setLayout(new GridLayout(6,0,5,5));
		panelMainCenter.setPreferredSize(new Dimension(1920, 500));
		panelMainCenter.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
		panelMainCenter.setBackground(new Color(70, 103, 110));

		// panel North
		JPanel panelMainNorth = new JPanel();
		panelMainNorth.setLayout(new GridLayout(0,10,5,0));
		panelMainNorth.setPreferredSize(new Dimension(1920, 50));
		panelMainNorth.setBorder(BorderFactory.createEmptyBorder(5, 30, 5, 30));
		panelMainNorth.setBackground(new Color(50, 149, 168));

		//labels

		// label title
		masterlabel titel = new masterlabel("question", white);


		// buttons

		// button home
		masterbutton home = new masterbutton("home","mainscreen", gray);

		// button
		masterbutton hado = new masterbutton("intro","introscreen",gray);

		// button
		masterbutton video = new masterbutton("question","questionscreen",darkGray);

		// button
		masterbutton analysis = new masterbutton("analysis","analysisscreen",gray);

		// Add panels main screen
		panelMain.add(panelMainNorth, BorderLayout.NORTH);
		panelMain.add(panelMainCenter, BorderLayout.CENTER);

		// add  o the panel north
		panelMainNorth.add(titel.getMasterLabel());
		panelMainNorth.add(home.getMasterbutton());
		panelMainNorth.add(hado.getMasterbutton());
		panelMainNorth.add(video.getMasterbutton());
		panelMainNorth.add(analysis.getMasterbutton());
		// add to panel center


		// Return the panel to be added to the JFrame
		return panelMain;
	}

}
