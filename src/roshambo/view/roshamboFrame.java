package roshambo.view;

import javax.swing.JFrame;

import roshambo.controller.roshamboController;

public class roshamboFrame extends JFrame
{
	private roshamboPanel basePanel;
	
	public roshamboFrame(roshamboController controller) {
		basePanel = new roshamboPanel(controller);
	}
	
	private void setupFrame() {
		this.setSize(600,600);
		this.setContentPane(basePanel);
		this.setVisible(true);
	}
}
