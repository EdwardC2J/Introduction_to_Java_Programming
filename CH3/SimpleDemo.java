import java.util.Scanner;

public class SimpleDemo {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number=inputScanner.nextInt();
		if(number%5==0)
			System.out.println("HiFive");
		if(number%2==0)
			System.out.println("HiEven");
	}
}
