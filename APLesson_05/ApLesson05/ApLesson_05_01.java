import java.util.Random;
 public class ApLesson_05_01
{ 
 	public static void main(String[]args) 
	{ 
 		int player = 1 + (int)((Math.random()*6));
 		int computer = 1 + (int)((Math.random()*6));
		
 		String winner =  diceRoll(player, computer); 
		System.out.println("You rolled a " + player); 
		System.out.println("Computer rolled a " + computer); 
		System.out.println("And the winner is " + winner);  
	} 
	
 	public static String diceRoll(int player, int computer)
	{
		String winner = "";
		if (player > computer)  
			winner = "player"; 	 
		if (computer > player) 
			winner = "Computer";  
		return winner;
	} 
} 
