import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in double: ");
		double amount = input.nextDouble();

		int remainAmount = (int) (amount * 100);
		int numberOfOneDollars = remainAmount / 100;
		remainAmount = remainAmount % 100;

		int numberOfQuarters = remainAmount / 25;
		remainAmount = remainAmount % 25;

		int numberOfDimes = remainAmount / 10;
		remainAmount = remainAmount % 10;

		int numberOfNickels = remainAmount / 5;
		remainAmount = remainAmount % 5;

		int numberOfPennies = remainAmount;
		System.out.println("Your amount " + amount + " consists of \n" + "\t" + numberOfOneDollars + " dollars\n" + "\t"
				+ numberOfQuarters + " quarters\n" + "\t" + numberOfDimes + " dimes\n" + "\t" + numberOfNickels
				+ " nickels\n" + "\t" + numberOfPennies + " pennies");
	}
}
