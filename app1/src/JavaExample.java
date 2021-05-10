import java.util.Scanner;

public class JavaExample {
	public static void calculate(int p, int t, double r, int n) {
		double amount = p * Math.pow(1 + (r / n), n * t);
		double cinterest = amount - p;
		System.out.println("Compound Interest after " + t + " years: " + cinterest);
		System.out.println("Amount after " + t + " years: " + amount);
	}

	public static void main(String[] args) {
		int principal = 0;
		float time = 0;
		double rate = 0d;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principal");
		principal = scan.nextInt();
		System.out.println("Enter time in years");
		time = scan.nextInt();
		if (time < 1) {
			rate = 3d;
		} else if (time >= 1 && time < 2) {
			rate = 5d;
		} else {
			rate = 7d;
		}

		calculate(2000, 5, 0.8, 12);
		scan.close();
	}
}