package kenJeZelf.controller;

import kenJeZelf.mian_screen.main_screen_view;

import javax.swing.*;
import java.awt.*;

public class screen_controller {
	private static CardLayout cardLayout;
	private static JPanel mainPanel;

	public void main() {

		// Create a new JFrame (Main Window)
		JFrame frame = new JFrame("Main Window");


		// Set the frame size
		frame.setSize(800,400);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);

		// Specify what happens when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);

		// Create an instance of OtherClass and add its component to the frame
		main_screen_view screenView = new main_screen_view();
		mainPanel.add(screenView.mainScreen(), "main_screen");

		cardLayout.show(mainPanel, "screenmain");
		frame.add(mainPanel);
		frame.setResizable(true);
		frame.setVisible(true);

	}

	public static void showPanel(String panelname) {
		cardLayout.show(mainPanel, panelname);
	}
}