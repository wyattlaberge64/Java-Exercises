
public class Statistices {
	public static void main(String[] args)
	{
	// 1. Declare 3 int variables for grades and initialize them to 3 values
		int x = 6;
		int y = 9;
		int z = 4;
	// 2. Declare an int variable for the sum of the grades
		int sum = 0;
	// 3. Declare a double variable for the average of the grades
		double ave = 0;
	// 4. Write a formula to calculate the sum of the 3 grades
		sum = x+y+z;
	// 5. Write a formula to calculate the average of the 3 grades from the
	// sum using division and type casting.
		ave = (double) sum/3;
	// 6. Print out the average
		System.out.println("Average = "+ave);
	// 7. Declare a double variable and calculate the variance
		double varnc = (Math.pow((x - ave),2) + Math.pow((y - ave),2) + Math.pow((z - ave),2))/3;
	// 8. Declare a double variable to compute the standard deviation.
		double devia = Math.sqrt(varnc);
	// 9. Print out the variance and standard deviation.
		System.out.println("Variance = "+varnc);
		System.out.println("Standard Deviation = "+devia);
	}
}
