package roshambo.controller;

import roshambo.model.roshambo;
import roshambo.view.roshamboFrame;

public class roshamboController
{
	private roshamboFrame baseFrame;
	
	public roshamboController() {
		baseFrame = new roshamboFrame(this);
	}
	
	public void start() {
		roshambo newGame = new roshambo();
		newGame.PlayGame();
	}

}
