package roshambo.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import roshambo.controller.roshamboController;
import roshambo.model.roshambo;

public class roshamboPanel extends JPanel
{
	private JButton rockBtn;
	private JButton scissorsBtn;
	private JButton paperBtn;
	
	private SpringLayout baseLayout;
	
	private JTextArea displayArea;
	
	private roshambo myGame;
	
	public roshamboPanel(roshamboController controller) {
		rockBtn = new JButton("Rock");
		scissorsBtn = new JButton("Scissors");
		paperBtn = new JButton("Paper");
		
		baseLayout = new SpringLayout();
		
		displayArea = new JTextArea(10,20);
		
		setupPane();
		setupPanel();
		setupListeners();
	}
	
	private void setupPanel() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(baseLayout);
		
		this.add(displayArea);
		this.add(rockBtn);
		this.add(scissorsBtn);
		this.add(paperBtn);
	}
	
	private void setupPane() {
		displayArea.setEditable(false);
		displayArea.setLineWrap(true);
		displayArea.setWrapStyleWord(true);
		displayArea.setBackground(Color.DARK_GRAY);
	}
	
	private void setupListeners() {
		rockBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				myGame.userOption = "Rock";
			}
		});
		
		scissorsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				myGame.userOption = "Scissors";
			}
		});
		
		paperBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				myGame.userOption = "Paper";
			}
		});
	}
}
