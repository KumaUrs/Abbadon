package TBD;

import java.util.Scanner;

public class MainMenu {

	
	
	
	public void menuSelection() {
		
		
		int sentinalValue = 0;
		try(Scanner input = new Scanner(System.in))
		{
			while(sentinalValue == 0){
				System.out.printf("Prompt user for menu options.");
				String option = input.nextLine();
			switch(option) {
			case "1":
				// create character
			break;
			case "2":
				// delete character
			break;
			case "3":
				// add character to party
				// if party is 6 then do not add and prompt
			break;
			case "4":
				// remove character from party
			break;
			case "5":
				// Load game
			break;
			case "6":
				// continue
			break;
			case "7":
				// exit game
			break;
			default:
				
			}
			}
			
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
	}
	
}
