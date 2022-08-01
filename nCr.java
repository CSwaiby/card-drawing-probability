// This class is supposed to check the probability of drawing a specific card at least once 
// depending on the size of the deck and how many copies of the specific cards exist in the deck.

import java.util.Scanner;

public class nCr {

	public static double fact(int nbr) { // Factorial recursive function
		if(nbr == 0)
			return 1;
		if(nbr == 1)
			return 1;
		return nbr * fact(nbr-1);
	}
	
	public static double ncr(int n, int r) {
		double num = fact(n);
		double denom = fact(r) * fact(n - r);
		return Math.round((num/denom)*100)/100;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many cards is the deck made out of? ");
		int deck = in.nextInt();
		
		System.out.print("How many copies does the card that you want to draw at least once exist? ");
		int amount = in.nextInt();
		
		System.out.print("How many cards are you drawing? ");
		int draw = in.nextInt();
		
		System.out.println("The probability of drawing at least once your card is " + 
		((double)Math.round((1-ncr((deck-amount),draw)/ncr(deck,draw))*100*100)/100) + "%");
		
		// System.out.println((double)Math.round((1-ncr(17,4)/ncr(20,4))*100*100)/100);
		in.close();
	}
}
