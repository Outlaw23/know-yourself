package kenJeZelf.controller;

import kenJeZelf.analysis_screen.analysis_screen_view;
import kenJeZelf.intro_screen.intro_screen_view;
import kenJeZelf.mian_screen.main_screen_view;
import kenJeZelf.question_screen.question_screen_view;

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
		intro_screen_view introView = new intro_screen_view();
		question_screen_view questionView = new question_screen_view();
		analysis_screen_view analysisView = new analysis_screen_view();
		mainPanel.add(screenView.mainscreen(), "mainscreen");
		mainPanel.add(introView.introscreen(), "introscreen");
		mainPanel.add(questionView.questionscreen(), "questionscreen");
		mainPanel.add(analysisView.analysisscreen(), "analysisscreen");
		// show panel and set resizabel en visble
		cardLayout.show(mainPanel, "mainscreen");
		frame.add(mainPanel);
		frame.setResizable(true);
		frame.setVisible(true);

	}

	public static void showPanel(String panelname) {
		cardLayout.show(mainPanel, panelname);
	}
}