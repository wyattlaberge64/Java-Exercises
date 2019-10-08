package WLaberge;

public class ChangeMakerKata {

	public static void main(String[] arg) {
		// call makeChange using pennify to send integer values of doubles for price and amount received
		makeChange(pennify(1.37), pennify(2.00));
	}

	/* 
	 * Find the total of the other types of change using division and modulus.
	 * calls showChange to display result
	 * 
	 * @param what is the price and what are you receiving.
	 * @return none
	 */
	public static void makeChange(int price, int received) {
		//define changePennies as received - price
		int changePennies = received - price;
		// define a for loop to determine amount of change of each coin starting with quarters
		for(int i = 0; i<coins.length; i++) {
			// use Math.floor to determine how many of target coin is part of change
			allChange[i] = (int) Math.floor(changePennies/coins[i]);
			// set changePennies = to modulus(remainder)
			changePennies = changePennies%coins[i];
		}
		showChange();
	}

	/*
	 * Use a for loop to show the amount of each type of change in an array.
	 * 
	 * 
	 * 
	 */
	public static void showChange() {
		for(int i = 0; i<4; i++) {
			System.out.println(allChange[i]);
		}
	}
	/*
	 * Converts a double to an integer.
	 * 
	 * @param
	 * @return pennies
	 */
	private static int pennify(double buckNChange) {
		double pennies = buckNChange * 100;
		System.out.println(pennies);
		return (int) pennies;
	}

	/*
	 * Creates an array that give us the value of each coin type.
	 * 
	 * 
	 * 
	 */
	private static int[] coins = new int[] {25,10,5,1};
	
	/*
	 * Creates an array that we place the exact number of each coin type.
	 * 
	 * 
	 * 
	 */
	private static int[] allChange = new int[] {0,0,0,0};
	
	
}
