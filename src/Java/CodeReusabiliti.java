package Java;

import java.util.Scanner;

public class CodeReusabiliti {

	public static void main(String[] args) {
		welcome();
		//kmts();
	}

	private static void welcome() {
		System.out.println("Welocme please select option");
		System.out.println("1: Enter the input");
		System.out.println("2: Exit");

		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();

		switch (i) {
		case 1:
			execute();
			welcome();
			break;
		case 2:
			System.out.println("Thank you.....");
		}
	}

	private static void execute() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		int Num = scanner.nextInt();
		if (Num % 2 != 0) {
			System.out.println("given number is ODD");
		} else if (Num % 10 == 0) {
			if (Num % 5 == 0 && Num % 3 == 0) {
				System.out.println("even number and divisible by 10 , 5 & 3");
			} else {
				System.out.println("even number and divisible by 10 and not divisible by 5 & 3");
			}
		} 
		else {
			System.out.println("even nuber  not divisible by 10");
		}

	}

}
