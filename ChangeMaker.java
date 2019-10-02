package WLaberge;

public class ChangeMaker {
	
	public static void main(String[] args) {
		makeChange(1.25, 2.00);
		
	}
	// find the total of the other types of change using division.
	public static void makeChange(double price, double received) {
		double change = price - received;
		int changePennies=(int)change*100;
		for(int i = 0; i < coins.length; i++) {
			allChange[i] = changePennies%coins[i];
		}
		showChange();
	}
	
	private static void showChange() {
		for (int i=0;i<4;i++) {
			System.out.print(allChange[i]);
		}
	}
	
	private static int[] coins = new int[] {25,10,5,1};
	
	private static int[] allChange = new int [] {0, 0, 0, 0};
}