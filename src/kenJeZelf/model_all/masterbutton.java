package kenJeZelf.model_all;


import kenJeZelf.controller.screen_controller;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class masterbutton {

	private JButton masterbutton = new JButton();

	Border borderbutton = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);

	public masterbutton(String name, String panelname, Color coler) {
		masterbutton.setText(name);
		masterbutton.setFocusPainted(false);
		masterbutton.setFont(new Font("Arial", Font.PLAIN, 25));
		masterbutton.setForeground(Color.white);
		masterbutton.setBackground(coler);
		masterbutton.setOpaque(true);
		masterbutton.setBorder(borderbutton);
		masterbutton.setPreferredSize(new Dimension(100, 35));
		masterbutton.addMouseListener(new MouseAdapter() {
			Color coler = masterbutton.getBackground();

			@Override
			public void mouseEntered(MouseEvent e) {
				super.mouseEntered(e);
				coler = masterbutton.getBackground();
				masterbutton.setBackground(new Color(52, 53, 54));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseEntered(e);
				masterbutton.setBackground(coler);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);

			}
		});
		masterbutton.addActionListener(e ->  screen_controller.showPanel(panelname));
	}

	public JButton getMasterbutton() {
		return masterbutton;
	}
}
