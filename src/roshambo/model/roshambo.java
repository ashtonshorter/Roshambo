package roshambo.model;

import java.util.Scanner;

public class roshambo
{	
	private boolean quit;
	
	private int userWins;
	private int computerWins;
	private int ties;
	
	public String userOption;
	private String computerOption;
	
	private Scanner scan;
	
	public roshambo() {
		quit = false;
		scan = new Scanner(System.in);
	}
	
	public void PlayGame() {
		System.out.println("\nEnter an option: Rock, Paper, or Scissors?");
		userOption = scan.nextLine();
		
		ComputerTurn();
		ChooseWinner();
		
		if(!quit) {
			System.out.println("You chose: " + userOption + "\nComputer Chose: " + computerOption + "\n-------------------------------------------");
			
			System.out.println("User Wins: " + userWins);
			System.out.println("Computer Wins: " + computerWins);
			System.out.println("Ties: " + ties + "\n-------------------------------------------");
			
			System.out.println("Press Q to Quit\n-------------------------------------------");
			
			PlayGame();
		}
	}
	
	public String ComputerTurn() {
		int optionNum = (int) (Math.random() * 3);
		
		switch(optionNum) {
			case 0: 
				computerOption = "Rock";
			break;
			
			case 1:
				computerOption = "Paper";
			break;
			
			case 2: 
				computerOption = "Scissors";
			break;
		}
		
		return computerOption;
	}
	
	private void ChooseWinner() {
		if(userOption.equals("Rock") && computerOption.equals("Scissors")) {
			userWins++;
			System.out.println("You win!");
		}
		
		else if(userOption.equals("Rock") && computerOption.equals("Paper")) {
			computerWins++;
			System.out.println("Computer wins!");
		}
		
		else if(userOption.equals("Scissors") && computerOption.equals("Paper")) {
			userWins++;
			System.out.println("You win!");
		}
		
		else if(userOption.equals("Scissors") && computerOption.equals("Rock")) {
			computerWins++;
			System.out.println("Computer wins!");
		}
		
		else if(userOption.equals("Paper") && computerOption.equals("Rock")) {
			userWins++;
			System.out.println("You win!");
		}
		
		else if(userOption.equals("Paper") && computerOption.equals("Scissors")) {
			computerWins++;
			System.out.println("Computer wins!");
		}
		
		else if(userOption.equals("Q")) {
			System.out.println("Quitting....");
			quit = true;
		}
		
		else if (!(userOption.equals("Rock") || userOption.equals("Scissors") || userOption.equals("Paper"))) {
			System.out.println("You must type in a valid answer");
		}
		
		else {
			ties++;
			System.out.println("Its a tie!");
		}
	}
}
