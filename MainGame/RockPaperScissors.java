
// package rockpaperscissorsgame;
/**
 * This was one of the first programs that i Wrote when being a total beginner to Coding. 
 * It is a Rock paper Scissors game in which the player plays With the Computer in a series of best of ten,
 * <p><p>The Player uses the Keys 1,2,3 to choose between the three either Rock Paper Or Scissors;
 * The Computer on the other hand chooses randomly between the 3 and the The one who wins Increases their Winnings.
 * The overall Winner is the one who Reaches to the score of ten First;




 * @author Eric Mwenda...

 * Date.... Friday 9th Nov 2018.... 10:45am.. Created this First game. And many more to come.

 * Venue... Dedan Kimathi University Library. 

 * Enjoy the Game.
 */



import java.util.Scanner;
// import textio.TextIO;

public class RockPaperScissors{
	public static void main(String[] args){
		
		System.out.println("\n\n      Hello Buddy Am a bot, Artificial Intelligence Subject to my creator Eric.");
		System.out.println("      Whats your name please.?");
		
		String userName;
		Scanner dog = new Scanner(System.in);
		userName = dog.nextLine();
		
		System.out.println("\n\n     Its so nice to meet you " +userName);
		System.out.println("     So Today we are going to play a game that Eric Mentored me And i really like it.");
		System.out.println("     Its called Rock Paper Scissors.");
		System.out.println("     Lets see if you can Beat our knowledge "+userName+" LOL.!");
		System.out.println("\n     All you have to do is input the following");
		System.out.println("\n\n\n 	1 For Rock");
		System.out.println("\n        2 For Paper");
		System.out.println("\n        3 For Scissors");
		
		int loop;// This is a flag variable.
		loop = 0;
		
		int counterMe, counterComp;
		counterMe = 0;
		counterComp = 0;
		
		mainLoop: while (loop == 0){ // loop to Ensure that the game is repetitive until either of the players scores 10.
			System.out.println("\n\n\n\n\n\n     What do you choose "+userName+" \n\t(1.Rock)\n\t(2.Paper)\n\t(3.Scissors)??");
			
		
		int userInput;
		Scanner input = new Scanner(System.in);
		userInput = input.nextInt();
		
		while (userInput > 3 || userInput <= 0 ){ //loop to ensure that the number input by the sure is within range 1-3. if else the loop trap to infinity.
			
			System.out.println("Your choice "+userInput+" is not among the choices that are given. Please enter again.");
			userInput = input.nextInt();
		}
		
		
		
		switch (userInput){// Switch whatever the user inputs to the 3 possible outcomes.
			case 1:
			System.out.println("You Chose ROCK.");
			break;
			
			case 2:
			System.out.println("You Chose PAPER.");
			break;
			
			case 3:
			System.out.println("You Chose SCISSORS");
			break;
			
			default:
			System.out.println("Please Choose either of the choices given");
			break;
			
		}
		
		
		
		int compInput;
		compInput = (int)(3*Math.random()+1);// Computer choses any random number between one to three
		
		switch (compInput){ // Switch computer random guess to the possible 3 outcomes.
			case 1:
			System.out.println("\nComputer Chooses ROCK.");
			break;
			
			case 2:
			System.out.println("\nComputer Chooses PAPER.");
			break;
			
			case 3:
			System.out.println("\nComputer Chooses SCISSORS");
			break;
		
		}
		
		if (userInput == compInput){ // boolean for draw.
			
			System.out.println("     .........................................");
			System.out.println("     You Both chose the same thing, the game is a DRAW.");
			System.out.println("     .........................................");
		}
		
		if (userInput == 1 && compInput == 2){ //if statements for all the possible outcomes of the game.
			
			System.out.println("\n     .........................................");
			System.out.println("     Computer wins because PAPER wraps ROCK.");
			System.out.println("     .........................................");
			
			counterComp = counterComp +1;
			
			System.out.println("     computer has won----- "+counterComp+" Round(s)");
			System.out.println("     "+userName+" You have won--------- "+counterMe+" Round(s)");
			System.out.println("     .........................................");
			
			if (counterComp ==10){
				System.out.println("\n\n     .........GAME OVER.........");
				System.out.println("\n     COMPUTER WINS, The COMPUTER beat you to 10 First..");
				
				System.out.println("     .........................................");
				
				System.out.println("\n\n Would you like to Start a new Game "+userName+" ? Yes or No.");
				
				String userChoice;
				
				userChoice = dog.nextLine();
				
				if (userChoice.equalsIgnoreCase("yes")){
					
					System.out.println("\n     The Game Starts. Wishing you all the best "+userName);
					
					counterMe = 0;
					counterComp = 0;
					
					continue mainLoop;
				}
				else {
					
					System.out.println("\n\n     Okay Goodbye for now, be sure to play with me again.");
					System.exit(0);
				}

			}
		
		}
		
		if (userInput == 1 && compInput == 3){
			
			System.out.println("\n     .........................................");
			System.out.println("     You win because ROCK breaks SCISSORS.");
			System.out.println("     .........................................");
			
			counterMe++;
			
			System.out.println("     "+userName+" You have won--------- "+counterMe+" Round(s)");
			System.out.println("     computer has won----- "+counterComp+" Round(s)");
			System.out.println("     .........................................");
			
			if (counterMe ==10){
				System.out.println("\n\n     .........GAME OVER.........");
				System.out.println("\n     YOU WIN, You beat the COMPUTER to 10 First..");
				
				System.out.println("     .........................................");
				
				System.out.println("\n\n Would you like to Start a new Game "+userName+" ? Yes or No.");
				
				String userChoice;
				userChoice = dog.nextLine();
				
				if (userChoice.equalsIgnoreCase("yes")){
					
					System.out.println("\n     The Game Starts. Wishing you all the best "+userName);
					
					counterMe = 0;
					counterComp = 0;
					
					continue mainLoop;
				}
				else{
					
					System.out.println("\n\n     Okay Goodbye for now, be sure to play with me again.");
					System.exit(0);
				}

			}	
			
		
		}
		
		if (userInput == 2 && compInput == 1){
			
			System.out.println("\n     .........................................");
			System.out.println("     You win Because PAPER wraps ROCK");
			System.out.println("     .........................................");
			
			counterMe++;
			
			System.out.println("     "+userName+" You have won--------- "+counterMe+" Round(s)");
			System.out.println("     computer has won----- "+counterComp+" Round(s)");
			System.out.println("     .........................................");
			
			if (counterMe ==10){
				System.out.println("\n\n     .........GAME OVER.........");
				System.out.println("\n     YOU WIN, You beat the COMPUTER  to 10 First..");
				
				System.out.println("     .........................................");
				
				System.out.println("\n\n Would you like to Start a new Game "+userName+" ? Yes or No.");
				
				String userChoice;
				
				userChoice = dog.nextLine();
				
				if (userChoice.equalsIgnoreCase("yes")){
					
					System.out.println("\n     The Game Starts. Wishing you all the best "+userName);
					
					counterMe = 0;
					counterComp = 0;
					
					continue mainLoop;
				}
				else {
					
					System.out.println("\n\n     Okay Goodbye for now, be sure to play with me again.");
					System.exit(0);
				}

				
			}	
			
		
		}
		
		if (userInput == 2 && compInput == 3){
			
			System.out.println("\n     .........................................");
			System.out.println("     Computer wins because SCISSORS cut the PAPER");
			System.out.println("     .........................................");
			
			counterComp = counterComp + 1;
			
			System.out.println("     computer has won----- "+counterComp+" Round(s)");
			System.out.println("     "+userName+" You have won--------- "+counterMe+" Round(s)");
			System.out.println("     .........................................");
			
			if (counterComp ==10){
				System.out.println("\n\n     .........GAME OVER.........");
				System.out.println("\n     COMPUTER WINS, The COMPUTER beat you to 10 First..");
				
				System.out.println("     .........................................");
				
				System.out.println("\n\n Would you like to Start a new Game "+userName+" ? Yes or No.");
				
				String userChoice;
				
				userChoice = dog.nextLine();
				
				if (userChoice.equalsIgnoreCase("yes")){
					
					System.out.println("\n     The Game Starts. Wishing you all the best "+userName);
					
					counterMe = 0;
					counterComp = 0;
					
					continue mainLoop;
				}
				else {
					
					System.out.println("\n\n     Okay Goodbye for now, be sure to play with me again.");
					System.exit(0);
				}	

				
			}	
			
		
		}
		
		if (userInput == 3 && compInput == 1){
			
			System.out.println("\n     .........................................");
			System.out.println("     Computer Wins because ROCK Breaks SCISSORS.");
			System.out.println("     .........................................");
			
			counterComp = counterComp +1;
			
			System.out.println("     computer has won----- "+counterComp+" Round(s)");
			System.out.println("     "+userName+" You have won--------- "+counterMe+" Round(s)");
			System.out.println("     .........................................");
			
			if (counterComp ==10){
				System.out.println("\n\n     .........GAME OVER.........");
				System.out.println("\n     COMPUTER WINS, The COMPUTER beat you to 10 First..");
				
				System.out.println("     .........................................");
				
				System.out.println("\n\n Would you like to Start a new Game "+userName+" ? Yes or No.");
				
				String userChoice;
				
				userChoice = dog.nextLine();
				
				if (userChoice.equalsIgnoreCase("yes")){
					
					System.out.println("\n     The Game Starts. Wishing you all the best "+userName);
					
					counterMe = 0;
					counterComp = 0;
					
					continue mainLoop;
				}
				else {
					
					System.out.println("\n\n     Okay Goodbye for now, be sure to play with me again.");
					System.exit(0);
				}
				
			}	
			
		
		}
		
		if (userInput == 3 && compInput == 2){
			
			System.out.println("\n     .........................................");
			System.out.println("     You win because SCISSORS cut the PAPER");
			System.out.println("     .........................................");
			
			counterMe++;
			
			System.out.println("     "+userName+" You have won--------- "+counterMe+" Round(s)");
			System.out.println("     computer has won----- "+counterComp+" Round(s)");
			System.out.println("     .........................................");
			
			if (counterMe ==10){
				System.out.println("\n\n     .........GAME OVER.........");
				System.out.println("\n     YOU WIN, You beat the COMPUTER to 10 First..");
				
				System.out.println("     .........................................");
				
				System.out.println("\n\n Would you like to Start a new Game "+userName+" ? Yes or No.");
				
				String userChoice;
				
				userChoice = dog.nextLine();

				if (userChoice.equalsIgnoreCase("yes")){
					
					System.out.println("\n     The Game Starts. Wishing you all the best "+userName);
					
					counterMe = 0;
					counterComp = 0;
					
					continue mainLoop;
				}
				else {
					
					System.out.println("\n\n     Okay Goodbye for now, be sure to play with me again.");
					System.exit(0);
				}
				
			}
			
			
		}
		
	}//end of mainLoop while Game-play.
		
	}//end of main().

}//End of pubic class AlgorithmDevelopmentRockPaperScissors



